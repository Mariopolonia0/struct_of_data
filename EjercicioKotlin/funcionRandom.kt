package EjercicioKotlin

private fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (start..end).random()
}

fun main() {
    println(rand(5,10))
    println((5..10).random())
}