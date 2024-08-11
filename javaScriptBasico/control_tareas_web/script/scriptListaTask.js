var dialogoFormTask = document.getElementById('DialogFormTask');
var dialogoBuscarUsetTask = document.getElementById('DialogBuscarUser');
var DialogNotificacion = document.getElementById('DialogNotificacion');
const messageDialog = document.getElementById('messageDialog');//messageDialog
const contenedorCarta = document.getElementById('listCard');
const nombreUserForNewTask = document.getElementById('nombreUserForNewTask');
const bodyMain = document.getElementById('bodyMain');//bodyMain
const inputDescripcion = document.getElementById('inputDescripcion');//inputDescripcion
const inputFechaVencimiento = document.getElementById('inputFechaVencimiento'); //inputFechaVencimiento
const selectOptionEstado = document.getElementById('selectOptionEstado'); //selectOption

//lista para entrar los usuarios para que se pueden seleccionar
var listUser = [];
var idSelectUser = 0;

//obtener el valor usuarioId del usuario que esta logueado que se poso por la URL
const urlParams = new URLSearchParams(window.location.search);
const userLoginId = urlParams.get('Id');

function formTask() {
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

function cancelNotificacion(){
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
        const tiempoTranscurrido = Date.now();
        const hoy = new Date(tiempoTranscurrido);

        var dataTask = {
            "tareaId": 0,
            "usuarioId": idSelectUser,
            "descripcion": inputDescripcion.value,
            "fechaCreada": hoy.toDateString(),
            "fechaTerminada": "string",
            "fechaVecimineto": inputFechaVencimiento.value,
            "estado": "string"
        }
    }

}

function validar() {
    if (idSelectUser == 0) {
        messageDialog.innerText = "Seleccione un usuario para asignarle la tarea"
        DialogNotificacion.showModal(); 
    }
}