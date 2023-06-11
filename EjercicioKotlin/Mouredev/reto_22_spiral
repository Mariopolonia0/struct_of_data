/*
 * Crea una función que dibuje una espiral como la del ejemplo.
 * - Únicamente se indica de forma dinámica el tamaño del lado.
 * - Símbolos permitidos: ═ ║ ╗ ╔ ╝ ╚
 *
 * Ejemplo espiral de lado 5 (5 filas y 5 columnas):
 * ════╗
 * ╔══╗║
 * ║╔╗║║
 * ║╚═╝║
 * ╚═══╝
 */
 
 
fun main() {
    draw_spiral(5)
}

fun draw_spiral(size:Int){
    
   
    for(row in 0..size -1){
    
        var spiral = ""
        var horizontal = row == 0
        
        for(col in 0..size -1){
        
            if (row + col == size - 1){
                if (col >= row)
                    spiral +="╗"
                else 
                    spiral +="╚"
                
                horizontal = col < row
                
            }else if(row - col == 1 && row <= (size / 2)){
                spiral += "╔"
                horizontal = true
            }else if(row == col && row >= (size / 2)){
                spiral += "╝"
                horizontal = false
            }else{
                if (horizontal)
                    spiral += "═" 
                else 
                    spiral += "║"
            }
            
        }
        
        println("$spiral")
    }
}
