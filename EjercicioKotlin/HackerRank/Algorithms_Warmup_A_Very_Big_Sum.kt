package EjercicioKotlin.HackerRank

/*
 * Complete the 'diagonalDifference' function below.
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    val suma = Array(2) { 0 }

    var contador = 0
    var contador2 = arr.size - 1

    while(contador < arr.size){
        suma[0] += arr[contador][contador]
        contador++
    }

    contador = 0
    while(contador < arr.size){
        suma[1] += arr[contador][contador2]
        contador2--
        contador++
    }

    val result = (suma[0] - suma[1])

    return if(result >= 0){
        result
    }else{
        result * -1
    }
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}

/*
 * Complete the 'aVeryBigSum' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER_ARRAY ar as parameter.
 */
fun aVeryBigSum(ar: Array<Long>): Long {
    // Write your code here
    var suma : Long = 0

    for(item in ar){
        suma += item
    }

    return suma
}

//fun main() {
//    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()
//
//    val result = aVeryBigSum(ar)
//
//    println(result)
//}