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