#include <stdio.h>/*  Ejercicio_2_de_tarea_4 */

int main(){
	int a;
	printf ("Digite un a%co para decirle si es bisiesto : ",164);scanf("%i",&a);
	
	if (a % 4 ==0)
	{
	      if ((a % 4==0) && ! a % 100==0 )
		  {printf("\n\n\tEl a%co digitado es bisiesto :)",164);}	 
		 else {
		         if ((a % 4==0 &&  a % 100==0)&& !a % 400==0)
		             {printf("\n\n\tEl a%co digitado no es bisiesto :(",164); }
		        else{ 
					     if(a % 100==0 && a % 400==0)
					     { printf("\n\n\tEl a%co digitado es bisiesto :)",164); }
				         else { printf("\n\n\tEl a%co digitado no es bisiesto :(",164); }					
					    }
		      }
	}else  {printf("\n\n\tEl a%co digitado no es bisiesto :(",164);}
printf("\n\n\n\t\tPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();	
}
