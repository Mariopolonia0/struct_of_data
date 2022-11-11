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
    pairOfSumToTarget(numbers, 5).forEach{ println(it) }
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