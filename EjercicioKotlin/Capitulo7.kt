package EjercicioKotlin

fun main() {
    //ejercicio7_1()
    ejercicio7_2(listaNumero = arrayOf(1, 55, -6, 66, -85, 0, 0))
    println("\n----------------")
    ejercicio7_3()
}

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

private fun ejercicio7_2(listaNumero: Array<Int>) {
    for (item in listaNumero)
        if (item > 0)
            print("$item ")
}

private fun ejercicio7_3() {
    val array4_4 =
        arrayOf(intArrayOf(2, 6, 12, 8), intArrayOf(2, 2, 8, 3), intArrayOf(0, 6, 3, 4), intArrayOf(20, 3, 5, 7))

    for (item in array4_4)
        println(item.contentToString())
}