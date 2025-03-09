//obtener el valor usuarioId del usuario que esta logueado que se pase por la URL
const urlParams = new URLSearchParams(window.location.search);
const userLoginId = urlParams.get('Id');
const contenedorCarta = document.getElementById('listCard');
var listUser = [];

function salir() {
    window.location = "listaTarea.html?Id=" + userLoginId;
}

function editarUsuario() {
    window.location = "registroUsuario.html?Id=" + userLoginId;
}

getUserForTask()

function llenarListaUsuarioForTask(user) {
    listUser.push(user)
    contenedorCarta.innerHTML += ` 
        <div class="cardItemUser" onclick="userSelect(${user.usuarioId})">
            <h3 class="card-title">${user.nombreAndApellido}</h3>
        </div>   
    `
}

//funcion para buscar los usuarios en la api rest
async function getUserForTask() {
    contenedorCarta.innerHTML = `   `;
    listUser = [];
    var usuario = await buscarUsuario();

    if (usuario.codigoEmpresa == "")
        return

    const uri = 'https://controltarea.azurewebsites.net/Usuario/' + usuario.codigoEmpresa;
    //se poner le cursor en progress
    document.documentElement.style.cursor = "progress"

    await fetch(uri, {
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
        })
}

async function buscarUsuario() {

    const uri = 'https://controltarea.azurewebsites.net/Usuario/' + userLoginId;
    var usuario;

    await fetch(uri, {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
        }
    })
        .then((res) => res.json())
        .then(function (dataObject) {
            usuario = dataObject;
        })
        .catch((error) => {
            console.log(error)
        })

    return usuario;
}
