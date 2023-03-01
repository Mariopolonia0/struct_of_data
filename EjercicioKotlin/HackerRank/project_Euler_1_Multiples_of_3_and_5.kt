package EjercicioKotlin.HackerRank

//If we list all the natural numbers below 10 that are multiples of 3 or 5,
//we get 3,5,6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of  or  below .
//Input Format
//First line contains T that denotes the number of test cases.
//This is followed by T lines, each containing an integer, N.
//Sample Input 0
//2
//10
//100
//Sample Output 0
//23
//2318

fun main() {
    val veces = readLine()!!.trim().toInt()

    for (item in 1..veces) {
        val hasta = readLine()!!.trim().toInt()
        val result = sumar(hasta)
        if(result > 0)
            println(result)
    }
}

//suma los numero múltiplos del 3 y del 5 hasta el numero que se le pase
fun sumar(hasta:Int):Int{
    var suma = 0

    for (item in 1..hasta - 1) {
        if(item % 3 == 0  ){
            suma += item
        }else if(item % 5 == 0  ){
            suma += item
        }
    }

    return suma
}