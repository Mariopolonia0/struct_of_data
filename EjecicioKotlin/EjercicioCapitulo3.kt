//Ejercicios de capitulo 3
fun main() {
    ejercicio3_13()
    sumarNumeroHasta(200)
    println("")
    sumarNumeroHasta(400)
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
        print("Digite un numero :")
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
