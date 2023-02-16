package EjercicioKotlin.HackerRank




/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val lista = Array(2,{0})
    var contador = 0

    while (contador <= a.size - 1){
        if (a[contador] != b[contador]){
            if (a[contador] > b[contador])
                lista[0]++
            else
                lista[1]++
        }
        contador++
    }

    return  lista
}

fun main() {


    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
