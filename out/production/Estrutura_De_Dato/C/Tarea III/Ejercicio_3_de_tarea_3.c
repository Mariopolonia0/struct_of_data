#include<stdio.h>/* Ejercicio_3_de_tarea_3 */

void main (){
	float ME,PIES,pul;
	printf("este programa pide una cantidad en metro, para combertirla                      a pie y a pulgadas ");
	printf("\n\nDigite la cantidad en metro :");scanf("%f",&ME);PIES=ME*3.2808;pul=ME*39.370;
	printf("\n%.3f : Esta es la cantidad convertida en pie\n",PIES);printf("\n%.3f : Esta es la cantidad convertida en pulgadas",pul);
	printf("\n\n\nPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();


}
