package EjercicioKotlin

fun main() {
    //ejercicio7_9(6)
    //ejercicio7_7(
    //    arrayOf(
    //        intArrayOf(5, 5, 6, 9),
    //        intArrayOf(2, 2, 6, 9),
    //        intArrayOf(2, 5, 3, 9),
    //        intArrayOf(2, 5, 6, 5),
    //    )
    //)
    //ejercicio7_6(arrayOf(-5, -9, 9, 0, 5, 6, 2))
    //println("\n----------------")
    //ejercicio7_6(arrayOf(4, -6, 9, 0, 5, 0, 0))
    //ejercicio7_5(arrayOf(4, 6, 9, 8, 5, 6, 2))
    //ejercicio7_5(arrayOf(14, 16, 12, 12, 10, 18, 20, 14))
    //ejercicio7_1()
    //ejercicio7_2(listaNumero = arrayOf(1, 55, -6, 66, -85, 0, 0))
    //println("\n----------------")
    //ejercicio7_3()
    //ejercicio7_4()
    //ejercicio7_10()
    //ejercicio7_12()
//    ejercicio7_13(arrayOf(10, 20, 22, 22, 23, 18, 19))
//    ejercicio7_13(arrayOf(6, 11, 18, 20, 19))
//    ejercicio7_15(arrayOf(6, 11, 18, 20, 19))
//    ejercicio7_15(arrayOf(10, 2, 3))
    //ejercicio7_19(arrayOf(-6, 0, 20, 20, -6))
    //ejercicio7_11()
    ejercicio7_21()
}

// 7.21. Una empresa tiene diez almacenes y necesita crear
// un algoritmo que lea las ventas mensuales de los diez
// almacenes, calcular la media de ventas y obtener un
// listado de los almacenes cuyas ventas mensuales son
// superiores a la media
private fun ejercicio7_21() {
    val ventas = readLine()!!.split(" ").map { it.toInt() }
    var suma = 0

    ventas.map {
        suma += it
    }

    val media = suma / ventas.size

    println("la media de ventas es : $media")
    print("ventas mayor a la media : ")

    ventas.map {
        if (it > media)
            print("$it,")
    }
}

// 7.11. Cada alumno de una clase de licenciatura en Ciencias de la Computación tiene notas correspondientes
// a ocho asignaturas diferentes, pudiendo no tener
// califica ción en alguna asignatura. A cada asignatura
// le corresponde un determinado coeficiente. Escribir
// un algoritmo que permita calcular la media de cada
// alumno.
// Modificar el algoritmo para obtener las siguientes medias:
// • general de la clase
// • de la clase en cada asignatura
// • porcenaje de faltas (no presentado a examen)
private fun ejercicio7_11() {

    print("introduzca el numero de asignatura del alumno:")
    val numeroAsignatura = readLine()!!.toInt()
    val notasAsignaturas = Array(numeroAsignatura) { Array(4) { 0 } }
    val notasAsignaturasNombre = Array(numeroAsignatura) { "" }

    for (item in 0..numeroAsignatura - 1) {

        print("\nIngrese el nombre de la asignatura:")
        notasAsignaturasNombre[item] = readLine()!!.toString()

        print("Ingrese Nota Examen 1:")
        notasAsignaturas[item][0] = readLine()!!.toInt()

        print("Ingrese Nota Examen 2:")
        notasAsignaturas[item][1] = readLine()!!.toInt()

        print("Ingrese Nota Examen 3:")
        notasAsignaturas[item][2] = readLine()!!.toInt()

        print("Ingrese Nota de participacion:")
        notasAsignaturas[item][3] = readLine()!!.toInt()
    }

    var mediaTotal = 0
    var porcentajeFaltas = 0
    for (item in 0..numeroAsignatura - 1) {
        val nota =
            notasAsignaturas[item][0] + notasAsignaturas[item][1] + notasAsignaturas[item][2] + notasAsignaturas[item][3]
        val media = nota / 4
        mediaTotal += nota

        notasAsignaturas[item].map {
            if (it == 0)
                porcentajeFaltas++
        }

        print("\n\nMateria :${notasAsignaturasNombre[item]}, Examen 1: ${notasAsignaturas[item][0]}, ")
        print("Examen 2: ${notasAsignaturas[item][1]}, Examen 3: ${notasAsignaturas[item][2]}, ")
        print("Asistencia: ${notasAsignaturas[item][3]}, nota: $nota, media de la nota: $media")
    }

    println("/n media de todas las notas : ${mediaTotal / numeroAsignatura}")

    val totalNota = 3 * numeroAsignatura
    println("total porcenaje de faltas: ${(porcentajeFaltas * 100) / totalNota}")
}

