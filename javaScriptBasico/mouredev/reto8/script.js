var semilla = new Date().getTime().toString().slice(-2);
var hasta = 0;
var numero = 0;
var numeroDos = 0;
var contador = 0;

hasta = parseInt(prompt('¿Cuántos números aleatorios se imprimirán?'));

while (contador < hasta) {
  numero = (5 * semilla + 7) % 8;
  numeroDos = numero * 8;

  if (numeroDos > 0 && numeroDos < 100) {
    document.getElementById('output').innerHTML += numeroDos + '<br>';
    contador++;
  }

  semilla = numero;
}