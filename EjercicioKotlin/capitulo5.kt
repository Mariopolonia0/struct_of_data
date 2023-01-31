package EjercicioKotlin

fun main() {
    ejercicio5_5()
    //ejercicio5_5()
    //ejercicio5_16()
    //ejercicio5_14()
    // ejercicio5_13()
    //ejercicio5_9()
    //ejercicio5_7()
    //ejercicio5_8()
    //ejercicio5_6()
    //println(ejercicio5_1(lista = listOf(6, 11, 7)).toString())
    //println(ejercicio5_1(lista = listOf(3, 7, 5, 13, 20, 23, 39, 23, 40, 23, 14, 12, 56, 23, 29)).toString())
}

/*
 * Imprimir una tabla de multiplicar como
 * 1 2 3 4 ... 15
 * ** ** ** ** ** ... **
 * 1* 1 2 3 4 ... 15
 * 2* 2 4 6 8 ... 30
 * 3* 3 6 9 12 ... 45
 * 4* 4 8 12 16 ... 60
 * .
 * 15* 15 30 45 60 ... 225
 */
private fun ejercicio5_16() {
    for (contadorUno in 1..1500) {
        for (contadorDos in 1..1500) {
            print("${contadorUno * contadorDos} ")
        }
        println("")
    }
}


//Un capital C está situado a un tipo de interés R.
//¿Al término de cuántos años se doblará?
private fun ejercicio5_14() {
    var capital = 0.0
    var interes = 0

    print("Digite Capital:")
    capital = readln().toDouble()
    print("Digite Interés:")
    interes = readln().toInt()

    var calculo = 0.0
    var tiempo = 1

    while ((capital * 2) >= calculo) {
        calculo = capital * (1 + interes / 100) * tiempo
        tiempo++
    }

    print("en $tiempo años se doblo el capital")

}

//Se pretende leer todos los empleados de una empresa
//—situados en un archivo EMPRESA— y a la terminación
//de la lectura del archivo se debe visualizar
//un mensaje «existen trabajadores mayores de 65
//años en un número de ...» y el número de trabajadores mayores de 65 años.
private fun ejercicio5_13() {
    var terminar = false
    var totalTrabajadore = 0
    var trabajadoresMayor = 0

    do {
        menu5_13()
        if (readln().toInt() == 1) {

            println("Registro De Trabajador")
            print("Digite Nombre :")
            readln()
            print("Digite Edad: ")
            val edad = readln().toInt()
            totalTrabajadore++
            if (edad > 65)
                trabajadoresMayor++

        } else
            terminar = true

    } while (!terminar)

    println("Resultado")
    println("Total de trabajadores:$totalTrabajadore")
    println("Total de trabajadores mayor a 64 : $trabajadoresMayor")
}

private fun menu5_13() {
    println("\nOpciones")
    println("1.Digitar trabajador")
    println("3.Terminar")
    print("Seleccione opcion:")
}

private fun ejercicio5_9() {
    var terminar = false
    var numeroExistenteA = 0
    var numeroExistenteB = 0

    print("Digite Precio Del Articulo A:")
    val precioArticuloA = readln().toInt()

    print("Digite Precio Del Articulo B:")
    val precioArticuloB = readln().toInt()

    do {
        menu5_9()
        val seleccion = readln().toInt()

        when (seleccion) {
            1 -> {
                numeroExistenteA++
            }

            2 -> {
                numeroExistenteB++
            }

            3 -> {
                terminar = true
            }
        }
    } while (!terminar)

    println("Total numero de articulo A: $numeroExistenteA")
    println("Total numero de articulo B: $numeroExistenteB")
    val totaImporteA = numeroExistenteA * precioArticuloA
    val totaImporteB = numeroExistenteB * precioArticuloB
    println("Total de importe articulo A: $totaImporteA")
    println("Total de importe articulo B: $totaImporteB")
}

private fun menu5_9() {
    println("\nOpciones")
    println("1.Articulo A")
    println("2.Articulo B")
    println("3.Terminar")
    print("Seleccione opcion:")
}

private fun ejercicio5_7() {

    var terminar = false
    do {
        menu5_7()
        if (readln().toInt() == 1) {
            print("\nDigite Nota:")
            val notaDigitada = readln().toInt()
            if (notaDigitada >= 7 && notaDigitada < 9)
                println("Esta nota es NOTABLES")
        } else
            terminar = true

    } while (terminar == false)
}

private fun menu5_7() {
    println("\nOpciones")
    println("1.Digita Estudiante")
    println("2.Terminar")
    print("Seleccione opcion:")
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

//Imprimir todos los números par entre 2 y 500
//inclusive.
private fun ejercicio5_5() {

    for (contador in 2..120)
        if (contador % 2 == 0)
            print("$contador ")

    println()

    for (contador in 2..120) {
        if (numeroEsPrimo(contador))
            print("$contador ")
    }

    //if (contador % 2 != 0 && contador % 3 != 0 && contador % 5 != 0 && contador % 7 != 0 && contador % 11 != 0 )

}

fun numeroEsPrimo(numero: Int): Boolean {
    var contado = 2

    if (numero == 2) return true
    if (numero % 2 == 0) return false

    while (contado * contado <= numero) {
        contado++
        if (numero % contado == 0)
            return false
    }
    return true
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