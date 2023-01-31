#include<stdio.h>/*Ejercicio_5_de_tarea_3*/ //Ejercicio_5_de_tarea_3-Ejercicio_5_de_tarea_3
/* Hacer un algoritmo que calcule la ganancia de una persona que comercializa tres tipos de vinos
que son: blanco, tinto y rosado */
void main (){
	int totin,cobla,vebla,cabla,com,ben,tobla,catin,vetin,cotin,corosado,verosado,carosado,torosado,total;
	printf("Este programa calcula la ganancia de una persona que comercializa tres \ntipos de vinos que son: blanco, tinto y rosado\n\n");
	printf("\nDigite el precio en que compro el vino blanco    :");scanf("%i",&cobla);
	printf("\nDigite el precio en que se vende el vino blanco  :");scanf("%i",&vebla);
	printf("\nDigite la cantidad vino blanco vendida           :");scanf("%i",&cabla);
	com=cobla*cabla;ben=vebla*cabla;tobla=ben-com;
	printf("\n\nDigite el precio en que compro el vino tinto     :");scanf("%i",&cotin);	
	printf("\nDigite el precio en que se vende el vino tinto   :");scanf("%i",&vetin);
	printf("\nDigite la cantidad de vino tinto vendida         :");scanf("%i",&catin);
	com=cotin*catin ;ben=vetin*catin; totin=ben-com;
	printf("\n\nDigite el precio en que se compro el vino rosado :");scanf("%i",&corosado);	
	printf("\nDigite el precio en que se vende el vino rosado  :");scanf("%i",&verosado);
	printf("\nDigite la cantidad de vino rosado vendida        :");scanf("%i",&carosado);
	com=corosado*carosado ;ben=verosado*carosado; torosado=ben-com;total=tobla+torosado+totin;
	printf("\n\n\n%i es la ganancia del vino blanco",tobla);
	printf("\n\n%i es la ganancia del vino tinto",totin);
	printf("\n\n%i es la ganancia del vino rosado",torosado);
	printf("\n\n%i es el total de toda la ganancia\n", total);printf("\n\n\nPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();
	
}
