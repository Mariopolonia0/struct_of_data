#include <stdio.h>/* Ejercicio_3_de_tarea_5 */
int main (){
	   int numconbla,numconneg,canblaven,cannegven,prebla,prenegr,totalven,canblaventobla,canblaventone,totaldega;
	printf("\n\tDigite el numero de conejo blanco que hay en la granja :");scanf("%i",&numconbla);
	printf("\n\tDigite el numero de conejo negro que hay en la granja :");scanf("%i",&numconneg );
	printf("\n\tDigite la cantidad de conejos blanco que se an vendido :");scanf("%i",&canblaven);
	printf("\n\tDigite la cantidad de conejos negro que se a vendido :");scanf("%i",&cannegven);
	printf("\n\tDigite el precio de conejos blanco :");scanf("%i",&prebla);
	printf("\n\tDigite el precio de conejos neg :");scanf("%i",&prenegr);  totalven=canblaven+cannegven;
	printf("\n\n\t\t%i es el total de conejos vendidos",totalven);
	   canblaventobla=canblaven*prebla;
	   canblaventone=cannegven*prenegr;
	   totaldega=canblaventobla+canblaventone;
	printf("\n\t\t%i es el totas de la ganancia de las venta de conejos",totaldega);	   
	
	if (canblaven>cannegven)  {printf("\n\t\tLos conejos blancos son los mas vendidos");} 
	                          {printf("\n\t\tLos conejos negros son los mas vendidos");	}  
printf("\n\n\n\t\t\tPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();
}
