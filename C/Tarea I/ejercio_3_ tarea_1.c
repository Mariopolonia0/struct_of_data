#include<stdio.h>
/*
Hacer un algoritmo que calcule y diga el monto total pagado por una persona en un restaurante 
que compró una hamburguesa, un refresco y dos órdenes de papa. En el restaurant se debe pagar 
el 18% de ITBIS y un 10% de propina legal.
*/

void main ()
{
  float pham, pref, ppapa, cpapa, topapa, total, a;
  system ("color 81");
  printf ("\ndigite el precio de la hamburguesa :");
  scanf ("%f", &pham);
  printf ("\ndigite el precio del refreco       :");
  scanf ("%f", &pref);
  printf ("\ndigite el precio de orden de papa  :");
  scanf ("%f", &ppapa);
  printf ("\ndigite el precio de la hamburguesa :");
  scanf ("%f", &cpapa);
  topapa = ppapa * cpapa;
  total = pham + pref + topapa;
  a = total * 0.28;
  total = total + a;
  printf ("\n%.3f es el total por la compra\n", total);

  system ("pause");
}
