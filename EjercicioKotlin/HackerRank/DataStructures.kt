package EjercicioKotlin.HackerRank

fun main() {
    println(reverseArray(arrayOf(1 ,4 ,3 ,2)).contentToString())
    println(reverseArray(arrayOf(6676 ,3216 ,4063 ,8373, 423, 586, 8850, 6762)).contentToString())
    println(reverseArray(arrayOf(5833 ,9919 ,6731)).contentToString())

}

/*
 * Complete the 'reverseArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY a as parameter.
 */
fun reverseArray(a: Array<Int>): Array<Int> {
    // Write your code here
    val array = Array(a.size) { 0 }

    var contador = a.size -1

    for(item in a){
        array[contador] = item
        contador--
    }

    return array
}
