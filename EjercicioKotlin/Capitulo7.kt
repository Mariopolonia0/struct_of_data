package EjercicioKotlin

fun main() {
    ejercicio7_5(arrayOf(4, 6, 9, 8, 5, 6, 2))
    ejercicio7_5(arrayOf(14, 16, 12, 12, 10, 18,20,14))
}

// Cálculo de la suma de todos los elementos de un vector, así como la media aritmética
private fun ejercicio7_5(array: Array<Int>) {
    var suma = 0
    for (item in array) {
        suma += item
    }
    println("la suma es $suma y la media aritmética ${suma / array.size}")
}












/*
 * Leer una matriz de 3 por 3 elementos y calcular la
 * suma de cada una de sus filas y columnas, dejando
 * dichos resultados en dos vectores, uno de la suma de
 * las filas y otro de las columnas.
 */
private fun ejercicio7_4() {
    val array = arrayOf(
        intArrayOf(2, 9, 8),
        intArrayOf(3, 6, 5),
        intArrayOf(4, 6, 9)
    )
    var suma: Int = 0

    println("----filas--")
    for (positionUno in 0..array.size - 1) {
        suma = 0
        for (positionDos in 0..array.size - 1) {

            if (array.size - 1 == positionDos)
                print("${array[positionUno][positionDos]}")
            else
                print("${array[positionUno][positionDos]}+")

            suma += array[positionUno][positionDos]
        }
        print(" = $suma\n")
    }

    println("----columnas--")
    for (positionUno in 0..array.size - 1) {
        suma = 0
        for (positionDos in 0..array.size - 1) {

            if (array.size - 1 == positionDos)
                print("${array[positionDos][positionUno]}")
            else
                print("${array[positionDos][positionUno]}+")

            suma += array[positionDos][positionUno]
        }
        print(" = $suma\n")
    }
}

/*
 *   Determinar los valores de I, J, después de la ejecución
 *   de las instrucciones siguientes
 */
private fun ejercicio7_1() {
    val arrayEntero = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var I = 1
    var J = 2

    println("${arrayEntero[I]} --- ${arrayEntero[J]}")
    arrayEntero[I] = J
    arrayEntero[J] = I

    println("${arrayEntero[I]} --- ${arrayEntero[J]}")
    arrayEntero[J + I] = I + J
    I = arrayEntero[I] + arrayEntero[J]

    arrayEntero[3] = 5
    J = arrayEntero[I] - arrayEntero[J]
    println("${arrayEntero[I]} --- ${arrayEntero[J]}")
}

/*
 * Escribir el algoritmo que permita obtener el número
 * de elementos positivos de una tabla.
 */
private fun ejercicio7_2(listaNumero: Array<Int>) {
    for (item in listaNumero)
        if (item > 0)
            print("$item ")
}

/*
 * Rellenar una matriz identidad de 4 por 4.
 */
private fun ejercicio7_3() {
    val array4_4 =
        arrayOf(intArrayOf(2, 6, 12, 8), intArrayOf(2, 2, 8, 3), intArrayOf(0, 6, 3, 4), intArrayOf(20, 3, 5, 7))

    for (item in array4_4)
        println(item.contentToString())
}
