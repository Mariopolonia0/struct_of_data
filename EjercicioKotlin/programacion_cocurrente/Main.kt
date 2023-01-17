//   TAREA DE PROGRAMACION COCURRENTE DE LENGUAJE DE PROGRAMACION
//esta son las variable de los utencilio
var cubierto = 5
var cuchara  = 6
var cucharapostre = 4
var cuchillo  = 6
//esta en la lista de los cliente con una clase de tipo cliente
var listacliente = listOf<Cliente>(Cliente(1,"Mario")
    ,Cliente(1,"Tony")
    ,Cliente(1,"Leuri")
    ,Cliente(1,"Polonia")
    ,Cliente(2,"Eskerni")
    ,Cliente(2,"Yeuri")
    ,Cliente(2,"Jefe Dani")
    ,Cliente(2,"Ekarlin")
    ,Cliente(3,"Juaquin")
    ,Cliente(3,"Pricila")
)

fun main(args: Array<String>) {
    entrarclienter()
}

fun asignarmesa(cliente:Cliente){

    Thread({
        //para cada cliente hay un if con un incremento de untecilio
        //y cuando termina de comen se incrementa los untecilio
        println(" ")
        if (cliente.tipocliente ==  1 ){
            cubierto --
            cuchara  --
            cucharapostre --
            cuchillo  --

            println("Cliente "+cliente.nombre+" Comenzo a comer")
            for(i in 1..10)
                println("   Tiempo $i minutos para "+cliente.nombre)
            println("Cliente "+cliente.nombre+" Termino de comer")
            Thread.sleep(1000)
            cubierto ++
            cuchara  ++
            cucharapostre ++
            cuchillo  ++

        }

        if (cliente.tipocliente ==  2 ){
            cubierto --
            cuchara  --
            cucharapostre --
            cuchillo  --
            println("Cliente "+cliente.nombre+" Comenzo a comer")
            for(i in 1..10)
                println("   Tiempo $i minutos para "+cliente.nombre)
            println("Cliente "+cliente.nombre+" Termino de comer")

            Thread.sleep(1000)
            cubierto ++
            cuchara  ++
            cucharapostre ++
            cuchillo  ++
        }

        if (cliente.tipocliente ==  3 ){
            cubierto --
            cuchara  --
            cuchillo  --

            println("Cliente "+cliente.nombre+" Comenzo a comer")
            for(i in 1..10)
                println("   Tiempo $i minutos para "+cliente.nombre)
            println("Cliente "+cliente.nombre+" Termino de comer")

            Thread.sleep(1000)
            cubierto ++
            cuchara  ++
            cuchillo  ++

        }

    }).start()
}

fun entrarclienter(){
    //la clase Thread es al encargada de trebajar con los hilo en otro lenguaje se llama igual
    val tread = Thread({ // call runnable here println
        println(" ")
        println("               Restaurante Abierto")
        var a = 0
        //  el do - while se para cuando alga
        //  recorrido la clista de los 10 cliente
        do {
            if (cucharapostre > 0 && cubierto > 0 && cuchara > 0 && cuchillo >0){
                asignarmesa(listacliente[a])
                a ++
            }
            else {
                println(" ")
                println("Cliente "+listacliente[a].nombre+" no hay utensilio por favor tiene que esperar un tiempo")
                Thread.sleep(500)
            }
            Thread.sleep(100)

        } while (a < 10 )
        //el sleep envia a pausar el hilo
        Thread.sleep(1000)
        println(" ")
        println("               Restaurante Cerrado")
    })

    tread.start()
}
