# include <stdio.h>/* Ejercicio_9_de_tarea_3 */
/* Hacer un algoritmo que calcule el porcentaje de embasarse de un jugador de béisbol */

void main (){
	float bapba,bapbo,goplaz,tupbat,porc;
   printf("Este programa calcula el porcentaje de embasarse de un jugador de b%cisbol\n\n",130);
   printf("Digite base por bateo         :");scanf("%f",&bapba);
   printf("Digite base por bola          :");scanf("%f",&bapbo);
   printf("Digite golpe por lazanmientos :");scanf("%f",&goplaz);
   printf("Digite turno por bateo        :");scanf("%f",&tupbat);
   porc=bapba+bapbo+goplaz/tupbat;
   printf("\n\n%.2f es el porcentaje de embasarse de un jugador de b%cisbol",porc,130);
printf("\n\n\nPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();}
