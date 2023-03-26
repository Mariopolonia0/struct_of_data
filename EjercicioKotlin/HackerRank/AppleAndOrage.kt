package EjercicioKotlin.HackerRank


/*
 * Complete the 'countApplesAndOranges' function below.
 *
 * https://www.hackerrank.com/challenges/apple-and-orange/problem?h_r=internal-search
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 *  input:
 *  7 11
 *  5 15
 *  3 2
 *  -2 2 1
 *  5 -6
 *  output:
 *  1
 *  1
 */

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    // Write your code here
    val arrayApple = apples.map{
        a + it
    }

    val arrayOragen = oranges.map{
        b + it
    }

    var contadorApples = 0
    arrayApple.map{
        if(it >= s && it <= t)
            contadorApples++
    }

    var contadorOranges = 0
    arrayOragen.map{
        if(it >= s && it <= t)
            contadorOranges++
    }

    println(contadorApples)
    println(contadorOranges)
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}