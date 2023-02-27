#include<stdio.h>

/*ejer_09_10_18_n3*/

int main (){
    
    int t,v,nu;
    printf("ESTE PROGRAMA SUMA 50 NUMERO");
    
    for(v=1;v<=10 ;v++){
        printf("Digite un numero : ");
        scanf("%i",&nu);
        t=t+nu;
        system("cls");
    }
    
    printf("%i es la suma de los 50 numeros ",t);
}
