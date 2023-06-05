fun main() {

    print("Digite su nombre:")
    val nombre = readLine()!!
    
    print("\nDigite su nacimiento:")
    val nacimiento = readLine()!!
    
    print("\nDigite su numero telefono:")
    val numero = readLine()!! 
    
    print("\nDigite su numero favorito:")
    val numeroFav = readLine()!!.toInt() //readLine()!!.toInt()
    
    print("\n\nSu dato son:\nNombre:$nombre\nNacimiento:$nacimiento\nNumero telefono:$numero\nNumero favorito:$numeroFav")
}
