var dialogo = document.getElementById('DialogNotificacion');
var messageDialog = document.getElementById('messageDialog');

dialogo.addEventListener('click', () => dialogo.close());

function login() {
    const nombreUsuarioIngresado = document.getElementById('nombreUsuario').value
    const passwordIngresado = document.getElementById('password').value

    if (nombreUsuarioIngresado == '' || passwordIngresado == '') {
        messageDialog.innerHTML = "Campos estan vacio";
        dialogo.showModal();
    } else {
        const data = {
            nombreUsuario: nombreUsuarioIngresado,
            password: passwordIngresado
        };

        const uri = 'https://controltarea.azurewebsites.net/Usuario/login';

        fetch(uri, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(data)
        })
            .then((res) => res.json())
            .then(function (dataObject) {

                if (dataObject.usuarioId == 0) {
                    messageDialog.innerHTML = "login incorrecto";
                    dialogo.show();
                } else {
                    window.location = "ui/listaTarea.html"; //listaTarea.Html
                }

            })
            .catch((error) => {
                messageDialog.innerHTML = "Tenemos este error en el Server : " + error;
                dialogo.show();
            })
    }
}
