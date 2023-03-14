package EjercicioKotlin.HackerRank


/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 * input    output
 * 4
 * 73       75
 * 67       67
 * 38       40
 * 33       33
 * 34       34
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    val lista = Array(grades.size, { 0 })
    var position = 0

    grades.map {
        var multiplo = it
        var encotrado = false

        if (it <= 34)
            lista[position] = it
        else {
            while (!encotrado) {

                if (multiplo % 5 == 0) {
                    encotrado = true

                    if (multiplo - it < 3)
                        lista[position] = multiplo
                    else
                        lista[position] = it

                } else
                    multiplo++
            }
        }

        position++
    }
    return lista
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}

