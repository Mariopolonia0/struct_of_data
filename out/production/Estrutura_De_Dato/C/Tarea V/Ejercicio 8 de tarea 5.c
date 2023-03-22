#include<stdio.h>   /*Ejercicio_8_de_tarea_5*/

int main() {
	  int n=1;
            while (n){
		 printf ("\n\tDigite un Numero de 1 al 10 y diremo su equivalente en romano :");scanf("%i",&n);	
       switch(n) {
  	case 1:  printf("\n\t\tI es 1 en Romano");n=0;break;
  	case 2:  printf("\n\t\tII es 2 en Romano");n=0;break;
  	case 3:  printf("\n\t\tIII es 3 en Romano");n=0;break;
  	case 4:  printf("\n\t\tIV es 4 en Romano");n=0;break;
  	case 5:  printf("\n\t\tV es 5 en Romano");n=0;break;
  	case 6:  printf("\n\t\tVI es 6 en Romano");n=0;break;
  	case 7:  printf("\n\t\tVII es 7 en Romano");n=0;break;
  	case 8:  printf("\n\t\tVIII es 8 en Romano");n=0;break;
  	case 9:  printf("\n\t\tIX es 9 en Romano");n=0;break;
  	case 10:  printf("\n\t\tX es 10 en Romano");n=0;break;
  	default:printf ("digito el numero mal escriba de nuevo");n=1;system("cls");break;}}
	   	printf("\n\n\n\t\t\tPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar(); }




