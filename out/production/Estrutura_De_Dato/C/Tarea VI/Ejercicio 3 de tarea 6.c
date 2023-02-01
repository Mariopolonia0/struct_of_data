#include <stdio.h>  /*Ejercicio_3_de_tarea_6*/

int main (){
	float ba,ex,po; int v;
	printf("este programa eleva una base a un exponente");
	printf("\n\n\t\tdigite la base :");scanf("%f",&ba);printf("\n\t\tdigite la exponente :");scanf("%f",&ex);po=ba;
do { po=po*ba;v=1+v;} while(v<ex);printf("\n\n\t\t%.2f :es la base elevada\n\n",po);}
