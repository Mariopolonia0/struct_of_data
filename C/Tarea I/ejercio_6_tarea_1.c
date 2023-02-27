#include<stdio.h>

void main (){

    int base,altura,block,resultado;

    printf("Este algoritmo le dira la cantidad de block que se lleva levantar una pared\n");
    printf("\ndigite la base de la pared a construir      :");
    scanf("%i",&base);

    printf("\ndigite la altura de la pared a construir    :");
    scanf("%i",&altura);

    printf("\ndigite el Tama�o del block que se utilizara :");
    scanf("%i",&block);

    resultado = base * block * altura;

    printf("\n\nes la cantridad de block que se utilizara para la pared :%i \n\n",resultado);
    system("pause");
		        
}
