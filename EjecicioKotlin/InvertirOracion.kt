package EjecicioKotlin

fun main() {

    invertirOracion("Mario Polonia")
}

fun invertirOracion( oracion : String){

    var resultado = ""

    val oracionDividida = oracion.split(" ")

    for (veces in 0..(oracionDividida.size - 1)) {

        var contador = oracionDividida[veces].length -1

        while (contador >= 0){
            resultado += oracionDividida[veces].get(contador)
            contador--
        }

        resultado += " "
    }

    println(oracion)
    println(resultado)
}





