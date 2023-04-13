class Compra {
    constructor(suplidor, empresa) {
        this.suplidor = suplidor,
            this.empresa = empresa
    }
}

function SaveCompra() {
    var _suplidor = document.getElementById("suplidor").value
    var _empresa = document.getElementById("empresa").value
    var compra = new Compra(_suplidor, _empresa);
    localStorage.setItem('compra', JSON.stringify(compra));
}

var listDetalle = []
var totalCompras = 0

/*
function buscarProducto() {
    var _idProducto = document.getElementById("detalleIdProducto").value
    var encotrado = false

    if (ValidarDetalle(_idProducto)) {
        var listaProducto = JSON.parse(localStorage.getItem('productos'))
        listaProducto.map(
            function (producto) {
                if (producto.numeroArticulo == _idProducto) {
                    document.getElementById("detalleDescripcion").value = producto.descripcion
                    document.getElementById("detallePrecio").value = producto.precio
                    document.getElementById("detalleCantidad").focus()
                    encotrado = true
                }
            }
        )

        if (!encotrado)
            alert("Agregue el producto en el registro de producto")
    }

}
*/

function agregarDetalle() {
    var _idProducto = document.getElementById("detalleIdProducto").value
    var _cantidad = document.getElementById("detalleCantidad").value
    var encotrado = false

    if (ValidarDetalle(_idProducto) && ValidarCantidad(_cantidad)) {
        var listaProducto = JSON.parse(localStorage.getItem('productos'))
        listaProducto.map(
            function (producto) {
                if (producto.numeroArticulo == _idProducto) {
                    producto.cantidad = _cantidad
                    listDetalle.push(producto)
                    totalCompras += producto.cantidad * producto.precio
                    document.getElementById("totalCompras").innerHTML = totalCompras.toLocaleString("en")
                    encotrado = true
                    pintarListaProducto()
                }
            }
        )

        if (!encotrado) {
            alert("Agregue el producto en el registro de producto")
        } else {
            limpiarCampoDetalle()
        }
    }
}

function pintarListaProducto(producto) {
    const tablaBody = document.getElementById('tbody');
    var tr = ``
    listDetalle.map(
        function (producto) {
            var listaTD = `<th><label>${producto.numeroArticulo}</label></th>`
            listaTD += `<th><label>${producto.descripcion}</label></th>`
            listaTD += `<th><label>${producto.cantidad}</label></th>`
            listaTD += `<th style="text-align: right;"><label>${(producto.precio * 1).toLocaleString("en")}</label></th>`
            listaTD += `<th style="text-align: right;"><label>${(producto.precio * producto.cantidad).toLocaleString("en")
                }</label></th>`
            tr += `<tr onclick="selectProducto(this)">${listaTD}</tr>`
        });

    tablaBody.innerHTML = tr
}

function limpiarCampoDetalle() {
    document.getElementById("detalleIdProducto").focus()
    document.getElementById("detalleIdProducto").value = ""
    document.getElementById("detalleDescripcion").value = ""
    document.getElementById("detallePrecio").value = ""
    document.getElementById("detalleCantidad").value = ""
}

function ValidarDetalle(_idProducto) {
    if (_idProducto.length == 0) {
        alert("El id producto esta vacio")
        return false
    }

    if (!(/^[0-9]+$/).test(_idProducto)) {
        alert("el id producto tiene letra ")
        return false
    }

    return true
}

function ValidarCantidad(cantidad) {
    if (cantidad.length == 0) {
        alert("la cantidad esta vacia")
        return false
    }

    if (!(/^[0-9]+$/).test(cantidad)) {
        alert("cantidad tiene letra ")
        return false
    }

    return true
}

var favDialog = document.getElementById('favDialog');

function buscarProducto() {

    //tbodyProducto
    const tablaBody = document.getElementById('tbodyProducto');
    var tr = ``
    var listaProducto = JSON.parse(localStorage.getItem('productos'))
    listaProducto.map(
        function (producto) {
            var listaTD = `<th><label>${producto.numeroArticulo}</label></th>`
            listaTD += `<th><label>${producto.descripcion}</label></th>`
            listaTD += `<th><label>${producto.nivelMinimo}</label></th>`
            listaTD += `<th><label>${producto.cantidad}</label></th>`
            listaTD += `<th style="text-align: right;"><label>${(producto.precio * 1).toLocaleString("en")
                }</label></th>`
            tr += `<tr onclick="selectProducto(this)">${listaTD}</tr>`

        }
    )

    tablaBody.innerHTML = tr

    favDialog.showModal();
}

function selectProducto(tr) {
    var data = tr.outerText.split("\t")
    favDialog.close()
    document.getElementById("detalleIdProducto").value = data[0]
    document.getElementById("detalleDescripcion").value = data[1]
    document.getElementById("detallePrecio").value = data[4]
    document.getElementById("detalleCantidad").focus()
}

function cerrarDialog() {
    favDialog.close()
}