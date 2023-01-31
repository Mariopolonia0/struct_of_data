#include <stdio.h>

int main (){
	char mes[20],di[]="diciembre",en[]="enero",fe[]="febrero",ma[]="marzo",ab[]="abril",
	may[]="mayo",jun[]="junio",jul[]="julio",ag[]="agosto",se[]="septiembre",
	oc[]="octubre",no[]="noviembre";int dia;
	printf ("Digite mes para saber cual es la estacion de esa fecha digitada :");scanf("%s",&mes);
	printf("\t\t\tDigite el dia del dia :");scanf("%i",&dia);
	if (strcmp(mes,di)==0){if(dia >=21){printf("\n\n\t\tla fecha digitada esta en invierno");	}
        else{printf("\n\n\t\tla fecha digitada esta en oto%co",164);}	}
        else{if(strcmp(mes,en)==0) {printf("\n\n\t\tla fecha digitada esta en invierno");}
	    else{if(strcmp(mes,fe)==0) {printf("\n\n\t\tla fecha digitada esta en invierno");}  
	    else{if (strcmp(mes,ma)==0) { if (dia >=20) {printf("\n\n\t\tla fecha digitada esta en primavera");}
		else{printf("\n\n\t\tla fecha digitada esta en invierno",164);} }
	    else{if (strcmp(mes,ab)==0) {printf("\n\n\t\tla fecha digitada esta en primavera");}
		else{if (strcmp(mes,may)==0) {printf("\n\n\t\tla fecha digitada esta en primavera");}
        else{if (strcmp(mes,jun)==0){if (dia >=21) {printf("\n\n\t\tla fecha digitada esta en verano");} 
		else{printf("\n\n\t\tla fecha digitada esta en primavera",164);} }
	    else{if (strcmp(mes,jul)==0) {printf("\n\n\t\tla fecha digitada esta en verano");}
		else{if (strcmp(mes,ag)==0) {printf("\n\n\t\tla fecha digitada esta en verano");}
	    else{if (strcmp(mes,se)==0){if (dia >=22) {printf("\n\n\t\tla fecha digitada esta en Oto%co",164);} 
		else{printf("\n\n\t\tla fecha digitada esta en verano",164);} }
		else{if(strcmp(mes,oc)==0) {printf("\n\n\t\tla fecha digitada esta en invierno",164);}
		else{if(strcmp(mes,no)==0) {printf("\n\n\t\tla fecha digitada esta en invierno",164);}}}}}}}}}}}}}