//  7.19. Escribir un algoritmo que permita sumar el número
//  de elementos positivos y el de negativos de una tabla
//  T de n filas y m columnas.
private fun ejercicio7_19(array: Array<Int>) {
    var sumaPositivos = 0
    var sumaNegativo = 0

    array.map {
        if (it > 0)
            sumaPositivos += it
        else
            sumaNegativo += it
    }

    print("suma de los positivos : $sumaPositivos, suma de los negativos : $sumaNegativo")
}

//Escribir el algoritmo que permita escribir el contenido de una tabla de dos dimensiones (3 × 4)
private fun ejercicio7_17() {
    val array = arrayOf(
        Array(3) { 0 },
        Array(3) { 0 },
        Array(3) { 0 },
        Array(3) { 0 }
    )

    val contador = array.size - 1

    for (it in 0..contador) {
        println("")

        val contadorDos = array[contador].size - 1

        for (item in 0..contadorDos) {
            print("ingrese la posicion [$it][$item] : ")
            array[it][item] = readLine()!!.toInt()
        }
    }

    array.map {
        print("\n")
        it.map {
            print(" $it")
        }
    }
}


//Dada una lista L de N elementos, diseñar un algoritmo
//que calcule de forma independiente la suma de
//los números pares y la suma de los números impares.
//Diseñar un algoritmo que calcule el mayor valor de
//una lista L de N elementos
private fun ejercicio7_15(array: Array<Int>) {
    var sumaImpares = 0
    var sumaPares = 0
    var suma = 0

    array.map { item ->
        suma += item
        if (item % 2 == 0)
            sumaPares += item
        else
            sumaImpares += item
    }

//    for (item in array) {
//        suma += item
//        if (item % 2 == 0)
//            sumaPares += item
//        else
//            sumaImpares += item
//    }

    println(array.contentToString())
    print("suma de los pares :$sumaPares \nsuma de los Impares:$sumaImpares   \nsuma de todos :$suma\n\n")

}

//Se dispone de N temperaturas almacenadas en un
//array. Se desea calcular su media y obtener el número
//de temperaturas mayores o iguales que la media
private fun ejercicio7_13(array: Array<Int>) {
    var suma = 0

    for (item in array) {
        suma += item
    }

    val media = suma / array.size

    println("las temperaturas son: ${array.contentToString()}")
    println("la media es : $media")

//  val result = arrayOf(Array(array.size, { 0 }), Array(array.size, { 0 }))
    print("temperatura mayor a la media: ")
    array.filter { it > media }.map { print("$it ") }

    print("\ntemperatura menor a la media: ")
    array.filter { it < media }.map { print("$it ") }

//    for (item in 0..array.size - 1)
//        if (media < array[item])
//            result[0][item] = array[item]
//        else
//            result[1][item] = array[item]

//    println("las temperaturas son:${array.contentToString()}")
//    println("la media es : $media")
//
//    print("temperatura mayor a la media: ")
//    result[0].filter { it != 0 }.map { print("$it ") }
//
//    println("")
//    print("temperatura menores a la media: ")
//    result[1].filter { it != 0 }.map { print("$it ") }

    println("\n\n")
}


//Escribir un algoritmo que permita calcular el cuadrado
//de los 100 primeros números enteros y a continuación
//escribir una tabla que contenga dichos cuadrados.
private fun ejercicio7_12() {

    var contador = 1

    println("Estos son los cuadrados")

    for (item in 1..100) {
        if (contador > 10) {
            contador = 1
            println()
        }

        contador++
        print("$item=${item * item}, ")
    }
}

