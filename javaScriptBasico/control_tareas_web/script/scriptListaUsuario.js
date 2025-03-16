//obtener el valor usuarioId del usuario que esta logueado que se pase por la URL
const urlParams = new URLSearchParams(window.location.search);
const userLoginId = urlParams.get('Id');
const contenedorCarta = document.getElementById('listCard');

var listUser = [];

function salir() {
    window.location = "listaTarea.html?Id=" + userLoginId;
}

function editarUsuario(usuarioId) {
    //aqui podemos pasar dos id para editar o agregar nuevo usuario
    window.location = "registroUsuario.html?IdLogin=" + userLoginId + "&UsuarioEdit=" + usuarioId;
}

function newUsuario() {
    window.location = "registroUsuario.html?IdLogin=" + userLoginId + "&UsuarioEdit=" + 0;
}

getUserForTask()

function llenarListaUsuarioForTask(user) {


    listUser.push(user)
    var item = ``;

    if (user.usuarioId == userLoginId) {
        item = `
            <div class="cardItemUser" onclick="">
                <h3 class="card-title">${user.nombreAndApellido + " ( Yo )"}</h3>
                <button class="iconButton" type="button" onclick="editarUsuario(${user.usuarioId})">
                    <img class="imgIconButon" src="../icon/editar.png" alt="add">
                </button>
            </div>   
        `
    } else {
        item = `
            <div class="cardItemUser" onclick="">
                <h3 class="card-title">${user.nombreAndApellido}</h3>
                <button class="iconButton" type="button" onclick="editarUsuario(${user.usuarioId})">
                    <img class="imgIconButon" src="../icon/editar.png" alt="add">
                </button>
            </div>   
        `
    }
    contenedorCarta.innerHTML += item;

}

//funcion para buscar los usuarios en la api rest
async function getUserForTask() {
    var loader = document.getElementById('loader');
    loader.style.display = "flex";
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
    loader.style.display = "none";
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