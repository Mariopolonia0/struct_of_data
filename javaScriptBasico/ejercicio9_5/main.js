class Producto {
    constructor(numeroArticulo, descripcion, nivelMinimo, precio) {
        this.numeroArticulo = numeroArticulo,
            this.descripcion = descripcion,
            this.nivelMinimo = nivelMinimo,
            this.precio = precio
    }
}

class Venta {
    constructor(cliente, tipoVenta) {
        this.cliente = cliente,
            this.tipoVenta = tipoVenta
    }
}

class Compra {
    constructor(suplidor, empresa) {
        this.suplidor = suplidor,
            this.empresa = empresa
    }
}

var listaProducto = []
const tablaBody = document.getElementById('tbody');

try {
    listaProducto = JSON.parse(localStorage.getItem('producto'));
    listaProducto.map(
        function (producto) {
            var listaTD = `<th>${producto.numeroArticulo}</th>`
            listaTD += `<th>${producto.descripcion}</th>`
            listaTD += `<th>${producto.nivelMinimo}</th>`
            listaTD += `<th>${producto.precio}</th>`
            tablaBody.innerHTML += `<tr>${listaTD}</tr>`
        });
} catch (error) {
    alert("la lista esta vacia");
    listaProducto = [];
}

function SaveProducto() {
    var _numeroArticulo = document.getElementById("numeroArticulo").value
    var _descripcion = document.getElementById("descripcion").value
    var _nivelMinimo = document.getElementById("nivelMinimo").value
    var _precio = document.getElementById("precio").value

    listaProducto.push(new Producto(_numeroArticulo, _descripcion, _nivelMinimo, _precio))
    localStorage.setItem('producto', JSON.stringify(listaProducto));
    alert("Producto Guardado")
}

function NewProducto() {
    alert("New Producto")
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

function SaveCompra() {
    var _suplidor = document.getElementById("suplidor").value
    var _empresa = document.getElementById("empresa").value
    var compra = new Compra(_suplidor, _empresa);
    localStorage.setItem('compra', JSON.stringify(compra));
}

function PrintCompra() {
    var compra = JSON.parse(localStorage.getItem('compra'));
    alert(compra.suplidor + " " + compra.empresa);
}