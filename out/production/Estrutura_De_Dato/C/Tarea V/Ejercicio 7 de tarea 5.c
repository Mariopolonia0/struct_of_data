#include <stdio.h>/*Ejercicio_7_de_tarea_5*/

int main(){
      float la1,la2,la3;/* la=lado*/
      printf("Este programa dice si un triangulo es Equil%ctero, Is%csceles o escaleno\n\n",160,162);
   printf("\n\tDigite la longitued del lado 1 :");scanf("%f",&la1);
   printf("\n\tDigite la longitued del lado 2 :");scanf("%f",&la2);
   printf("\n\tDigite la longitued del lado 3 :");scanf("%f",&la3);
   if (la1==la2 && la2==la3) { printf("\n\n\t\tEl Triangulo Es Equil%ctero",160);} else {
   	if ( la1==la2  ||  la2==la2  ||  la3==la1 ){printf("\n\n\t\tEL Triangulo Es Is%csceles",162); }
   	else{printf("\n\n\t\tEl Triangulo Es Escaleno"); }}
  printf("\n\n\n\t\t\tPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();
   }
