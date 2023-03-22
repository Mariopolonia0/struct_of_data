#include <stdio.h>	
/*Ejercicio_10_de_tarea_6 */
/*Hacer una pC!gina que pida un valor por teclado; imprima los nC:meros Pares del 2 al 20, si el
usuario digita un numero positivo. El programa imprimirC! los NC:meros impares del 1 al 19, si el
usuario digita un numero negativo. */

int main (){
    int nu, v, m;
    printf("este programa si usted digita un numero positivos imprime los n%cmeros \nPares del 2 al 20, y si lo digita negativo imprimir%c los N%cmeros \nimpares del 1 al 19",163, 160, 163);
    printf("\n\nDigite el numero que sea entero :");
    scanf("%i", &nu);
    printf("\n\t\t");
  
    if (nu < 0){
        nu = 1;
        do{
            v = v + 1;
            if (nu % 2 == 0){
                m = 0;
            }
            else{
                printf("%i ", nu);
            };
            nu = 1 + nu;
        }while (v < 20);
    }else{
        nu = 1;
        do{
            v = v + 1;
            if (nu % 2 == 0){
                printf("%i ", nu);
            }
            nu = 1 + nu;
        }while (v < 21);
    }
}
