#include <stdio.h>/*Ejercicio 1 de tarea 5*/

int main(){
	int edpri,edse;
	char nopr[20],nose[20];
	printf ("\tDigite el nombre de la primera persona :");scanf("%s",&nopr);
	printf ("\tDigite la edad de la primera persona   :");scanf("%i",&edpri);
	printf ("\n\tDigite el nombre de la segunda persona :");scanf("%s",&nose);
	printf ("\tDigite edad de la segunda persona      :");scanf("%i",&edse);
	 if (edpri>edse){printf("\n\n\t\t%s es mayor que %s",nopr,nose);} 
      else{if(edpri==edse) {printf("\n\n\t\t%s y %s tienen la misma edad ",nopr,nose);}
		      else{ printf("\n\n\t\t%s es mayor que %s",nose,nopr);	}}return 0;}
