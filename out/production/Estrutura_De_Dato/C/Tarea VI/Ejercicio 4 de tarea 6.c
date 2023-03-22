#include <stdio.h>/*Hacer un algoritmo que pida un año inicial y un año final y diga cuantos años bisiesto hay entre un año y otro.*/
                            /*Ejercicio_4_de_tarea_6*/
int main (){
	int aini,afin,a,m;

	printf ("Este programa pida un a%co inicial y un a%co final y dice cuantos \na%cos bisiesto hay entre un a%co y otro.",164,164,164,164);
	printf("\n\nDigite el a%co inicial :",164);scanf("%i",&aini);printf("\nDigite el a%co final   :",164);scanf("%i",&afin);a=aini;
	do { if (a % 4 ==0)
	{   if ((a % 4==0) && ! a % 100==0 )
		  {printf("\n\n\t%i El a%co digitado es bisiesto :)",a,164);}	 
		 else { if ((a % 4==0 &&  a % 100==0)&& !a % 400==0)
		             {m=0;}
		        else{ if(a % 100==0 && a % 400==0)
					     { printf("\n\n\t%i El a%co digitado es bisiesto :)",a,164); }
				         else { {m=0;}}}}}else  {m=0;}	a=a+1;	}while( a<=afin);
}
