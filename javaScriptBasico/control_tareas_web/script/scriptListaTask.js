var dialogoFormTask = document.getElementById('DialogFormTask');
var dialogoBuscarUsetTask = document.getElementById('DialogBuscarUser');
const contenedorCarta = document.getElementById('listCard');

dialogoBuscarUsetTask.onpen
function formTask() {
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


function clean() {

}


function savedata() {

}

function getUserForTask() {
    //https://controltarea.azurewebsites.net/Usuario/SP

    const uri = 'https://controltarea.azurewebsites.net/Usuario/SP';
    contenedorCarta.innerHTML = ` 
          
        `

    fetch(uri, {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
        }
    })
        .then((res) => res.json())
        .then(function (dataObject) {
            dataObject.forEach(element => llenarListaUsuarioForTask(element))
        })
        .catch((error) => {
            console.log(error)
            alert("Tenemos un error en el Server")
        })
}

function llenarListaUsuarioForTask(element) {


    contenedorCarta.innerHTML += ` 
    <div class="cardItemUser" onclick="probando(${element.usuarioId})">
        <h3 class="card-title">${element.nombreAndApellido}</h3>
    </div>     
    `

}

function probando(numero){
    alert(numero);
}
