#include <stdio.h>  /*Ejercicio_10_de_tarea_5*/

int main (){
	
	float h,m,ho,mi,total;
	printf("Este Programa Determine Cuanto Debe Pagar Por El Estacionamiento De Su Veh%cculo\n\n",161);
	printf("Digite la hora estacionadas   :");scanf("%f",&h);
	printf("\nDigite los minuto estacionado :");scanf("%f",&m);ho=h*1500;mi=(m/100)*1500;total=ho+mi;
    printf("\n\n\t%.2f es lo que tiene que pagar por las hora y minuto estacionado",total);
    printf("\n\n\n\t\t\tPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();
}
