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

    const uri = "http://www.apinomina.somee.com/Usuario/login";

    fetch(uri, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(data)
    })
        .then((res) => res.json())
        .then(function (dataObject) {
            console.log(dataObject)
        })
}
