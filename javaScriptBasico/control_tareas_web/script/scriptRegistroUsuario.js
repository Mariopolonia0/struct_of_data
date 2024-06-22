//variables del formularios
var nombreUsuario = document.getElementById('nombreUsuario')
var lastName = document.getElementById('lastName')
var usarName = document.getElementById('usarName')
var license = document.getElementById('license')
var password = document.getElementById('password')
var passwordConfirmation = document.getElementById('passwordConfirmation')

function cancel() {
    window.location = "../index.html";
}

function clean() {
    nombreUsuario.value = "";
    lastName.value = "";
    usarName.value = "";
    license.value = "";
    password.value = "";
    passwordConfirmation.value = "";
}

function savedata() {

}