//obtener el valor usuarioId del usuario que esta logueado que se pase por la URL
const urlParams = new URLSearchParams(window.location.search);
const userLoginId = urlParams.get('Id');

function salir() {
    window.location = "listaTarea.html?Id=" + userLoginId;
}

function editarUsuario(){
    window.location = "registroUsuario.html?Id=" + userLoginId;
}