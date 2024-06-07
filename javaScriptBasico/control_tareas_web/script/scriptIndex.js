function login() {

    const nombreUsuarioIngresado = document.getElementById('nombreUsuario').value
    const passwordIngresado = document.getElementById('password').value

    if (nombreUsuarioIngresado == '' || passwordIngresado == '') {
        alert("Campos estan vacio")
        return
    }

    const data = {
        nombreUsuario: nombreUsuarioIngresado,
        password: passwordIngresado
    };

    const uri = 'http://www.apinomina.somee.com/Usuario/login';

    fetch(uri, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(data)
    })
        .then((res) => res.json())
        .then(function (dataObject) {

            alert(dataObject.usuarioId)

            if (dataObject.usuarioId == 0) {
                alert("login incorrecto")
            } else {
                window.location = "ui/listaTarea.HTML";
            }

        })
        .catch((error) => {
            console.log(error)
            alert("Tenemos un error en el Server")
        })
}

/*
const uri = 'http://www.apinomina.somee.com/api/Books';


fetch(uri)
.then((response) => response.json())
.then(function (dataObject) {
    console.log(dataObject[0].bookId)
    alert
})
.catch(error => document.getElementById("username").value = error);
*/