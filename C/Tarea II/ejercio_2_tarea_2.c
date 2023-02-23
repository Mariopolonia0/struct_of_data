#include<stdio.h>

/* 
 * hacer un programa que al recibir el precio de un artículo, la cantidad comprada y 
 * el monto de dinero pagado por el cliente calcule la devuelta.
 */
main (){
	/*
		p es el precio del articulo,c es la cantidad
		m es el monto del dinero pagado,to es el total, d es la delvuelta
	*/
	int p,c,m,to,d; 

	printf("este programa le dice la devuelta de un articulo comprado\n\n");

	printf("diga el precio del articulo          :");
	scanf("%i",&p);

	printf("diga el cantidad del articulo        :");
	scanf("%i",&c);

	printf("diga el monto para pagar el articulo :");
	scanf("%i",&m);

	to = p * c;
	d = m - to;

	printf("\n%i esta es la debuelta\n\n",d);
	system("pause");
	
}
