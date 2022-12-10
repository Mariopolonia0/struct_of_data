package EjecicioKotlin

fun main() {

    //invertirOracion("Mario Polonia")
    contarLetra("mortimer")
    println("")
    contarLetra("palabra")
    println()
    contarLetra("ascendente")

}
//ribir un algoritmo que cuente el número de ocurrencias
// de cada letra en una palabra leída como entrada.
//Por ejemplo, "Mortimer" contiene dos "m",
//una "o", dos "r", una "i", una "t" y una "e".
private fun contarLetra(palabra: String) {

    print("$palabra tiene ")
    val veces = palabra.length - 1

    for (letra in 0..veces) {
        var cantidadLetra = 1

        for (contador in 0..palabra.length - 1) {

            if (contador != letra) {
                if (palabra[letra] == palabra[contador]) {
                    if (letra > contador) {
                        cantidadLetra = 0
                        break
                    } else {
                        cantidadLetra++
                    }
                }
            }
        }
        if (cantidadLetra != 0)
            print("[ " + cantidadLetra.toString() + " " + palabra[letra] + " ] ")
    }
}

private fun invertirOracion(oracion: String) {

    var resultado = ""

    val oracionDividida = oracion.split(" ")

    for (veces in 0..(oracionDividida.size - 1)) {

        var contador = oracionDividida[veces].length - 1

        while (contador >= 0) {
            resultado += oracionDividida[veces].get(contador)
            contador--
        }

        resultado += " "
    }

    println(oracion)
    println(resultado)
}





