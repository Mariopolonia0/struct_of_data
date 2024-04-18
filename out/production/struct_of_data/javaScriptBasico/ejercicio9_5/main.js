class Producto {
    constructor(numeroArticulo, descripcion, nivelMinimo, precio, cantidad) {
        this.numeroArticulo = numeroArticulo
        this.descripcion = descripcion
        this.nivelMinimo = nivelMinimo
        this.precio = precio
        this.cantidad = cantidad
    }
}

class Venta {
    constructor(cliente, tipoVenta) {
        this.cliente = cliente,
            this.tipoVenta = tipoVenta
    }
}

var listaProducto = []
const tablaBody = document.getElementById('tbody');

llenarListaProducto()

function llenarListaProducto() {
    try {
        listaProducto = JSON.parse(localStorage.getItem('productos'));

        pintarListaProducto()

        if (listaProducto.length == 0)
            alert("la lista esta vacia");


    } catch (error) {
        var _productoHtlm = document.getElementById('productoHtlm');

        if (_productoHtlm != null)
            alert("la lista esta vacia : " + error);//productoHtlm

        listaProducto = [];
    }
}

function pintarListaProducto() {
    var tr = ``
    listaProducto.map(
        function (producto) {
            var listaTD = `<th><label>${producto.numeroArticulo}</label></th>`
            listaTD += `<th><label>${producto.descripcion}</label></th>`
            listaTD += `<th><label>${producto.nivelMinimo}</label></th>`
            listaTD += `<th><label>${(producto.precio * 1).toLocaleString("en") }</label></th>`
            tr += `<tr onclick="selectProducto(this)">${listaTD}</tr>`
        });

    tablaBody.innerHTML = tr
}

function selectProducto(tr) {
    var data = tr.outerText.split("\t")
    document.getElementById("numeroArticulo").value = data[0]
    document.getElementById("descripcion").value = data[1]
    document.getElementById("nivelMinimo").value = data[2]
    document.getElementById("precio").value = data[3]
}

function SaveProducto() {
    var _numeroArticulo = document.getElementById("numeroArticulo").value
    var _descripcion = document.getElementById("descripcion").value
    var _nivelMinimo = document.getElementById("nivelMinimo").value
    var _precio = document.getElementById("precio").value

    if (validar(_numeroArticulo, _nivelMinimo, _precio)) {
        var encotrado = false
        for (var contador = 0; contador <= listaProducto.length - 1; contador++) {

            if (listaProducto[contador].numeroArticulo == _numeroArticulo) {
                encotrado = true
                listaProducto[contador].descripcion = _descripcion
                listaProducto[contador].nivelMinimo = _nivelMinimo
                listaProducto[contador].precio = _precio
            }
        }

        if (!encotrado)
            listaProducto.push(new Producto(_numeroArticulo, _descripcion, _nivelMinimo, _precio, 0))

        localStorage.setItem('productos', JSON.stringify(listaProducto));

        alert("Producto Guardado")
        pintarListaProducto()
        NewProducto()
    }
}

function validar(numeroArticulo, nivelMinimo, precio) {
    if (!(/^[0-9]+$/).test(numeroArticulo) || numeroArticulo.length == 0) {
        alert("El id producto esta mal ingresado")
        return false
    }

    if (!(/^[0-9]+$/).test(nivelMinimo)) {
        alert("El nivel minimo esta mal ingresado")
        return false
    }

    if (!(/^[0-9]+$/).test(precio)) {
        alert("El precio esta mal ingresado")
        return false
    }

    return true
}

function NewProducto() {
    document.getElementById("numeroArticulo").value = ""
    document.getElementById("descripcion").value = ""
    document.getElementById("nivelMinimo").value = ""
    document.getElementById("precio").value = ""
}

function DeleteProducto() {
    var _numeroArticulo = document.getElementById("numeroArticulo").value

    if (_numeroArticulo.length == 0) {
        alert("Ingrese un id producto para eliminarlo")
    } else {
        for (var contador = 0; contador <= listaProducto.length - 1; contador++) {

            if (listaProducto[contador].numeroArticulo == _numeroArticulo) {
                if (contador == 0) {
                    listaProducto.shift();
                } else {
                    listaProducto.splice(contador, contador)
                }
            }
        }

        localStorage.setItem('productos', JSON.stringify(listaProducto));
        alert("Producto Eliminado")
        llenarListaProducto()
        NewProducto()
    }
}

function SaveVenta() {
    var _cliente = document.getElementById("cliente").value
    var _tipoVenta = document.getElementById("tipoVenta").value
    var venta = new Venta(_cliente, _tipoVenta);
    localStorage.setItem('venta', JSON.stringify(venta));
}



function PrintVenta() {
    var venta = JSON.parse(localStorage.getItem('venta'));
    alert(venta.cliente + " " + venta.tipoVenta);
}