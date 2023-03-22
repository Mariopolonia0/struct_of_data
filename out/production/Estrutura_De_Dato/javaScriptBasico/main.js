
const buchua = document.getElementById("buchua")

buchua.innerHTML = "<h3>klk ya si</h3>"

let nombre = "Mario";
let edad = 24;

const NACIMIENTO = 1998;

console.log(NACIMIENTO)

alert("Hola : " + nombre)

if (edad > 20) {
    alert(nombre + " es mayor")
} else {
    alert(nombre + " es menor")
}

for (let contador = 1; contador <= 3; contador++) {
    console.log("hola " + contador)
    buchua.innerHTML += `<h5>numero ${contador}</h5>`
}

function addContent(newContent) {
    buchua.innerHTML += newContent
}

addContent("hola klk");

let array = [5, 6, 9, 52, 65,900];

console.log(array)
console.log(array[2])


for (let contador = 0; contador < array.length; contador++) {
    addContent("<p>" + "item:" + contador + " = " + array[contador] + "</p>")
}