#include<stdio.h>

//Hacer un algoritmo que pida tres números y calcule su promedio.

main(){
	
	float n1,n2,n3,total;
        printf("este programa le dira el promedio de tres numeros\n\n");
	
	printf("digite el primer  numero : ");
	scanf("%f",&n1);
	
	printf("digite el segundo numero : ");
	scanf("%f",&n2);	
	
	printf("digite el tercero numero : ");
	scanf("%f",&n3);
	
	total = (n1 + n2 +n3 ) / 3; 
	
	printf("\n%.2f es el promedio de los tres numeros\n\n",total);
	system("pause");
}
