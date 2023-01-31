#include <stdio.h>
#define nu1 25
#define nu2 100
void main (){
     int suma;
	 int resta;
	 int milt,divicion,residuo;
	 
	 suma= nu1+nu2; 
     resta= nu1-nu2;  
     milt= nu1*nu2;
     divicion= nu1/nu2;
     residuo= nu1%nu2;

     printf("suma\t\t:\t%d\nresta\t\t:\t%d\nmultplicacion\t:\t%d\ndivicion\t:\t%d\nresiduo\t\t:\t%d\n\n",suma,resta,milt,divicion,residuo);
 system("pause\n");
}
