
fun main() {
   for(contador in 2..500)
       numeroPrimos(contador)
}

private fun numeroPrimos(numero: Int) {

    var esPrimo = true

    for (contador in 2..(numero - 1)) {
        if (numero.mod(contador) == 0)
            esPrimo = false
    }

    if(esPrimo)
        println("numero $numero es primo")
    else
        println("numero $numero no es primo")
}