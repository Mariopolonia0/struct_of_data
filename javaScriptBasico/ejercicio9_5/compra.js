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

function PrintCompra() {
    var compra = JSON.parse(localStorage.getItem('compra'));
    alert(compra.suplidor + " " + compra.empresa);
}
