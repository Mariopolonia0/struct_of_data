var dialogoFormTask = document.getElementById('DialogFormTask');
var dialogoBuscarUsetTask = document.getElementById('DialogBuscarUser');
var dialogMensaje = document.getElementById('dialogMensaje');
var DialogNotificacion = document.getElementById('DialogNotificacion');
var DialogNotificacionOption = document.getElementById('DialogNotificacionOption');//DialogNotificacionOption

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
var progress = false;
var taskProgressId = 0;
var listUser = [];
var idSelectUser = 0;
var _listTask = [];
var tareaId = 0;

llenarNombreUsuario();
obtenerListaOfTarea();

async function obtenerListaOfTarea() {
    var loader = document.getElementById('loader');
    listTask.innerHTML = `   `;
    _listTask = [];
    const uri = 'https://controltarea.azurewebsites.net/api/Tareas/' + userLoginId;

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

            //aqui ponemos el mensaje de que no hay tarea
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

var _fecha = ""

function llenarListTask(task) {
    _listTask.push(task)

    if (_fecha == task.fechaVecimineto) {
        listTask.innerHTML += ` 
        
        <div id="item${task.tareaId}" class="cardTareaItem">
            <div class="cardContenido">
                <div class="divIzquierdaItem">
                    <label class="itemTaskCliente">${task.cliente}</label>
                    <label class="itemTaskDireccion">${task.direccion}</label>
                    <label class="itemTaskDescripcion">${task.descripcion}</label>
                </div>
                <div class="divDerechaItem">
                    <label class="itemTaskFechaVencimiento">${task.fechaVecimineto}</label>
                    <div class="divDerechaItemButton">
                        <button  type="button" class="buttonItem" onclick="starTask(${task.tareaId})">
                            <img id="buttonStarTask${task.tareaId}" class="imgIconButon" src="../icon/play.png" alt="play">
                        </button>
                        <button type="button" class="buttonItem" onclick="selectTarea(${task.tareaId})">
                            <img class="imgIconButon" src="../icon/editar.png" alt="editar">
                        </button>
                    </div>
                </div>
            </div>
            <div id="itemState${task.tareaId}" class="progressText"> 
                <label id="itemStateText${task.tareaId}" class="itemTaskDescripcion"></label>
            </div>
        </div>
    `
    } else {
        listTask.innerHTML += ` 
        <div class="cardItemFecha" >
            <label class="labelItemFecha">${task.fechaVecimineto}</label>
        </div>
        <div id="item${task.tareaId}" class="cardTareaItem">
            <div class="cardContenido">
                <div class="divIzquierdaItem">
                    <label class="itemTaskCliente">${task.cliente}</label>
                    <label class="itemTaskDireccion">${task.direccion}</label>
                    <label class="itemTaskDescripcion">${task.descripcion}</label>
                </div>
                <div class="divDerechaItem">
                    <label class="itemTaskFechaVencimiento">${task.fechaVecimineto}</label>
                    <div id="cardIdButton${task.tareaId}" class="divDerechaItemButton">
                        <button  type="button" class="buttonItem" onclick="starTask(${task.tareaId})">
                            <img id="buttonStarTask${task.tareaId}" class="imgIconButon" src="../icon/play.png" alt="play">
                        </button>
                        <button type="button" class="buttonItem" onclick="selectTarea(${task.tareaId})">
                            <img class="imgIconButon" src="../icon/editar.png" alt="editar">
                        </button>
                    </div>
                </div>
            </div>
            <div id="itemState${task.tareaId}" class="progressText"> 
                <label id="itemStateText${task.tareaId}" class="itemTaskDescripcion"></label>
            </div>
        </div>
    `
    }

    _fecha = task.fechaVecimineto;

    if (task.estado == 'progress')
        setEstado(task.tareaId);

    if (task.estado == 'finish')
        finishTask(task.tareaId);
}

function setEstado(tareaId) {
    const itemId = "item" + tareaId;
    var cardStateTest = document.getElementById("itemState" + tareaId);
    var itemStateText = document.getElementById("itemStateText" + tareaId);
    cardStateTest.style.display = "flex";
    itemStateText.innerText = "Progress";
    taskProgressId = tareaId;
    document.getElementById("buttonStarTask" + tareaId).src = "../icon/pausaIcon.png";
    progress = true;
}

function saveDialogNotificacionOption() {

    finishTask();
    setFinish(taskProgressId);
    taskProgressId = 0;
    progress = false;
}

function finishTask(tareaId) {
    if (taskProgressId == 0)
        taskProgressId = tareaId;

    const itemId = "item" + taskProgressId;
    var cardStateTest = document.getElementById("itemState" + taskProgressId);
    var itemStateText = document.getElementById("itemStateText" + taskProgressId);

    var cardIdButtonId = document.getElementById("cardIdButton" + taskProgressId);
    cardIdButtonId.style.display = "none";

    cardStateTest.style.display = "flex";
    cardStateTest.style.background = "#1815A3";
    itemStateText.innerText = "Finish";
    itemStateText.style.color = "white";
}

async function setFinish(_tareaId) {
    const uri = 'https://controltarea.azurewebsites.net/api/Tareas/ActualizarFinalizar';

    const inputNota = document.getElementById('inputNota');

    var dataEmpezarTask = {
        "id": _tareaId,
        "nota": inputNota.value,
        "fechaTerminada": hoy.toLocaleString(),
        "estado": "finish"
    };

    await fetch(uri, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(dataEmpezarTask)
    }).catch((error) => {
        messageDialog.innerText = "We have this error on the Server : " + error;
        DialogNotificacion.showModal();
    })
}

