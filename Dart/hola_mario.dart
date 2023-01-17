//import 'package:hola_mario/hola_mario.dart' as hola_mario;
import 'dart:io';

List<int> listnumero = [2, 3, 5, 5, 8, 8, 5];
//ejemplo de map
Map<int, String> mapcliente = {1: 'Ramon', 2: 'Francisco', 3: 'Juan'};

main() {
  print('..............');
  print(holaMario());
  print('..............');
  print('Lista CLiente');

  //recorre la lista del map
  mapcliente.forEach((key, value) {
    print("$key....$value");
  });

  //ejemplo de tabla de multiplicacion
  stdout.write("cual tabla de multiplicacion quiere inprimir : ");
  String? numerodigitado = stdin.readLineSync();
  int numero = int.parse(numerodigitado.toString());
  print('..............');
  print('Tabla de multiplicacion del $numero');
  for (int i = 0; i <= 10; i++) {
    print('$i * $numero = ${i * numero}');
  }

  print('..............');
  sumar(50, 10);
}

//funcion sumar
sumar(int numero1, int numero2) {
  print("la sumar es : ${numero1 + numero2}");
}

//funcion con retorno
String holaMario() {
  return 'Hola Mario';
}

//Clase
class Cliente {
  int idCliente = 0;
  String Nombre = " ";

  Cliente(int _idCliente, String _Nombre) {
    this.Nombre = _Nombre;
    this.idCliente = _idCliente;
  }
}
