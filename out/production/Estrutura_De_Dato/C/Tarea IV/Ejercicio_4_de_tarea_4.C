#include<stdio.h>

main(){

	int R,T,Q,total;
	printf("Este programa pide valores para R, T y Q, y determina si los mismos \nsatisfacen la siguiente expresion R^4-T^3+4*Q^2< 820\n\n");
	printf("\ndigite el valor de R :");scanf("%i",&R);
	printf("\ndigite el valor de T :");scanf("%i",&T);
	printf("\ndigite el valor de Q :");scanf("%i",&Q);total=(R*R*R*R)-(T*T*T)+4*(Q*Q);
	if (total<820)
        printf("\n\n\t : es lo que dice la esprecion\n\n");
  else  printf("\n\n\t : no se cumple la esprecion\n\n");
  
printf("\n\t\tPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();
 }
