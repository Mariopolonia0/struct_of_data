#include <stdio.h>  /*Ejercicio_4_de_tarea_5*/

int main(){
	float ne,total,des /*des = descuento*/;
	printf ("digite el importe neto :");scanf("%f",&ne);
	if (ne>20000)  {des=ne*0.15;total=ne-des;printf("\n%.2f es le importe neto",total);}
	              else {printf("\n%.2f es le importe neto",ne);}
	
	
}
