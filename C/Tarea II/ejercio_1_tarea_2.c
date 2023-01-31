#include<stdio.h>
/*calcule el total de dinero ganado por un barbero, donde el barbero gana
por cada persona que el recorta y también gana un 25% de las personas
que recortan otros dos barberos que están en su barbería*/


main(){
	int pp,pp1,pp2,tg;/*pp  es igual a personas recortadas por peluquero 
	                    pp1 es igual a personas recortadas por peluquero 1
                        pp2 es igual a personas recortadas por peluquero 2
              	        pp3 es igual a personas recortadas por peluquero 3
              	        tg es igual a total de ganancia del peluquero */
	printf("personas recortadas por peluquero   :");scanf("%i",&pp);
	printf("personas recortadas por peluquero 1 :");scanf("%i",&pp1);	
	printf("personas recortadas por peluquero 2 :");scanf("%i",&pp2);
	tg=pp+(pp1*0.25)+(pp2*0.25);printf("\n%i es la ganacia del barbero",tg);
	
	
}
