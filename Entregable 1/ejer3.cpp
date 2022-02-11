#include <iostream>
#include <string>
using namespace std;

int main(){
	string cadena1="123654547899542586545646546546465468835468468464646848454878464";
	string cadena2="21548755555484879879874968468468468465464648468464865468468468684";
	cout<<"\n\n\t\tEsta Es La Suma De Las Dos Cadenas: ";
	double numero1=0;
	double numero2=0;
	int i=0;
	while ( i < cadena1.length() )
  {
    numero1=numero1+cadena1[i];
    numero2=numero2+cadena2[i];++i;
  }
   cout<<numero1+numero2*100;
	


	
	
}
