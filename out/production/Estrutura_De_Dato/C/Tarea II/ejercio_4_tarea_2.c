#include<stdio.h>
void main(){
	float radio,A,L;	const float pi=3.1415;
	printf("Digite el radio para buscarle el area y la longitud al circulo  = ");
	scanf("%f",&radio);
	A=pi*(radio*radio);L=2*pi*radio;
	printf("\n%.2f es el area y %.2f es la longitud del circulo\n\n",A,L);
	
	system("pause");
}
