//variables del formularios
const name = document.getElementById('name')
const lastName = document.getElementById('lastName')
const userName = document.getElementById('userName')
const codigoEmpresa = document.getElementById('codigoEmpresa')
const password = document.getElementById('password')
const passwordConfirmation = document.getElementById('passwordConfirmation')
const tituloRegistroUsuiario = document.getElementById('tituloRegistroUsuiario')

//obtener el valor usuarioId del usuario que esta logueado que se pase por la URL
const urlParams = new URLSearchParams(window.location.search);
const userLoginId = urlParams.get('IdLogin');
const IdUsedEdit = urlParams.get('UsuarioEdit');

init()

function init() {
    if (IdUsedEdit == 0) {
        tituloRegistroUsuiario.innerText = "Register user"
    } else {
        tituloRegistroUsuiario.innerText = "Edit user"
        buscarUsuario()
    }
}

async function enviarDataToApi() {
    const data = {
        usuarioId: 0,
        nombre: name.value,
        apellido: lastName.value,
        nombreUsuario: userName.value,
        password: password.value,
        codigoEmpresa: codigoEmpresa.value
    };

    const uri = 'https://controltarea.azurewebsites.net/Usuario';

    await fetch(uri, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(data)
    })
        .then((res) => res.json())
        .then(function (dataObject) {
            alert(dataObject.dataResult)
        })
        .catch((error) => {
            console.log(error)
            alert("Tenemos un error en el Server")
        })
}

function cancel() {
    if (userLoginId == null) {
        window.location = "../index.html";
    } else {
        window.location = "listaUsuario.html?Id=" + userLoginId;
    }
}

//'https://controltarea.azurewebsites.net/Usuario/100' 
async function buscarUsuario() {
    var uri = "https://controltarea.azurewebsites.net/Usuario/" + IdUsedEdit;

    await fetch(uri, {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
        }
    })
        .then((res) => res.json())
        .then(function (dataObject) {
            llenarFormulario(dataObject)
        })
        .catch((error) => {
            console.log(error)
            alert("Tenemos un error en el Server")
        })
}

function llenarFormulario(user) {
    name.value = user.nombre
    lastName.value = user.apellido
    userName.value = user.nombreUsuario
    codigoEmpresa.value = user.codigoEmpresa
    password.value = user.password
    passwordConfirmation.value = user.password
    
}

function clean() {
    name.value = "";
    lastName.value = "";
    userName.value = "";
    codigoEmpresa.value = "";
    password.value = "";
    passwordConfirmation.value = "";
}

function savedata() {

    if (!validadData()) {
        return
    }
    enviarDataToApi()
}

function validadData() {
    var esValido = true;

    if (name.value == "") {
        alert("error when saving. I need the name");
        esValido = false;
    }

    else if (lastName.value == "") {
        alert("error when saving. I need the last name");
        esValido = false;
    }

    else if (userName.value == "") {
        alert("error when saving. I need the name user");
        esValido = false;
    }

    else if (codigoEmpresa.value == "") {
        alert("error when saving. I need the license");
        esValido = false;
    }

    else if (password.value == "") {
        alert("error when saving. I need the passwork");
        esValido = false;
    }

    else if (passwordConfirmation.value == "") {
        alert("error when saving. I need the passwork confirmation");
        esValido = false;
    }

    else if (password.value != passwordConfirmation.value) {
        alert("error when saving. Passwords are not equal");
        esValido = false;
    }

    return esValido;
}