function starTask(tareaId) {

    if (progress == false) {
        const itemId = "item" + tareaId;
        var cardStateTest = document.getElementById("itemState" + tareaId);
        var itemStateText = document.getElementById("itemStateText" + tareaId);
        cardStateTest.style.display = "flex";
        itemStateText.innerText = "Progress";
        taskProgressId = tareaId;
        document.getElementById("buttonStarTask" + tareaId).src = "../icon/pausaIcon.png";
        progress = true;
        setProgress(tareaId)
    } else {
        if (tareaId == taskProgressId) {
            DialogNotificacionOption.showModal();
        } else {
            messageDialog.innerText = "Esta realizando otra tarea"
            DialogNotificacion.showModal();
        }
    }
}

async function setProgress(_tareaId) {
    const uri = 'https://controltarea.azurewebsites.net/api/Tareas/ActualizarEmpezar';

    var dataEmpezarTask = {
        "id": _tareaId,
        "fechaEmpezar": hoy.toLocaleString(),
        "estado": "progress"
    };

    await fetch(uri, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(dataEmpezarTask)
    }).catch((error) => {
        messageDialog.innerText = "We have this error on the Server : " + error;
        DialogNotificacion.showModal();
    })
}

async function setStop(_tareaId, _fechaEmpezas) {
    const uri = 'https://controltarea.azurewebsites.net/api/Tareas/ActualizarEmpezar';

    var dataEmpezarTask = {
        "id": _tareaId,
        "fechaEmpezar": _fechaEmpezas,
        "estado": "stop"
    };

    await fetch(uri, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(dataEmpezarTask)
    }).catch((error) => {
        messageDialog.innerText = "We have this error on the Server : " + error;
        DialogNotificacion.showModal();
    })
}

function saveLateDialogNotificacionOption() {
    const itemId = "item" + taskProgressId;
    var cardStateTest = document.getElementById("itemState" + taskProgressId);
    var itemStateText = document.getElementById("itemStateText" + taskProgressId);
    document.getElementById("buttonStarTask" + taskProgressId).src = "../icon/play.png";
    cardStateTest.style.display = "none";
    itemStateText.innerText = "";

    var task = _listTask.find((task) => task.tareaId == taskProgressId);
    setStop(taskProgressId, task.fechaEmpezada);
    taskProgressId = 0;
    progress = false;

    cancelDialogNotificacionOption();
}

//listaUsuario()
function listaUsuario() {
    window.location = "listaUsuario.html?Id=" + userLoginId;
}

function salirUsuario() {
    window.location = "../index.html";
}

