var listaProducto = []

listaProducto = JSON.parse(localStorage.getItem('productos'));

const tablaBody = document.getElementById('tbody');

pintarListaProducto()

function pintarListaProducto() {
    var tr = ``
    listaProducto.map(
        function (producto) {
            var listaTD = `<th><label>${producto.numeroArticulo}</label></th>`
            listaTD += `<th><label>${producto.descripcion}</label></th>`
            listaTD += `<th><label>${producto.cantidad}</label></th>`
            listaTD += `<th style="text-align: right;"><label>${producto.precio}</label></th>`
            tr += `<tr onclick="selectProducto(this)">${listaTD}</tr>`
        });

    tablaBody.innerHTML = tr
}

function selectProducto(tr) {
    var data = tr.outerText.split("\t")
}