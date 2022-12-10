package EjecicioKotlin

import javax.print.attribute.standard.PrinterInfo

fun main() {
    capitalTotalAcumulado(capital = 10000.0, interes = 18, dias = 365)
    capitalTotalAcumulado(capital = 20000.0, interes = 18, dias = 728)

}
//muchos bancos y cajas de ahorro calculan los intereses de las cantidades depositadas por los clientes
//diariamente según las premisas siguientes. Un capital
//de 1.000 euros, con una tasa de interés del 6/100,
//renta un interés en un día de 0,06 multiplicado
//por 1.000 y dividido por 365. Esta operación producirá 0,16 euros de interés y el capital acumulado
//será 1.000,16. El interés para el segundo día se calculará multiplicando 0,06 por 1.000 y dividiendo el
//resultado por 365. Diseñar un algoritmo que reciba
//tres entradas: el capital a depositar, la tasa de interés
//y la duración del depósito en semanas, y calcular el
//capital total acumulado al final del período de tiempo
//especificado.
private fun capitalTotalAcumulado(capital: Double, interes: Int, dias: Int) {
    var capitalTotalAcumulado = capital
    val interesCalculado = (interes / 100.0)

    for (veces in 1..dias){
        capitalTotalAcumulado += (interesCalculado * capital)/dias
    }

    println("capital Total Acumulado es " + Math.round(capitalTotalAcumulado))
}

//esribir un algoritmo que cuente el número de ocurrencias
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





