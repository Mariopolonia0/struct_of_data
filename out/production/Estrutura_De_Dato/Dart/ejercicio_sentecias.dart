import 'dart:math';

void main(List<String> args) {
  anguloEsRecto(80);
  BinarioDecimal("10101100");
}

void BinarioDecimal(String binario) {
  num decimal = 0;
  int elevar = 0;

  for (int contador = binario.length - 1; contador >= 0; contador--) {
    if (int.parse(binario[contador]) == 1) {
      decimal = decimal + pow(2, elevar);
    } else if (int.parse(binario[contador]) != 0) {
      print("Ingrese un numero Binario");
      return;
    }
    elevar++;
  }
  print("El numero BINARIO es $binario y convertido a Decimal es $decimal");
}

void anguloEsRecto(int angulo) {
  if (angulo == 90)
    print("El ángulo de $angulo es un ángulo recto");
  else
    print("El ángulo de $angulo no es un ángulo recto");
}
