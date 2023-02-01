#include <stdio.h>/*Ejercicio_2_de_tarea_6*/

int main (){
	int v=0,nu;
	printf("\n\t\tEste programa pide 50 numero y dice si es par\n\n");
	do{          v=v+1;
         printf("\n\n\t\t\t\tDigite numero %i:",v);scanf("%i",&nu);
         if ( nu % 2==0){printf ("\n\n\t  el numero que se digito a la %i vez es par y es el numero %i",v,nu);	}
      }while(v<=50);
	

}
