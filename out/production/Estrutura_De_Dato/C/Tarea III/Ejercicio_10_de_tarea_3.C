#include  <stdio.h>/*Ejercicio_10_de_tarea_3*/

int main(){
 float B,T,D,J,TU,slug;
	printf("Este programa calcula el sloggin de un bateador\n\n");
	printf("Digite bateo             :");scanf("%f",&B);
	printf("Digite doble             :");scanf("%f",&D);
	printf("Digite triples           :");scanf("%f",&T);
	printf("Digite jonrones          :");scanf("%f",&J);
    printf("Digite turno al bateador :");scanf("%f",&TU);
	slug=B+D+(2*T)+(3*J)/TU;printf("\n\n%.3f Es el sloggin de un bateador",slug);
	printf("\n\n\nPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();
	
	
	
}
