package EjecicioKotlin

import kotlin.math.pow
import kotlin.math.round

//Diseñar un algoritmo para calcular la velocidad (en
//m/s) de los corredores de la carrera de 1.500 metros.
//La entrada consistirá en parejas de números (minutos,
//segundos) que dan el tiempo del corredor; por cada
//corredor, el algoritmo debe visualizar el tiempo en
//minutos y segundos, así como la velocidad media.

//Ejemplo de entrada de datos: (3,53) (3,40) (3,46)
//(3,52) (4,0) (0,0); el último par de datos se utilizará
//como fin de entrada de datos.

//vav = 120 km/1,2 horas, que será igual a 100 km/h

fun main() {
    print("Tiempo era de 3.53 m/s y su velocidad fue de ")
    println(calcularVelocidad(3.53f,1500))
    print("Tiempo era de 3.40 m/s y su velocidad fue de ")
    println(calcularVelocidad(3.40f,1500))
    
    longitudAreaCircunferencia(8.0)
    longitudAreaCircunferencia(90.0)
    longitudAreaCircunferencia(5.5)
    longitudAreaCircunferencia(6.1)
}

private fun calcularVelocidad(tiempo: Float, metro: Int): String {
    return (metro/tiempo).toString()
}

//LONGITUD de la CIRCUNFERENCIA = 2 · radio · π 
//ÁREA del CÍRCULO = π · radio al cuadrado = π · r2 
 
private fun longitudAreaCircunferencia(radio : Double){
    
    var longitud = 2 * radio * 3.14
    val area = Math.round((3.14 * (radio.pow(2) )))
    
    println("El radio de la circunferencia es $radio")
    println("La logitud de la circunferencia es $longitud")
    println("El área de la circunferencia es $area")
    println("--------------------------------------------")
}
