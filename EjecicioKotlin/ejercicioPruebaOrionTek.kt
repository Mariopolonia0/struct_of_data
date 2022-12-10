package EjecicioKotlin

import java.util.*

//Parejas que suman igual
//Escribir un método que retorne/imprima la lista de parejas que sumados (cada numero separado por una coma)
// sean igual a el resultado esperado
//
//Ejemplo:
//target = 5
//numbers=[1,4,5,0]
//
//1,4
//5,0

fun main() {
    val numbers = Arrays.asList(1, 4, 5, 0, 5)
    val numberos = arrayOf(1, 5, 6, -2, -9, 6, 0,5)
    determinarPasitivosNegativos(numberos)
    pairOfSumToTarget(numbers, 5).forEach { println(it) }
    println(sumarLista(numbers))
    quitarNumeroRepetido(numberos)

}

private fun quitarNumeroRepetido(numeros: Array<Int>) {
    var contador = 0

    while (contador < numeros.size) {
        var contador2 = 0

        while (contador2 < numeros.size) {
            if (contador != contador2){
                if (numeros[contador2] == numeros[contador])
                    numeros[contador2] = 0
            }
            contador2++
        }
        contador++
    }

    for (item in numeros)
        println(item)
}

private fun determinarPasitivosNegativos(listaNumero: Array<Int>) {

    for (item in listaNumero)
        if (item >= 0)
            println("$item es positivo")
        else
            println("$item es negativo")
}

private fun sumarLista(numbers: List<Int>): Int {
    var contador = 0
    var suma = 0

    while (contador < numbers.size) {
        suma += numbers[contador]
        contador++
    }
    return suma
}

private fun pairOfSumToTarget(numbers: List<Int>, target: Int): List<String?> {
    val sizeNumbers = numbers.size - 2
    var contador = 0
    val listParejas = mutableListOf<String>()

    while (contador <= sizeNumbers) {

        val contador2 = contador + 1
        val suma = numbers[contador] + numbers[contador2]

        if (suma == target)
            listParejas.add("${numbers[contador]},${numbers[contador2]}")

        contador++
    }

    return listParejas
}