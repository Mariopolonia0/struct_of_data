package EjercicioKotlin.HackerRank

/*
 * Complete the 'timeConversion' function below.
 * input    :   07:05:45PM   12:01:00PM      12:01:00AM
 * ouput    :   19:05:45     12:01:00        00:01:00
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here

    if ("PM" == "${s[s.length - 2]}${s[s.length - 1]}") {
        val hora = "${s[0]}${s[1]}"

        if ("12" == hora) {
            return s.substring(0..s.length - 3)
        } else {
            val result = s.substring(2..s.length - 3)
            return "${hora.toInt() + 12}" + result
        }
    } else {
        if ("12" == "${s[0]}${s[1]}") {
            return "00" + s.substring(2..s.length - 3)
        } else {
            return s.substring(0..s.length - 3)
        }
    }
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}