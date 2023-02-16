#include<stdio.h>

/*
Hacer un algoritmo que calcule y diga el monto total pagado por una persona en un restaurante 
que compró una hamburguesa, un refresco y dos órdenes de papa. En el restaurant se debe pagar 
el 18% de ITBIS y un 10% de propina legal.
*/
void main (){
	
	float uso,milocal,mipais,total;
	printf("digite los copcepto de internet usado :");
	scanf("%f",&uso);
	
	printf("digite minutos gastado local          :");
	scanf("%f",&milocal);	
	
	printf("digite minutos gastado a otro pais    :");
	scanf("%f",&mipais);
	
	total=uso*1200+milocal+1.5+mipais*5.00;
	system ("color 02");
	printf("\n       el total a pagar es            :%.2f\n\n",total);
	system("pause");
	
}