/*
 * Se desea realizar un algoritmo que permita controlar
 * las reservas de plazas de un vuelo MADRID-CARACAS, de acuerdo con las siguientes normas de la
 * compañía aérea:
 *
 * Número de plazas del avión: 300.
 * Plazas numeradas de 1 a 100: fumadores.
 * Plazas numeradas de 101 a 300: no fumadores.
 *
 * Se debe realizar la reserva a petición del pasajero y cerrar la reserva cuando no haya plazas libres o
 * el avión esté próximo a despegar. Como ampliación
 * de este algoritmo, considere la opción de anulaciones imprevistas de reservas
 */

private fun ejercicio7_10() {
    var avionLLeno = false
    var numeroMontadosFumadores = 0
    var numeroMontadosNoFumadores = 0

    while (!avionLLeno) {

        if (numeroMontadosFumadores >= 100 && numeroMontadosNoFumadores >= 300)
            avionLLeno = true


        when (rand(1, 3)) {
            1 -> {
                println("\nopcion seleccionada: Reserva en plaza de fumadores")
                if (numeroMontadosFumadores >= 100) {
                    println("no hay reserva disponible en la plaza fumadora")
                } else {
                    println("Reserva realizada en la plaza fumadora")
                    numeroMontadosFumadores++
                }
            }

            2 -> {
                println("\nopcion seleccionada: Reserva en la plaza de no fumadores")
                if (numeroMontadosFumadores >= 100) {
                    println("no hay reserva disponible en la plaza de no fumadora")
                } else {
                    println("Reserva realizada en la plaza no fumadora")
                    numeroMontadosNoFumadores++
                }
            }

            3 -> {
                if (rand(1, 2) == 1) {
                    println("\nopcion seleccionada: cancelar reserva en la plaza de fumadores")
                    println("elimina una reserva en la plaza de fumadora")
                    numeroMontadosFumadores--
                } else {
                    println("\nopcion seleccionada: cancelar reserva en la plaza de no fumadores")
                    println("elimina una reserva en la plaza de no fumadora")
                    numeroMontadosNoFumadores--
                }
            }
        }
    }
}

/*
 * Se dispone de una lista (vector) de N elementos. Se
 * desea diseñar un algoritmo que permita insertar el
 * valor x en el lugar k-ésimo de la mencionada lista.
 *
 * k-ésimo es el mayor de la lista en excel = K.ESIMO.MAYOR(A1:A10, 1)
 */
private fun ejercicio7_9(numero: Int) {
    val lista = arrayOf(2, 6, 9, 8, 6, 5)
    var mayor = 0
    var posicionMayor = 0

    for (contador in 0..lista.size - 1) {
        if (lista[contador] > mayor) {
            mayor = lista[contador]
            posicionMayor = contador
        }
    }
    print(lista.contentToString())
    print(" el valor k-esimo es : ${lista[posicionMayor]} ")
    lista[posicionMayor] = numero
    println("y se cambio por el numero ingresado que es : ${lista[posicionMayor]}")
}

/*
 * 7.8. 
 * Se dispone de una tabla T de cincuenta números reales 
 * distintos de cero. Crear una nueva tabla en la que todos 
 * sus elementos resulten de dividir los elementos de la 
 * tabla T por el elemento T[K], siendo K un valor dado.
 * 
 */
private fun ejercicio7_8(numero: Int) {
    val tabla = Array(50, { rand(1, 100) * numero })

    for (item in tabla) {
        println(item.toString())
    }
}

private fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (start..end).random()
}

//7.7. Calcular la suma de los elementos de la diagonal principal de una matriz cuatro por cuatro (4 × 4)
private fun ejercicio7_7(array: Array<IntArray>) {
    var position = 0
    val stop = array.size
    var suma = 0

    while (position < stop) {
        suma += array[position][position]
        position++
    }

    for (item in array)
        println(item.contentToString())

    print("\nla suma de la diagona es $suma\n\n")
}

//  Calcular el número de elementos negativos, cero y
//  positivos de un vector dado de sesenta elementos.
private fun ejercicio7_6(array: Array<Int>) {
    var elementosNegativo = 0
    var elementosPositivos = 0
    var elementosCeros = 0

    for (item in array) {
        if (item == 0) {
            elementosCeros++
        } else if (item > 0) {
            elementosPositivos++
        } else {
            elementosNegativo++
        }
    }
    println(
        "El vector tiene $elementosCeros elemento Cero," +
                "$elementosPositivos elementos positivo, $elementosNegativo elementos negativos "
    )
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
