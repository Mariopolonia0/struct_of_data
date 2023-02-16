package EjercicioKotlin.EjercicioTecnicaProgramacion

fun main() {
    hechoEnClase09_10_18()
}

fun hechoEnClase09_10_18() {
    print("Digita hasta que numero se imprimira la lista:")
    val veces = readLine()!!.toInt()

    for (item in 0..veces) {
        println("${item}")
    }
}