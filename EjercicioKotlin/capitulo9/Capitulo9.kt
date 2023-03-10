package EjercicioKotlin.capitulo9


import java.io.*

fun main() {
    var stop = false
    do {

        print("\n1.crear archivo,\n2.agregar Nombre \n3.imprimir Nombres \n4.Salir")
        print("\nselect:")
        val select = readLine()!!.toInt()

        when (select) {
            1 -> {
                crearArchivo("EjercicioKotlin/capitulo9/data.dat")
            }

            2 -> {
                print("\n\nIngrese el nombre:")
                val leer = readLine()!!
                guardarNombre("EjercicioKotlin/capitulo9/data.dat", leer)

            }

            3 -> {
                imprimirNombres("EjercicioKotlin/capitulo9/data.dat")
            }

            4 -> {
                stop = true
            }

        }
    } while (!stop)

}

//guardar el nombre en el archivo
fun guardarNombre(nombreArchivo: String, nombre: String) {

    var list: MutableList<String>

    ObjectInputStream(FileInputStream(nombreArchivo)).use {
        //casteo en kotlin
        list = (it.readObject() as ArrayList<String>)
    }

    list.add(nombre)

    ObjectOutputStream(FileOutputStream(nombreArchivo)).use {
        it.writeObject(list)
    }

    println("----------\nguardado\n----------")
}

//Imprimir lista
fun imprimirNombres(nombreArchivo: String) {

    ObjectInputStream(FileInputStream(nombreArchivo)).use {
        val read = it.readObject()
        println(read)
    }

}

//crear el archivo
fun crearArchivo(nombreArchivo: String) {
    val file = File(nombreArchivo)

    if (file.exists())
        println("agenda ya existe")
    else {
        FileOutputStream(nombreArchivo)

        if (File(nombreArchivo).exists())
            println("archivo creado")
    }
}