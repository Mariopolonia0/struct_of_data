#include <stdio.h>

/* Hacer un programa que al recibir el precio de un artículo, la cantidad comprada y 
el monto de dinero pagado por el cliente calcule la devuelta. */

int main() {
    int p, c, m, to, d;
    // p es el precio del artículo
    //c es la cantidad
    //m es el monto del dinero pagado
    //to es el total y d es la devolución.

    printf("Este programa le dice la devolución de un artículo comprado\n\n");

    printf("Diga el precio del artículo: ");
    scanf("%i", &p);

    printf("Diga la cantidad del artículo: ");
    scanf("%i", &c);

    printf("Diga el monto para pagar el artículo: ");
    scanf("%i", &m);

    to = p * c; 
    d = m - to;

    printf("\n%i es la devolución\n\n", d);

    system("pause");
    return 0;
}