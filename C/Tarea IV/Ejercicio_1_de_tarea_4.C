#include <stdio.h>/* Ejercicio_1_de_tarea_4 */
/*Hacer un algoritmo que pida el número del día y escriba el nombre del mismo,
 sabiendo que: 1- Domingo 2- Lunes 3- Martes 4- Miércoles 5- Jueves 6- Viernes 7- Sábado*/
/*Mario Peña Polonia*//*Mario Peña Polonia*//*Mario Peña Polonia*//*Mario Peña Polonia*/
main (){
	int n; 
	 do
   {    	printf("\n   Digite un numero del 1 al 7 para decirle a que dia equibale :");scanf("%i",&n);
	switch(n)
	{
		case 1:printf("\n\n\t\tel numero digitado es igual a Domingo");n=0;break;
		case 2:printf("\n\n\t\tel numero digitado es igual a Lune");n=0;break;
		case 3:printf("\n\n\t\tel numero digitado es igual a Marte");n=0;break;
		case 4:printf("\n\n\t\tel numero digitado es igual a Miercole");n=0;break;
		case 5:printf("\n\n\t\tel numero digitado es igual a Jueve");n=0;break;
		case 6:printf("\n\n\t\tel numero digitado es igual a Vierne");n=0;break;
		case 7:printf("\n\n\t\tel numero digitado es igual a Sabado");n=0;break;
		default: printf("\n\n\tdel 1 al 7 es el numero que usted tiene que digita\n\n");n=10; break;
	}  }
 	 while (n);printf("\n\n\n\t     PRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar(); 
}
