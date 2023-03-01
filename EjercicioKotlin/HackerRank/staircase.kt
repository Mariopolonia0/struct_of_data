package EjercicioKotlin.HackerRank

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 * Example
 * arr = 1 3 5 7 9
 * The minimum sum is 1 + 3 + 5 + 7 = 16
 * and the maximum sum is 3 + 5 + 7 + 9 = 24
 * the function prints 16 24
 *
 * input
 * 256741038 623958417 467905213 714532089 938071625
 * result
 * 2063136757 2744467344
 *
 * input
 * 5 5 5 5 5
 * result
 * 20 20
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    var numeroMayor = arr[0]
    var numeroMenor = arr[0]

    for (it in 0..arr.size - 1) {
        if (arr[it] > numeroMayor) {
            numeroMayor = arr[it]
        }
    }

    numeroMenor = numeroMayor
    for (it in 0..arr.size - 1) {
        if (arr[it] < numeroMenor) {
            numeroMenor = arr[it]
        }
    }


    var sumaMenores: Long = 0
    var sumaMayores: Long = 0

    for (it in 0..arr.size - 1) {
        if (arr[it] != numeroMayor) {
            sumaMenores += arr[it]
        }
        if (arr[it] != numeroMenor) {
            sumaMayores += arr[it]
        }
    }

    if (sumaMayores == (0).toLong() && sumaMenores == (0).toLong()) {
        for (it in 1..arr.size - 1) {
            sumaMayores += arr[it]
        }
        println("$sumaMayores $sumaMayores")
    } else {
        print("$sumaMenores $sumaMayores")
    }

}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
    println("\n")
}

/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {
    // Write your code here

    for (it in 1..n) {

        for (itemUno in 1..(n - it)) {
            print(' ')
        }

        for (itemDos in 1..it) {
            print('#')
        }
        print("\n")
    }
}

//fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()
//
//    staircase(n)
//}


