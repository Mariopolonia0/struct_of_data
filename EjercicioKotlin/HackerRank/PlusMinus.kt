package EjercicioKotlin.HackerRank

/*
 * Complete the 'plusMinus' function below.
 * There are  positive numbers 3,  negative numbers 2, and 1 zero in the array.
 * The proportions of occurrence are positive: 3/array.size = 0.500000 , negative: 2/6 = 0.333333 ,
 * and zeros: 1/6 = 0.166667.
 * The function accepts INTEGER_ARRAY arr as parameter.
 * Sample Input :
 *      -4 3 -9 0 4 1
 * Sample Output
 *      0.500000
 *      0.333333
 *      0.166667
 */

fun plusMinus(arr: Array<Int>) {
    // Write your code here
    val array = arrayOf("", "", "")
    val arrayCantidad = arrayOf(0, 0, 0)

    arr.map {
        if (it == 0)
            arrayCantidad[2]++
        else if (it > 0)
            arrayCantidad[0]++
        else
            arrayCantidad[1]++
    }

    array[0] = (arrayCantidad[0].toDouble() / arr.size.toDouble()).toString()
    array[1] = (arrayCantidad[1].toDouble() / arr.size.toDouble()).toString()
    array[2] = (arrayCantidad[2].toFloat() / arr.size.toDouble()).toString()

    for (item in 0..2) {

        var result = array[item]

        if (array[item].count() > 8) {
            val resultCopie = result
            result = ""

            for (it in 0..7)
                result += resultCopie[it]

        } else {
            for (it in 0..(7 - array[item].count()))
                result += 0
        }
        println(result)
    }
}

fun main() {
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)

    repeat(5){
        println("mario $it")
    }
}
