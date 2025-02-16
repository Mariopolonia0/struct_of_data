//variables del formularios
const name = document.getElementById('name')
const lastName = document.getElementById('lastName')
const userName = document.getElementById('userName')
const license = document.getElementById('license')
const password = document.getElementById('password')
const passwordConfirmation = document.getElementById('passwordConfirmation')

function enviarDataToApi() {
    const data = {
        usuarioId: 0,
        nombre: name.value,
        apellido: lastName.value,
        nombreUsuario: userName.value,
        password: password.value,
        numeroLicencia: license.value
    };

    const uri = 'https://controltarea.azurewebsites.net/Usuario';

    fetch(uri, {
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
    window.location = "../index.html";
}

function clean() {
    name.value = "";
    lastName.value = "";
    userName.value = "";
    license.value = "";
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

    else if (license.value == "") {
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