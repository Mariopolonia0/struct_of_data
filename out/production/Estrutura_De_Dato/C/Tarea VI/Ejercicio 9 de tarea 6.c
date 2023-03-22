#include<stdio.h>/*Ejercicio_9_de_tarea_6*/
              /*Hacer un algoritmo que pida un numero quebrado y lo simplifique. */
int main (){
	int nu,dom,a,di;
	printf("\n\n\t\tEste Programa Simplifiqua Un Numero Quebrado\n\n");
	printf("\t\t\tDigite el Numerdor :");scanf("%i",&nu);
	printf("\n\t\t\tDigite el Dominador :");scanf("%i",&dom);a=nu;di=2;
	do{if(nu%di==0&&dom%di==0){nu=nu/di;dom=dom/di;di=2;}else{di=di+1;}}while(di!=a);
	printf("\n\t\t  %i/%i Esta es la cantidad simplificada",nu,dom);
	printf("\n\n\n\t\t\tPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();
}
