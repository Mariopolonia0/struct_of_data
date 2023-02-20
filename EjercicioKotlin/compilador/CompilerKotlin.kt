package EjercicioKotlin.compilador

fun main() {
    println("Digite El Codigo de un hola mundo en Kotlin:")
    val codigo = readln()
    val dividor_codigo = codigo.split(" ")

    if (dividor_codigo[0] > "fun"){
        println("falta fun : Compilacion Con Error")
    }

    if (dividor_codigo.size > 1){
        if (dividor_codigo[1] != "main(){"){
            println("falta main(){ : Compilacion Con Error 1")
            //return
        }
    }else{
        println("falta main(){ : Compilacion Con Error 2")
        //return
    }

    if (dividor_codigo.size >= 2){
        if (dividor_codigo[2] != "println(Hola"){
            println("falta println() : Compilacion Con Error 1")
            //return
        }
    }else{
        println("falta println(Hola Mundo) : Compilacion Con Error2 ")
        //return
    }

    if (dividor_codigo.size >= 4){
        if (dividor_codigo[4] != "}"){
            println("falta } : Compilacion Con Error 1")
        }else{
            println("compilacion Terminada")
        }
    }else{
        println("falta } : Compilacion Con Error 2")
    }

//    fun main(){ println(Hola Mundo) }
//    println(" ")
//    println(" ")
//
//    println(dividor_codigo.size.toString())
//
//    for (i in dividor_codigo.indices)
//        println(dividor_codigo[i]+" "+i)

}