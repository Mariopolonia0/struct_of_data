#include <stdio.h>/* Ejercicio_6_de_tarea_3 */

void main(){
	int pren,preaz,preagua,total;
	printf("\ndigite el precio de la naranjas     :");scanf("%i",&pren);
	printf("digite precio de la libra de az%ccar :",163);scanf("%i",&preaz);
	printf("digite el precio del agua           :");scanf("%i",&preagua);
	pren=pren*20 ;preaz=2*preaz  ;total=pren+pren+preagua;	
	printf("\n%i este es el total de el galon de jugo de naranja ",total);
	printf("\n\n\nPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();
}
