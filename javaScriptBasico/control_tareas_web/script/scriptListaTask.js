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
const selectOptionEstado = document.getElementById('selectOptionEstado'); //selectOption
const tiempoTranscurrido = Date.now();
const hoy = new Date(tiempoTranscurrido);
var dataTask = {};

//lista para entrar los usuarios para que se pueden seleccionar
var listUser = [];
var idSelectUser = 0;
var _listTask = [];

//obtener el valor usuarioId del usuario que esta logueado que se poso por la URL
const urlParams = new URLSearchParams(window.location.search);
const userLoginId = urlParams.get('Id');

obtenerListaOfTarea();


function obtenerListaOfTarea() {
    //https://controltarea.azurewebsites.net/api/Tareas

    listTask.innerHTML = `   `;
    _listTask = [];
    const uri = 'https://controltarea.azurewebsites.net/api/Tareas';
    //se poner le cursor en progress
    document.documentElement.style.cursor = "progress"

    fetch(uri, {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
        }
    })
        .then((res) => res.json())
        .then(function (dataObject) {
            dataObject.forEach(task => llenarListTask(task))
            //se poner le cursor en default
            document.documentElement.style.cursor = "default"
        })
        .catch((error) => {
            console.log(error)
            alert("Tenemos un error en el Server")
        })
}

function llenarListTask(task) {
    _listTask.push(task)
    listTask.innerHTML += ` 
        <div class="cardTareaItem" onclick="selectTarea(${task.tareaId})">
            <div class="divRowArriba">
                <h3 class="card-title">${task.nombreAndApellido}</h3>
                <h3 class="card-title">${task.fechaVecimineto}</h3>
            </div>
            <div class="divRowAbajo">
                <h3 class="card-title">${task.descripcion}</h3>
                <h3 class="card-title">${task.estado}</h3>
            </div>
        </div>   
    `
}

function selectTarea(tareaId) {
    console.log(tareaId)
}

function formTask() {
    inputFechaVencimiento.value = hoy.toString();
    selectOptionEstado.value = 2;
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

function clean() {

}

//funcion para buscar los usuarios en la api rest
function getUserForTask() {
    contenedorCarta.innerHTML = `   `;
    listUser = [];
    const uri = 'https://controltarea.azurewebsites.net/Usuario/SP';
    //se poner le cursor en progress
    document.documentElement.style.cursor = "progress"

    fetch(uri, {
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
            alert("Tenemos un error en el Server")
        })
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

function savedata() {

    if (validar()) {

        dataTask = {
            "tareaId": 0,
            "usuarioId": idSelectUser,
            "descripcion": inputDescripcion.value,
            "fechaCreada": hoy.toLocaleDateString("en-US"),
            "fechaTerminada": "",
            "fechaVecimineto": inputFechaVencimiento.value,
            "estado": optionSelectEstado()
        }

        enviarDataApi();
    }
}

//https://controltarea.azurewebsites.net/api/Tareas
function enviarDataApi() {
    const uri = 'https://controltarea.azurewebsites.net/api/Tareas';

    fetch(uri, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(dataTask)
    })
        .then((res) => res.json())
        .then(function (dataObject) {
            messageDialog.innerText = dataObject.dataResult
            DialogNotificacion.showModal();
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
    } else if (selectOptionEstado.value == 1) {
        messageDialog.innerText = "Seleccione un estado"
        DialogNotificacion.showModal();
        return false;
    }

    return true;
}