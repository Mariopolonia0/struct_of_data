package EjercicioKotlin.EjercicioTecnicaProgramacion

class Tarea1 {

    // primera practica de la tarea 1
    // Hacer un algoritmo para determinar el Sueldo neto que gana un empleado tomando en cuenta
    // que devenga 250 pesos por cada hora trabajada. Al mismo se le hace un descuento de un 5% del
    // total de su sueldo por concepto de impuestos.
    fun ejercicio1() {
        print("ingrese la hora trabajada:")
        val horaTrabajada = readLine()!!.toDouble()
        println("son las horas trabajadas:${(horaTrabajada * 250.0) / 5.0}")
    }

    //Hacer un algoritmo para calcular el monto que tiene que pagar una persona que compra un
    //producto en la tienda en línea de Amazon.
    fun ejercicio2() {
        print("Digite el precio del articulo:")
        val precioArticulo = readLine()!!.toDouble()

        print("Digite lo que cobro el vendedor por enviar el articulo:")
        val cobroEnvioArticulo = readLine()!!.toDouble()

        print("Digite el precio del dolar o moneda donde compro el paquete:")
        val precioMoneda = readLine()!!.toDouble()

        print("Digite el precio de la libra que cobra la empresa la cual va a llevar el paquete a dicho pais o region:")
        val precioLibra = readLine()!!.toDouble()

        print("Digite las libra que pesa el paquete:")
        val libraPaquete = readLine()!!.toDouble()

        val result = ((precioArticulo + cobroEnvioArticulo) * precioMoneda) + (precioLibra * libraPaquete)

        println("result : $result$")
    }

}

fun main() {
    Tarea1().ejercicio1()
    Tarea1().ejercicio2()
}