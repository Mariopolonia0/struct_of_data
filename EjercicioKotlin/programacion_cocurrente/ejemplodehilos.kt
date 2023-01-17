class ejemplodehilos {

    fun main(args: Array<String>) {

        iniciar()
        createhilo()
    }

    fun hola(){
        for(i in 1..5)
            println("Descargando % $i")
    }

    fun createhilo(){

        Thread(Runnable{ // call runnable here println
            hola()
        }).start()
    }

    fun iniciar(){
        val tread = Thread({ // call runnable here println
            //println("running from lambda: ${Thread.currentThread().name}")
            println("Descarga Iniciada")
            Thread.sleep(3000)
            println("Descarga finalizada")
        })

        tread.start()
    }
}


