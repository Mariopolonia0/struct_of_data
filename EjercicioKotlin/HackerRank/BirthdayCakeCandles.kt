package EjercicioKotlin.HackerRank
/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    var numberCandle = 0

    candles.map{
        if( it > numberCandle)
            numberCandle = it
    }

    var timesCardle = 0

    candles.map{
        if (numberCandle == it)
            timesCardle++
    }

    return timesCardle
}

fun main() {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