function selectTarea(_tareaId) {
    clearVariable();

    const tituloForm = document.getElementById('tituloForm');
    tituloForm.innerText = "Edit task";

    var selectTarea = _listTask.find(task => task.tareaId == _tareaId);

    tareaId = _tareaId;
    idSelectUser = selectTarea.usuarioId;

    nombreUserForNewTask.innerText = selectTarea.nombreAndApellido;
    inputDescripcion.value = selectTarea.descripcion;
    inputDireccion.value = selectTarea.direccion;
    inputCliente.value = selectTarea.cliente;
    inputFechaVencimiento.value = formatoFechaSelectTask(selectTarea.fechaVecimineto);

    dialogoFormTask.showModal();
}

function formTask() {
    clearVariable();
    tareaId = 0;

    const tituloForm = document.getElementById('tituloForm');
    tituloForm.innerText = "Register task";

    inputFechaVencimiento.value = hoy.toString();
    dialogoFormTask.showModal();
}

function formatoFechaSelectTask(_fechaVecimineto) {
    var dateDividido = _fechaVecimineto.split('/');
    return dateDividido[2] + '-' + dateDividido[0] + '-' + dateDividido[1]
}

function clearVariable() {
    //tareaId = 0;
    inputFechaVencimiento.value = "";
    nombreUserForNewTask.innerText = "";
    inputDescripcion.value = "";
    inputDireccion.value = "";
    inputCliente.value = "";
    inputFechaVencimiento.value = "";
}

function cancel() {
    dialogoFormTask.close();
}

function cancelBuscarUserForTask() {
    dialogoBuscarUsetTask.close();
}

function cancelNotificacion() {
    DialogNotificacion.close();
}

function cancelDialogNotificacionOption() {
    DialogNotificacionOption.close();
}

function buscarUserForTask() {
    if (tareaId == 0) {
        getUserForTask();
        dialogoBuscarUsetTask.showModal();
    } else {
        messageDialog.innerText = "No puede modificar el usuario de la tarea"
        DialogNotificacion.showModal();
    }
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

    if (tareaId == 0) {
        clearVariable()
    } else {
        messageDialog.innerText = "No puede limpiar todos lo campos"
        DialogNotificacion.showModal();
    }
}

async function savedata() {

    if (validar()) {

        dataTask = {
            "tareaId": tareaId,
            "usuarioId": idSelectUser,
            "descripcion": inputDescripcion.value,
            "cliente": inputCliente.value,
            "notaTerminada": "",
            "fechaEmpezada": "",
            "fechaCreada": hoy.toLocaleDateString("en-US"),
            "fechaTerminada": "",
            "fechaVecimineto": formatoFecha(),
            "direccion": inputDireccion.value,
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
        .then((dataObject) => {
            mostrarDialog(dataObject.dataResult);
            obtenerListaOfTarea();
            cancel();
        })
        .catch((error) => {
            messageDialog.innerText = "We have this error on the Server : " + error;
            DialogNotificacion.showModal();
        })
}

function mostrarDialog(dataResult) {
    var buttonDialogNtificacionId = document.getElementById('buttonDialogNtificacionId');
    buttonDialogNtificacionId.style.background = "#1815A3";
    buttonDialogNtificacionId.innerText = "Aceptar";
    messageDialog.innerText = dataResult;
    DialogNotificacion.showModal();
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

function optionSelectEstadoSelectTask(_value) {

    switch (_value) {
        case "To do": return 2;
        case "Process": return 3;
        case "Finished": return 4;
        default:
            return 1;
    }
}

function validar() {
    if (idSelectUser == 0) {
        messageDialog.innerText = "Seleccione un usuario para asignarle la tarea";
        DialogNotificacion.showModal();
        return false;
    } else if (inputDescripcion.value == "") {
        messageDialog.innerText = "Ingrese una descripcion de la tarea";
        DialogNotificacion.showModal();
        return false;
    } else if (inputFechaVencimiento.value == "") {
        messageDialog.innerText = "Ingrese un fecha";
        DialogNotificacion.showModal();
        return false;
    } else if (inputFechaVencimiento.value == "") {
        messageDialog.innerText = "Ingrese un fecha";
        DialogNotificacion.showModal();
        return false;
    } else if (inputDireccion.value == "") {
        messageDialog.innerText = "Introduzca la direccion";
        DialogNotificacion.showModal();
        return false;
    } else if (inputCliente.value == "") {
        messageDialog.innerText = "Introduzca el cliente";
        DialogNotificacion.showModal();
        return false;
    }

    return true;
}