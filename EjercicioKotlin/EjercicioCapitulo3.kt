//Ejercicios de capitulo 3
fun main() {

    println(notaEnLetra(95))
    println(notaEnLetra(85))
    println(notaEnLetra(65))
    println(notaEnLetra(50))
    numeroCentral(5, 6, 7)
    numeroCentral(10, 2, 2)
    ejercicio3_13()
    sumarNumeroHasta(200)
    println("")
    sumarNumeroHasta(400)

    print("dia 2 mes 12: ")
    verifiarFecha(2, 12)
    print("dia 30 mes 2: ")
    verifiarFecha(30, 2)
    print("dia 2 mes 4: ")
    verifiarFecha(2, 4)
}

//ejercicio  4.13
private fun verifiarFecha(dia: Int, mes: Int) {

    if (mes < 0 || mes > 12) {
        println("Fecha incorrecta")
    } else {
        when (mes) {
            1 -> {
                if (dia < 1 || dia > 31)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }

            2 -> {
                if (dia < 1 || dia > 29)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }

            3 -> {
                if (dia < 1 || dia > 31)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }

            4 -> {
                if (dia < 1 || dia > 30)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }

            5 -> {
                if (dia < 1 || dia > 31)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }
            6 -> {
                if (dia < 1 || dia > 30)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }
            7 -> {
                if (dia < 1 || dia > 31)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }
            8 -> {
                if (dia < 1 || dia > 31)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }
            9 -> {
                if (dia < 1 || dia > 30)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }
            10 -> {
                if (dia < 1 || dia > 31)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }
            11 -> {
                if (dia < 1 || dia > 30)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }
            12 -> {
                if (dia < 1 || dia > 31)
                    println("Fecha incorrecta")
                else
                    println("Fecha correcta")
            }
        }
    }
}

//ejercicio 4.10
//escribir un algoritmo que acepte una calificación
//numérica del estudiante (0-100), convierta esta
//calificación a su equivalente en letra y visualice
//la calificación correspondiente en letra.
private fun notaEnLetra(nota: Int): Char {
    return if (nota >= 90) {
        'A'
    } else if (nota >= 80) {
        'B'
    } else if (nota >= 70) {
        'C'
    } else if (nota >= 69) {
        'D'
    } else
        'F'
}

//Dados tres números deducir cuál es el central.ejercicio 4.3
private fun numeroCentral(numeroUno: Int, numeroDos: Int, numeroTres: Int) {

    if (numeroUno >= numeroDos && numeroUno <= numeroTres) {
        println("El numero Centrado es : $numeroUno")
    }

    if (numeroDos >= numeroUno && numeroDos <= numeroTres) {
        println("El numero Centrado es : $numeroDos")
    }

    if (numeroTres >= numeroDos && numeroTres <= numeroUno) {
        println("El numero Centrado es : $numeroTres")
    }

}

//leer una serie de números distintos de cero
//(el último número de la serie es –99) y obtener el número
//mayor. Como resultado se debe visualizar el número
//mayor y un mensaje de indicación de número negativo,
//caso de que se haya leído un número negativo.
private fun ejercicio3_13() {
    var parar = false
    var numeroMayor = 0
    var numeroNegativo = 0

    while (!parar) {
        println("Digite un numero :")
        val read = readln().toInt()

        if (read > 0) {
            if (read > numeroMayor)
                numeroMayor = read

        } else if (read < 0) {
            if (read < numeroNegativo)
                numeroNegativo = read

        } else {
            println("no puede digitar 0")
        }

        if (read == -99)
            parar = true
    }

    println("numero mayor fue : $numeroMayor y el numero negativo fue :$numeroNegativo\n")
}

//Se desea calcular independiente la suma de los números
//pares e impares comprendidos entre 1 y 2
private fun sumarNumeroHasta(hasta: Int) {
    var sumaNumeroPar = 0.0
    var sumaNumeroImpar = 0.0

    for (contador in 0..hasta) {
        if (contador % 2 == 0) {
            sumaNumeroPar += contador
        } else {
            sumaNumeroImpar += contador
        }
    }

    println("suma numero par : $sumaNumeroPar")
    println("suma numero impar : $sumaNumeroImpar")

} 
