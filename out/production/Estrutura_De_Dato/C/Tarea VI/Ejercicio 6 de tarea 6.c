#include <stdio.h>
/* Hacer un algoritmo que pregunte a 80 personas su preferencia entre jugo, refresco o leche y al
final diga el porcentaje de personas que prefieren cada producto */
int main (){
	
    int v,j=0,r=0,l=0,pr;float poj,pocr,pol;
    for ( v=1;v<=80;v++ ){
    	printf("\n\tEste programa pregunta a 80 personas su preferencia entre jugo, \n\trefresco o leche e imprime el porcentaje de personas \n\tque prefieren cada producto");
    	printf("\n\n\n\t\tDigite el numero que usted prefiere entre\n\n\t\t\t1-jugo\n\t\t\t2-refresco\n\t\t\t3-leche\t\tseleccione :");scanf("%i",&pr);
    	switch(pr){case 1:{j=j+1;break;}case 2:{r=r+1;break;}case 3:{l=l+1;break;}default:v=v-1;system("cls");printf("\n\n\n\t\tESCRIBIO EL NUMERO MAL VUELVA A SELECIONAL");
		printf("\n\n\t\t\tPRECIONA ENTRE PARA CONTINUAL EL PROGRAMA");getchar();getchar();}system("cls");}
                    poj = (j*80)/100;pocr=(r*80)/100;pol=(l*80)/100;
	printf("\n\n\t\ael porciento del persona que eligeron el jugo es :%.2f",poj);
	printf("\n\n\t\ael porciento del persona que eligeron el refreco es :%.2f",pocr);
	printf("\n\n\t\ael porciento del persona que eligeron el jugo es :%.2f",pol);printf("\n\n\n\t\t\tPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();
}

