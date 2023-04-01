class Estudiante {
    constructor(nombre, calificacion) {
        this.nombre = nombre,
        this.calificacion = calificacion
    }
}

function probando() {
    var data = document.getElementById("input").value
    var estudiante = new Estudiante(data, 500);
    localStorage.setItem('a', JSON.stringify(estudiante));
}

function printLocal() {
    var klk = JSON.parse(localStorage.getItem('a'));
    alert(klk.nombre);
}

