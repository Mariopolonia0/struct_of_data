var dialogoFormTask = document.getElementById('DialogFormTask');
var dialogoBuscarUsetTask = document.getElementById('DialogBuscarUser');
var DialogNotificacion = document.getElementById('DialogNotificacion');
const messageDialog = document.getElementById('messageDialog');//messageDialog
const contenedorCarta = document.getElementById('listCard');
const listTask = document.getElementById('listTask');//containerListTask
const nombreUserForNewTask = document.getElementById('nombreUserForNewTask');
const bodyMain = document.getElementById('bodyMain');//bodyMain
const inputDescripcion = document.getElementById('inputDescripcion');//inputDescripcion
const inputFechaVencimiento = document.getElementById('inputFechaVencimiento'); //inputFechaVencimiento
const inputCliente = document.getElementById('inputCliente'); //inputFechaVencimiento

const inputDireccion = document.getElementById('inputDireccion'); //inputDireccion
const tiempoTranscurrido = Date.now();
const hoy = new Date(tiempoTranscurrido);

var dataTask = {};
//obtener el valor usuarioId del usuario que esta logueado que se pase por la URL
const urlParams = new URLSearchParams(window.location.search);
const userLoginId = urlParams.get('Id');

//lista para entrar los usuarios para que se pueden seleccionar
var optionEstado = "to do"
var listUser = [];
var idSelectUser = 0;
var _listTask = [];
var tareaId = 0;

llenarNombreUsuario();
obtenerListaOfTarea();
//bueno


async function obtenerListaOfTarea() {
    var loader = document.getElementById('loader');
    listTask.innerHTML = `   `;
    _listTask = [];
    const uri = 'https://controltarea.azurewebsites.net/api/Tareas/' + userLoginId;
    
    console.log(uri)


    loader.style.display = "flex";

    await fetch(uri, {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
        }
    })
        .then((res) => res.json())
        .then(function (dataObject) {
            loader.style.display = "none";
            dataObject.forEach(task => llenarListTask(task))

            //aqui ponermos el mensaje de que no hay tarea
            if (dataObject.length == 0) {
                var labelInfo = document.getElementById('labelInfo');
                labelInfo.style.display = "flex";
            } else {
                var labelInfo = document.getElementById('labelInfo');
                labelInfo.style.display = "none";
            }
        })
        .catch((error) => {
            alert("Tenemos un error en el Server")
        })
}

async function llenarNombreUsuario() {
    var usuario = await buscarUsuario()
    document.getElementById('nombreUsuario').innerHTML = `<b> ${usuario.nombre} tasks </b>`;
}

function buscarFiltrado() {
    var buttonDialogNtificacionId = document.getElementById('buttonDialogNtificacionId');
    buttonDialogNtificacionId.style.background = "#1815A3";
    messageDialog.innerText = "En la próxima actualización ";
    DialogNotificacion.showModal();
}

function llenarListTask(task) {
    _listTask.push(task)
    listTask.innerHTML += ` 
        <div class="cardTareaItem">
            <div class="divIzquierdaItem">
                <label class="itemTaskDireccion">${task.direccion}</label>
                <label class="itemTaskDescripcion">${task.descripcion}</label>
            </div>
            <div class="divDerechaItem">
                <label class="itemTaskFechaVencimiento">${task.fechaVecimineto}</label>
                <div class="divDerechaItemButton">
                    <button type="button" class="buttonItem" onclick="">
                        <img class="imgIconButon" src="../icon/play.png" alt="play">
                    </button>
                    <button type="button" class="buttonItem" onclick="selectTarea(${task.tareaId})">
                        <img class="imgIconButon" src="../icon/editar.png" alt="editar">
                    </button>
                <div>
            </div>
        </div>   
    `
}

function selectTarea(_tareaId) {
    clearVariable();

    var selectTarea = _listTask.find(task => task.tareaId == _tareaId)
    tareaId = _tareaId;
    idSelectUser = selectTarea.usuarioId;

    inputFechaVencimiento.value = selectTarea.fechaVecimineto;
    nombreUserForNewTask.innerText = selectTarea.nombreAndApellido;
    inputDescripcion.value = selectTarea.descripcion;
    inputDireccion.value = selectTarea.direccion;
    inputCliente.value = selectTarea.cliente;
    inputFechaVencimiento.value = formatoFechaSelectTask(selectTarea.fechaVecimineto);

    dialogoFormTask.showModal();
}

function formatoFechaSelectTask(_fechaVecimineto) {
    var dateDividido = _fechaVecimineto.split('/');
    return dateDividido[2] + '-' + dateDividido[0] + '-' + dateDividido[1]
}

function clearVariable() {
    tareaId = 0;
    idSelectUser = 0;
    inputFechaVencimiento.value = "";
    nombreUserForNewTask.innerText = "";
    inputDescripcion.value = "";
    inputDireccion.value = "";
    inputCliente.value = "";
    inputFechaVencimiento.value = "";
}

