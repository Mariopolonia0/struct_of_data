#include <stdio.h>

/*Ejercicio 10 de tarea 4*/
//Hacer un algoritmo que pida el día, mes y año de nacimiento de una persona y el día, mes y año
//actual, y con estos datos, calcule e imprima la edad de una persona

int main(){
    
    int dianac, mesnac, anac, diaact, mesact, total, aact;
    
    printf("Digite dia de fecha de nacimiento para conocer la edad :");
    scanf("%i", &dianac);
    printf("Digite numero de mes de nacimiento                     :");
    scanf("%i", &mesnac);
    printf("Digite a%co de nacimiento                               :", 164);
    scanf("%i", &anac);
    printf("Digite dia actual                                      :");
    scanf("%i", &diaact);
    printf("Digite mes actual                                      :");
    scanf("%i", &mesact);
    printf("Digite a%co de actual                                   :", 164);
    scanf("%i", &aact);
  
    total = aact - anac;
    
    if (mesact > mesnac){
        printf ("\n\n\t\t%i es la edad de la persona", total);
    }else if (mesact == mesnac && diaact >= dianac) {  
        printf ("\n\n\t\t%i es la edad de la persona", total);
    }else{
        total = total - 1;
        printf ("\n\n\t\t%i es la edad de la persona", total);
    }
}
