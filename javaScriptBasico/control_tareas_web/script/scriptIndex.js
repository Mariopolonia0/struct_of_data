var dialogo = document.getElementById('DialogNotificacion');
var messageDialog = document.getElementById('messageDialog');
var conternerForm = document.getElementById('containerMain');
var loader = document.getElementById('loader');

dialogo.addEventListener('click', () => dialogo.close());

function login() {
    const nombreUsuarioIngresado = document.getElementById('nombreUsuario').value
    const passwordIngresado = document.getElementById('password').value

    if (nombreUsuarioIngresado == '') {
        messageDialog.innerHTML = "Enter the user";
        dialogo.showModal();
    } else if (passwordIngresado == '') {
        messageDialog.innerHTML = "Enter the password";
        dialogo.showModal();
    } else {
        const data = {
            nombreUsuario: nombreUsuarioIngresado,
            password: passwordIngresado
        };

        const uri = 'https://controltarea.azurewebsites.net/Usuario/login'

        //codigo para mostra  el loading
        conternerForm.style.display = "none";
        loader.style.display = "block";

        fetch(uri, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(data)
        })
            .then((res) => res.json())
            .then(function (dataObject) {

                //codigo para quitar el loading
                conternerForm.style.display = "block";
                loader.style.display = "none";

                if (dataObject.usuarioId == 0) {
                    messageDialog.innerHTML = "Incorrect Login";
                    dialogo.showModal();
                } else {
                    //despues de la ruta del archivo donde vamos a navegar ponemos un ?
                    //para pasar el id del usuario que hizo el login
                    window.location = "ui/listaTarea.html?Id=" + dataObject.usuarioId;
                }

            })
            .catch((error) => {
                messageDialog.innerHTML = "We have this error on the Server : " + error;
                dialogo.showModal();
            })
    }
}
