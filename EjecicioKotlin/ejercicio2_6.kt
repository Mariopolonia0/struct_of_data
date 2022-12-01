package EjecicioKotlin

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
}

private fun calcularVelocidad(tiempo: Float, metro: Int): String {
    return (metro/tiempo).toString()
}



