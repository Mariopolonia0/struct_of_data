class Compra {
    constructor(suplidor, empresa, fecha, total, listaDetalle) {
        this.suplidor = suplidor,
            this.empresa = empresa,
            this.fecha = fecha,
            this.total = total,
            this.listaDetalle = listaDetalle
    }
}

var listDetalle = []
var totalCompras = 0

function SaveCompra() {
    var _suplidor = document.getElementById("suplidor").value
    var _empresa = document.getElementById("empresa").value
    var _fecha = document.getElementById("fecha").value
    var listaCompras = []


    if (validadCompra(_suplidor, _empresa, _fecha)) {
        var compra = new Compra(_suplidor, _empresa, _fecha, totalCompras, listDetalle);

        try {
            listaCompras = JSON.parse(localStorage.getItem('listaCompras'));
            listaCompras.push(compra)
        } catch (error) {
            listaCompras = [];
            listaCompras.push(compra)
            console.info(error)
        }

        localStorage.setItem('listaCompras', JSON.stringify(listaCompras));
        alert("se guardo la compra")
    }
}

function validadCompra(suplidor, empresa, fecha) {
    if (suplidor.length < 3) {
        alert("El suplidor está mal ingresado")
        return false
    }

    if (empresa.length < 3) {
        alert("El empresa está mal ingresado")
        return false
    }

    if (fecha.length == 0) {
        alert("El fecha está mal ingresado")
        return false
    }

    if (listDetalle.length == 0) {
        alert("la lista de compra esta vacia")
        return false
    }

    if (totalCompras == 0) {
        alert("la lista de compra esta vacia")
        return false
    }

    return true
}


function PrintCompra() {

}

function BuscarCompra() {

}

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

//favDialogCompra
var favDialogCompra = document.getElementById('favDialogCompra');

function mostrarCompras() {

    //listaCompras = JSON.parse(localStorage.getItem('listaCompras'));

    const tablaBody = document.getElementById('tbodyCompras');
    var tr = ``
    listaCompras = JSON.parse(localStorage.getItem('listaCompras'))
    listaCompras.map(
        function (compra) {
            var listaTD = `<th><label>${compra.suplidor}</label></th>`
            listaTD += `<th><label>${compra.empresa}</label></th>`
            listaTD += `<th><label>${compra.fecha}</label></th>`
            listaTD += `<th><label>${(compra.total  * 1).toLocaleString("en")}</label></th>`
            tr += `<tr onclick="selectComprar(this)">${listaTD}</tr>`
        }
    )

    tablaBody.innerHTML = tr

    favDialogCompra.showModal();
}

function selectComprar(tr) {
    var data = tr.outerText.split("\t")
    alert(data[0])
    /* favDialog.close()
     document.getElementById("detalleIdProducto").value = data[0]
     document.getElementById("detalleDescripcion").value = data[1]
     document.getElementById("detallePrecio").value = data[4]
     document.getElementById("detalleCantidad").focus()*/
}

function cerrarDialogCompras() {
    favDialogCompra.close();
}