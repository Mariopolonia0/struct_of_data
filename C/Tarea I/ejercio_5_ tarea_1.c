#include <stdio.h>

/*
Hacer un algoritmo que calcule el monto ganado por un agente de artistas que gana un 15% del 
monto de una fiesta, tomando en cuenta que sus artistas tuvieron un total de 5 fiesta.
*/

void main(){
	
	float prefi,r; 
	printf("Digite el precio de la fiesta :");
	scanf("%f",&prefi); 
	r=prefi*5/15;
	printf("\nla ganancia del agente es :2.%f",prefi);
}
