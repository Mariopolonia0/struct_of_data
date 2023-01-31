#include<stdio.h> /* Ejercicio 5 de tarea 4 *//* Ejercicio 5 de tarea 4 */

int main (){
	float n1,n2,n3;
	printf ("\n\t\tdiga numero 1 : ");scanf("%f",&n1);
	printf ("\n\t\tdiga numero 2 : ");scanf("%f",&n2);	
	printf ("\n\t\tdiga numero 3 : ");scanf("%f",&n3);
	
    
	if (n1+n2==n3) { printf("\n\n\t  numero 1 y numero 2 = a numero 3");}
       else { 
		  if (n3+n2==n1)  { printf("\n\n\t  numero 2 y numero 3 = a numero 1");}
             else {  
	            if (n1+n3==n2)  { printf("\n\n\t 4 numero 1 y numero 3 = a numero 2");}
	               else { printf("\n\n\t   no hay suma de ningun numero\n\n"); }  }  }  }