function optionSelectEstadoSelectTask(_value) {

    switch (_value) {
        case "To do": return 2;
        case "Process": return 3;
        case "Finished": return 4;
        default:
            return 1;
    }
}

function formTask() {
    clearVariable();
    inputFechaVencimiento.value = hoy.toString();
    dialogoFormTask.showModal();
}

function cancel() {
    dialogoFormTask.close();
}

function buscarUserForTask() {
    getUserForTask();
    dialogoBuscarUsetTask.showModal();
}

function cancelBuscarUserForTask() {
    dialogoBuscarUsetTask.close();
}

function cancelNotificacion() {
    DialogNotificacion.close();
}


//funcion para buscar los usuarios en la api rest
async function getUserForTask() {
    contenedorCarta.innerHTML = `   `;
    listUser = [];
    var usuario = await buscarUsuario();

    if (usuario.codigoEmpresa == "")
        return

    const uri = 'https://controltarea.azurewebsites.net/Usuario/' + usuario.codigoEmpresa;
    //se poner le cursor en progress
    document.documentElement.style.cursor = "progress"

    await fetch(uri, {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
        }
    })
        .then((res) => res.json())
        .then(function (dataObject) {
            dataObject.forEach(user => llenarListaUsuarioForTask(user))
            //se poner le cursor en default
            document.documentElement.style.cursor = "default"
        })
        .catch((error) => {
            console.log(error)
        })
}

async function buscarUsuario() {

    const uri = 'https://controltarea.azurewebsites.net/Usuario/' + userLoginId;
    var usuario;

    await fetch(uri, {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
        }
    })
        .then((res) => res.json())
        .then(function (dataObject) {
            usuario = dataObject;
        })
        .catch((error) => {
            console.log(error)
        })

    return usuario;
}

function llenarListaUsuarioForTask(user) {
    listUser.push(user)
    contenedorCarta.innerHTML += ` 
        <div class="cardItemUser" onclick="userSelect(${user.usuarioId})">
            <h3 class="card-title">${user.nombreAndApellido}</h3>
        </div>   
    `
}

function userSelect(id) {
    var usedSelect = listUser.find(user => user.usuarioId == id)
    nombreUserForNewTask.innerText = usedSelect.nombreAndApellido;
    idSelectUser = id;
    cancelBuscarUserForTask();
}

function clean() {

}

async function savedata() {
    if (validar()) {

        dataTask = {
            "tareaId": tareaId,
            "usuarioId": idSelectUser,
            "descripcion": inputDescripcion.value,
            "notaTerminada": "",
            "fechaEmpezada": "",
            "fechaCreada": hoy.toLocaleDateString("en-US"),
            "fechaTerminada": "",
            "fechaVecimineto": formatoFecha(),
            "direccion": inputDireccion.value,
            "cliente": inputCliente.value,
            "estado": optionEstado
        }

        await enviarDataApi();
    }
}

function formatoFecha() {
    var date = inputFechaVencimiento.value;
    var dateDividido = date.split('-');
    return dateDividido[1] + '/' + dateDividido[2] + '/' + dateDividido[0]
}

async function enviarDataApi() {
    const uri = 'https://controltarea.azurewebsites.net/api/Tareas';

    await fetch(uri, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(dataTask)
    })
        .then((res) => res.json())
        .then(function (dataObject) {
            var buttonDialogNtificacionId = document.getElementById('buttonDialogNtificacionId');
            buttonDialogNtificacionId.style.background = "#1815A3";
            buttonDialogNtificacionId.innerText = "Aceptar";
            messageDialog.innerText = dataObject.dataResult;
            DialogNotificacion.showModal();
            obtenerListaOfTarea();
            cancel();
        })
        .catch((error) => {
            messageDialog.innerText = "We have this error on the Server : " + error;
            DialogNotificacion.showModal();
        })
}

function optionSelectEstado() {

    switch (selectOptionEstado.value) {
        case '2': return "To do";
        case '3': return "Process";
        case '4': return "Finished";
        default:
            return "select";
    }
}

function validar() {
    if (idSelectUser == 0) {
        messageDialog.innerText = "Seleccione un usuario para asignarle la tarea"
        DialogNotificacion.showModal();
        return false;
    } else if (inputDescripcion.value == "") {
        messageDialog.innerText = "Ingrese una descripcion de la tarea"
        DialogNotificacion.showModal();
        return false;
    } else if (inputFechaVencimiento.value == "") {
        messageDialog.innerText = "Ingrese un fecha"
        DialogNotificacion.showModal();
        return false;
    } else if (inputFechaVencimiento.value == "") {
        messageDialog.innerText = "Ingrese un fecha"
        DialogNotificacion.showModal();
        return false;
    } else if (inputDireccion.value == "") {
        messageDialog.innerText = "Introduzca la direccion"
        DialogNotificacion.showModal();
        return false;
    } else if (inputCliente.value == "") {
        messageDialog.innerText = "Introduzca la cliente"
        DialogNotificacion.showModal();
        return false;
    }

    return true;
}