#include <iostream>
#include <string>
using namespace std;

string Anagrama(string a,string b){
	if(a.compare(b))
		return "\n\n\t\tLas Palabras No Son Anagramas";
	else 
		return "\n\n\t\tLas Palabras Son Anagramas";	
}

int main(){
	string a="";
	string b="";
	cout<<"Ingrese Una Palabra Para Compararla Con Otra Y Verificar Si Son Anagramas"<<
	"\n\nINGRESA LA PRIMERA PALABRA:";
	cin>>a;
	cout<<"\nINGRESA LA SEGUNDA PALABRA:";
	cin>>b;
	cout<<Anagrama(a,b);

}
