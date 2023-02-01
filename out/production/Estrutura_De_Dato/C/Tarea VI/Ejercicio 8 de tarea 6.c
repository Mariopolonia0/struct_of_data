#include <stdio.h>
/*  Ejercicio_8_de_tarea_6 */

int main (){
	float nu,fa,a, v;
	printf("\n\n\tDigite un n%cmero y el programa imprimir%c su factorial :",163, 160);scanf("%f",&nu);
	if (nu==0||nu==1) {fa=1;}else {fa=nu;a=nu-1;v=nu;
	do {v=v-1;fa = fa*a ; a=a-1;}while (v>1);
    printf("\n\n\t\t%.2f es el factorial del numero digitado",fa);}
	printf("\n\n\n\t\t\tPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();
	
}
