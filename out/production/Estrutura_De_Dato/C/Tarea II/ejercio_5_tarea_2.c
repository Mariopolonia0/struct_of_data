#include<stdio.h>
void main(){
	float pd /*precio del dolar*/,cp/*la cantidad que se va a combertir*/,r/* es el resultado*/;
	
	
	printf("este programa combierte de dolar al peso que usted dese\n\n");
	printf("digas el el precio del dolar         :");scanf("%f",&pd);
	printf("\ndiga la cantida que quiere combertir :");scanf("%f",&cp);r=cp*pd;
	printf("\n\n%.2f : es la cantidad convertida\n\n",r);
	
	system("pause");
}
