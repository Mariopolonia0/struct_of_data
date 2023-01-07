package EjercicioKotlin

fun main() {
    //  ejercicio5_5()
    ejercicio5_8()
    // ejercicio5_6()
//    println(ejercicio5_1(lista = listOf(6, 11, 7)).toString())
//    println(ejercicio5_1(lista = listOf(3, 7, 5, 13, 20, 23, 39, 23, 40, 23, 14, 12, 56, 23, 29)).toString())
}

//Ejercicio 5.8
//Leer 100 números. Determinar la media de los números positivos
//y la media de los números negativos.
private fun ejercicio5_8() {
    var cantidadNumero = 0
    var cantidadNumeroNegativo = 0
    var sumaNumero = 0
    var sumaNumeroNegativo = 0

    for (contador in 1..10) {

        print("Digite Un Numero:")
        val numeroDigitado = readln().toInt()

        if (numeroDigitado >= 0) {
            cantidadNumero++
            sumaNumero += numeroDigitado
        } else {
            cantidadNumeroNegativo++
            sumaNumeroNegativo += numeroDigitado
        }
    }

    val mediaNumeroPositivo = sumaNumero / cantidadNumero
    val mediaNumeroNegativo = sumaNumeroNegativo / cantidadNumeroNegativo

    println("\nMedia de numero positivo: $mediaNumeroPositivo")
    println("\nMedia de numero negativo: $mediaNumeroNegativo")
}

//Determinar la media de una lista indefinida de números
private fun ejercicio5_1(lista: List<Int>): Double {
    var total = 0

    for (numero in lista) {
        total += numero
    }

    return (total / lista.size).toDouble()
}

//Imprimir todos los números primos entre 2 y 1.000
//inclusive.
private fun ejercicio5_5() {

    for (contador in 2..1000)
        if (contador % 2 == 0)
            print("$contador ")

}

//Se desea leer las calificaciones de una clase de informática
//y contar el número total de aprobados (5 o mayor que 5)
private fun ejercicio5_6() {
    var terminar = false
    var numeroAprobado = 0

    do {

        menu()
        if (readln().toInt() == 1) {
            print("Digite la nota:")
            if (readln().toInt() >= 5) {
                numeroAprobado++
            }
        } else {
            terminar = true
        }

    } while (terminar == false)

    println("Total de aprobados = $numeroAprobado")
}

private fun menu() {
    println("\n")
    println("Opciones")
    println("1.Digita Nota")
    println("2.Terminar")
    print("Seleccione opcion:")
}