package EjercicioKotlin

fun main() {

    //ejercicioLista()
    ejercicio()
}

private fun ejercicio() {
    //transforma cada numero multiplicado por 2
    val array = arrayOf(1, 2, 3).map { n -> n * 2 }
    println(array)

    //buscar los item que sea igual a 6
    val filtro = arrayOf(5, 6, 20, 50, 6, 99).filter { item -> item == 6 }
    println(filtro)

    //encuentra el numero 5 del array
    val find = arrayOf(9, 9, 6, 6, 3, 5, 9, 7).find { item -> item == 5 }
    println(find)

    //en que posicion esta el 5 del array
    //indexOf devuelve -1 si no lo encuentra
    val findIndex = arrayOf(9, 9, 5, 6, 3, 9, 9, 7).indexOf(5)
    println(findIndex)

    //rellena el array de uno
    val fill = arrayOf(9, 9, 5, 6, 3, 9, 9, 7)
    fill.fill(1)
    println(fill.contentToString())

    //el array esta lleno de 1?
    val all = fill.all{ item -> item == 1 }
    println(all)

    //hay algun 2 en el array?
    val contains = fill.contains(2)
    println(contains)
}

private fun ejercicioLista() {
    //una lista de solo lectura
    val colors = listOf("green", "oragen", "blue")
    val numeros = listOf(1, 5, 9, 8, 7, 100)

    //reversed muesta la lista de atras para lante
    println("Reversed list: ${colors.reversed()}")
    println("Reversed list: ${numeros.reversed()}")

    //Sorted ordena la lista de mañor a menor
    println("Sorted list: ${colors.sorted()}")
    println("Sorted list: ${numeros.sorted()}")

    //lista original
    println("List: $colors")
    println("List: $numeros")
}


