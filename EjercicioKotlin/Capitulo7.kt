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
    ejercicio7_13(arrayOf(10, 20, 22, 22, 23, 18, 19))
    ejercicio7_13(arrayOf(6, 11, 18, 20, 19))
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

    val result = arrayOf(Array(array.size, { 0 }), Array(array.size, { 0 }))

    for (item in 0..array.size - 1)
        if (media < array[item])
            result[0][item] = array[item]
        else
            result[1][item] = array[item]

    println("las temperaturas son:${array.contentToString()}")
    println("la media es : $media")

    print("temperatura mayor a la media: ")
    for (item in result[0])
        if (item != 0)
            print("$item ")

    println("")
    print("temperatura menores a la media: ")
    for (item in result[1])
        if (item != 0)
            print("$item ")

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
