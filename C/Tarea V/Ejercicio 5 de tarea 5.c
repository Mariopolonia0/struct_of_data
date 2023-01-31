#include <stdio.h>  /*Ejercicio_5_de_tarea_5*/

int main (){
	int ed1,ed2,ed3;
	printf ("\n\t\tdigite la edad de juan :");scanf("%i",&ed1);
	printf ("\n\t\tdigite la edad de mario :");scanf("%i",&ed2);
	printf ("\n\t\tdigite la edad de pedro :");scanf("%i",&ed3);
      if (ed1==ed2 && ed2==ed3){printf("\n\n\t\t\tJuan, Mario y Pedro son contempor%cneos",160);}
       	else { if (ed1==ed2 ){printf("\n\n\t\t\tJuan y Mario son contempor%cneos",160);} 
	         	else{ if (ed1==ed3){printf("\n\n\t\t\tJuan y Pedro son contempor%cneos",160);}
		                 else{if (ed2==ed3){printf("\n\n\t\t\tMario y Pedro son contempor%cneos",160);}
				                 else {printf("\n\n\t\t\tNo hay persona contempor%cneos",160); }}}}
								 printf("\n\n\n\t\t\tPRECIONA ENTRE PARA FINALIZAR EL PROGRAMA");getchar();getchar();
								 }
	
	

