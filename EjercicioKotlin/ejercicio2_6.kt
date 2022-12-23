package EjercicioKotlin

import kotlin.math.pow

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
    
    println("salario semanal:" + salarioSemanal(15,8*6))
    println("salario semanal:" + salarioSemanal(15,4*6))
    
    println(esPalindromo("radar"))
    println(esPalindromo("mario"))
    println(esPalindromo("sagas"))
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

/*
 * Escribir un algoritmo que encuentre el salario 
 * semanal de un trabajador,
 * dada la tarifa horaria y 
 * el número de horas trabajadas diariamente.
 */
private fun salarioSemanal(tarifaHoraria:Int,horasTrabajadas:Int):Int{
    return tarifaHoraria * horasTrabajadas
}

//Escribir un algoritmo que indique si una palabra leída 
//del teclado es un palíndromo. Un palíndromo (capicúa)
//es una palabra que se lee igual en ambos sentidos 
//como “radar” ,"somos","sagas","orero".
private fun esPalindromo(palabra:String):Boolean{
    
    var contador1 = 0 
    var contador2 = palabra.count() - 1
    var esPalindromo = true
    
    while (contador1 <= contador2){
        if(palabra[contador1] != palabra[contador2]){
             esPalindromo = false
        }
        
        contador1++
        contador2--
    }
    return esPalindromo
}
