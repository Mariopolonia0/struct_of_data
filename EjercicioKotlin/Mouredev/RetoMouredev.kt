package EjercicioKotlin

fun main() {
    //reto2()
    ramdow1_100()
}

fun ramdow1_100() {

    val time = System.currentTimeMillis().toString()
    var semilla = time.substring(time.length - 3, time.length).toInt()
    var hasta = 0
    var numero = 0.0
    var numeroDos = 0.0
    var contador = 0

    print("Cuanto número aleatorio se imprimirán:")
    hasta = readLine()!!.toInt()


    while (contador < hasta) {
        numero = ((5 * semilla + 7) % 8).toDouble()
        numeroDos = numero * 8.toDouble()
        if (numeroDos > 0 && numeroDos <= 100){
            println("$numeroDos")
            contador ++
        }
        semilla = numero.toInt()
    }
}


private fun reto2() {
    var puntoPlayerUno = 0
    var puntoPlayerDos = 0

    do {
        if (rand(1, 2) == 1) {
            puntoPlayerUno++
        } else {
            puntoPlayerDos++
        }
        println("jugador uno : " + octenerPunto(puntoPlayerUno) + " Jugador Dos : " + octenerPunto(puntoPlayerDos))

        Thread.sleep(2000)
    } while (puntoPlayerDos < 3 && puntoPlayerUno < 3)

    if (puntoPlayerUno == puntoPlayerDos) {
        println("\n Empate")
        return
    }

    if (puntoPlayerUno > puntoPlayerDos) {
        println("\nJugador uno a ganado")
    } else {
        println("\nJugador dos a ganado")
    }
}

fun octenerPunto(punto: Int): String {
    return when (punto) {

        1 -> {
            " 15"
        }

        2 -> {
            "30"
        }

        3 -> {
            "40"
        }

        else -> {
            "Love"
        }
    }
}

private fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (start..end).random()
}