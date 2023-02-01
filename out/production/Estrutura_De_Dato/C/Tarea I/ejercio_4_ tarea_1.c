#include<stdio.h>

void main (){
	
	float uso,milocal,mipais,total;
      printf("digite los copcepto de internet usado :");scanf("%f",&uso);	
      printf("digite minutos gastado local          :");scanf("%f",&milocal);		
	  printf("digite minutos gastado a otro pais    :");scanf("%f",&mipais);
	 total=uso*1200+milocal+1.5+mipais*5.00;system ("color 02");
	  printf("\n       el total a pagar es            :%.2f\n\n",total);
	system("pause");
	
}
