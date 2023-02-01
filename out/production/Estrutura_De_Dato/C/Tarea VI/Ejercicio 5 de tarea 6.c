#include <stdio.h>/*Ejercicio_5_de_tarea_6*/

int main(){
	float num; int  v=0;
        printf("Este programa pide que digiten un numero para decir todos \nlos n%cmeros m%cltiplos de 4 que hay desde el\n1 hasta el n%cmero que se le digite",163,163,163);                                     
    printf("\n\nDigite El Numero :");scanf("%f",&num); do {	v=1+v; 
	if (v % 4==0){ printf("\n\n%i es multiplo de 4",v);}}while(v<num);printf("\n\n\n\t\t\tPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();}
