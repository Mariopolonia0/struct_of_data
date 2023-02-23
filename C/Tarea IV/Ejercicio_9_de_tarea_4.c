#include <stdio.h>
/* Ejercicio 9 de tarea 4  */
//Hacer un algoritmo que pida tres números y lo imprima de mayor a menor
int main (){
	int n1, n2, n3;
	
	printf("Este programa pide tres numero par y los dice los tres de mayor a menor\n\n");
	printf ("\t\tDigite numero uno  :");
	scanf ("%i", &n1);
	printf ("\t\tDigite numero dos  :");
	scanf ("%i", &n2);
	printf ("\t\tDigite numero tres :");
	scanf ("%i", &n3);

	if (n1 > n2 && n1 > n3){
		if (n2 > n3){
			printf ("\n\n\tEstos son los numeros de mayor a menor : %i,%i,%i", n1, n2, n3);
		}else{
			printf ("\n\n\tEstos son los numeros de mayor a menor : %i,%i,%i",n1, n3, n2);
		}
	}else if (n2 > n1 && n2 > n3){
		if (n1 > n3){
			printf("\n\n\tEstos son los numeros de mayor a menor : %i,%i,%i",n2, n1, n3);
		}else{
			printf("\n\n\tEstos son los numeros de mayor a menor : %i,%i,%i",n2, n3, n1);
		}
	}else if (n1 > n2) {
		printf("\n\n\tEstos son los numeros de mayor a menor : %i,%i,%i",n3, n1, n2);
	}else if (n1 == n2 && n2 == n3){
		printf("\n\n\ttodos los numeros son iguales");
	}else{
		printf("\n\n\tEstos son los numeros de mayor a menor : %i,%i,%i",n3, n2, n1);
	}   
}
