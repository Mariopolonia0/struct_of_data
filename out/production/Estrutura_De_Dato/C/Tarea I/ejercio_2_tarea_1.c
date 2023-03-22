#include<stdio.h>
/*
    Hacer un algoritmo para calcular el monto que tiene que pagar una persona que compra un 
    producto en la tienda en línea de Amazon.
*/
void main(){

	int prar,pecv,precio1,premo,precio2,pe,total;
	system ("color 84"); 
	printf("Este programa le dira el total de la compra de un producto en internet\n");
	printf("Digite el precio del articulo\t: ");
	scanf("%i",&prar);
	printf("Digite lo que cobro el vendedor por enviar el articulo\t: ");
	scanf("%i",&pecv);
	precio1 = prar+pecv;
	printf("Digite el precio del dolar o moneda donde compro el paquete\t:");
	scanf("%i",&premo);
	precio1 = precio1*premo;
	printf("Digite el precio de la libra que cobra la empresa la cual va a llevar el paquete a dicho pais o region\t:");
	scanf("%i",&precio2);
	printf("Digite las libra que pesa el paquete\t: ");
	scanf("%i",&pe);	
	precio2 = precio2*pe;
	total = precio1+precio2	;
        printf("\nEl monto total de la compra es: %i\n\n",total);  
	system("pause")  ;
	
}
