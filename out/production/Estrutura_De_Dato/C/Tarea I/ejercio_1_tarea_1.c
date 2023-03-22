#include <stdio.h>

// primera practica de la tarea 1
// Hacer un algoritmo para determinar el Sueldo neto que gana un empleado tomando en cuenta 
// que devenga 250 pesos por cada hora trabajada. Al mismo se le hace un descuento de un 5% del 
// total de su sueldo por concepto de impuestos.

void main ()
{

  float ht, por, r;
  printf ("\ndijites las horas trabajadas\n");
  scanf ("%f", &ht);
  r = ht * 250;
  por = r / 5;
  printf ("2.%f son las horas trabajas\n", por);

  system ("pause");


}
