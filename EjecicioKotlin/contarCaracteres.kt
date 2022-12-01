package EjecicioKotlin

fun main() {
    println(sumaTablaTres())
    println(sumaTablaTresWhile())
//    cantidadCaracter("abcdefd")
//    println(mayorCuatroNumero(5, 6, 9, 8))
//    println(mayorCuatroNumero(8, 10, 6, 2))
}

//2.5. Diseñar un algoritmo que visualice y sume la serie de
//números 3, 6, 9, 12…, 99.
private fun sumaTablaTres(): Double {
    var suma = 0.0

    for (contador in 1..33) {
        suma += (3 * contador)
    }

    return suma
}

private fun sumaTablaTresWhile(): String {

    var veces = 0
    var suma = 1

    while (veces <= 33) {
        suma += (3 * veces)
        veces++
    }

    return suma.toString()
}

//2.6. Escribir un algoritmo que lea cuatro números
// y a continuación visualice el mayor de los cuatro.
private fun mayorCuatroNumero(numeroUno: Int, numeroDos: Int, numeroTres: Int, numeroCuatro: Int): Int {
    var numeroMayor = 0

    if (numeroMayor < numeroUno) {
        numeroMayor = numeroUno
    }

    if (numeroMayor < numeroDos) {
        numeroMayor = numeroDos
    }

    if (numeroMayor < numeroTres) {
        numeroMayor = numeroTres
    }

    if (numeroMayor < numeroCuatro) {
        numeroMayor = numeroCuatro
    }

    return numeroMayor
}

//    "abcdefd"
//    [1, 1, 1, 2, 1, 1]
private fun cantidadCaracter(cadena: String) {
    val cantidadLetras = mutableListOf<Int>()
    var contador = 0
    while (contador < cadena.length - 1) {
        var contador2 = contador + 1
        var numeroLetra = 1

        while (contador2 < cadena.length) {
            if (cadena[contador] == cadena[contador2])
                numeroLetra++
            contador2++
        }
        cantidadLetras.add(numeroLetra)
        contador++
    }
    println(cantidadLetras)
}