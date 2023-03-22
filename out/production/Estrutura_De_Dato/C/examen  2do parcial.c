# include <stdio.h>/*examen 2do parcial mario peña polonia 2016-0037*/
 int main(){
      float milo /*bariable de minuto local*/,mina /*bariable de minuto nacional*/,miin  /*bariable de minuto internacional*/,total,total1,total2,total3;
      float milofe /*bariable de minuto local dia feriado*/,minafe /*bariable de minuto nacional dia feriado*/,miinfe /*bariable de minuto internacional dia feriado*/,c;
      float cofi=400;
      
       printf("\n\tdigite los minuto gastado local :");                                    scanf("%f",&milo); 
	   printf("\n\tdigite los minuto gastado nacional :");                                 scanf("%f",&mina);      
       printf("\n\tdigite los minuto gastado internacional :");                            scanf("%f",&miin); 
       printf("\n\t\tdigite 1 si llamo los dia feriados si no digite 2 :");                scanf("%f",&c); 
       
      if (c==1){printf("\n\tdigite los minuto gastado local en dia feriado :");            scanf("%f",&milofe); 
	            printf("\n\tdigite los minuto gastado nacional en dia feriado :");         scanf("%f",&minafe);      
                printf("\n\tdigite los minuto gastado internacional en dia feriado :");    scanf("%f",&miinfe);  } 
	 
	   else{ milofe=0;minafe=0;miinfe=0; }  	total1=milo+milofe; total2=mina+minafe; total3=miin+miinfe;
			
			
			 if (total1>200) {total2=total2*4; total3=total3*4; }  else{  total2=total2*4; total3=total3*4; total1=total1*4;  }                             total=total1+total2+total3;
			 
			 printf("\n\n\t\t%.2f es el monto total de la factura telefonica ",total);   system("\npause");

}



/*examen 2do parcial mario peña polonia 2016-0037*/
                                                       /*examen 2do parcial mario peña polonia 2016-0037*/
                                                                                                               /*examen 2do parcial mario peña polonia 2016-0037*/
                                                                                                                                                                        /*examen 2do parcial mario peña polonia 2016-0037*/
