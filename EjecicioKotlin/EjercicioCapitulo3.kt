//Ejercicios de capitulo 3
fun main() {
    
    sumarNumeroHasta(200)
    println("")
    sumarNumeroHasta(400)
}

//Se desea calcular independiente la suma de los números
//pares e impares comprendidos entre 1 y 2
private fun sumarNumeroHasta(hasta: Int){
    var sumaNumeroPar = 0.0
    var sumaNumeroImpar = 0.0
    
    for(contador in 0..hasta){
        if(contador % 2 == 0){
            sumaNumeroPar += contador
        }else{
            sumaNumeroImpar += contador
        }
    }
    
    println("suma numero par : $sumaNumeroPar")
    println("suma numero impar : $sumaNumeroImpar")
    
} 
