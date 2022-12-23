package EjercicioKotlin

fun main() {

    //una lista de solo lectura
    val colors = listOf("green", "oragen", "blue")
    val numeros = listOf(1,5,9,8,7,100)

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

