#include <iostream>
using namespace std;

/*
 * triángulo isósceles.
 * El triángulo isósceles se realiza mediante un bucle externo y dos bucles internos.
 * Cada vez que se repite el bucle externo se ejecutan los dos bucles internos. 
 * El bucle externo se repite n veces (n filas); el número de repeticiones 
 * realizadas por los bucles internos se basan en el valor de la variable fila.
 * El primer bucle interno visualiza los espacios en blanco no significativos;
 * el segundo bucle interno visualiza uno o más asteriscos.
 */

int main()
{
    const int num_lineas = 10;
    const char blanco = ' ';
    const char asterisco = '*';
  
    // comienzo de una nueva línea
    cout << endl;
    
    // dibujar cada línea: bucle externo
    for (int fila = 1; fila <= num_lineas; fila++){
        
        // imprimir espacios en blanco: primer bucle interno
        for (int blancos = (num_lineas - fila); blancos > 0; blancos--)
            cout << blanco;
            
        for (int cuenta_as = 1; cuenta_as < 2 * fila; cuenta_as ++)
            cout << asterisco;
            
        // terminar línea
        cout << endl;
    } 
}
