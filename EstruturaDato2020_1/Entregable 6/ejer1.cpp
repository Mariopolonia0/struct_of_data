#include <iostream>
#include <string>
using namespace std;
void imprimir(char a[],int tamano);


void intercambiar(string &n1,string &n2)
{
	string aux=n1;
	    n1=n2;
	    n2=aux;
}

void ordenar(string a[],int tamano){
	
	for (int i=0;i<tamano;i++){
		
		for(int j=i+1;j<tamano;j++){	
		
			if(a[j].compare(a[i])<1){
				intercambiar(a[i],a[j]);
			}
		}
	}
}

string moda(string a[],int tamano){
	string m="nada";
	
	for(int i=0;i<tamano;i++){
		for(int j=i+1;j<tamano;j++){
			if(a[i].compare(a[j])==0 && m.compare("nada")==0)
			m=a[i];
			for(int v=i+2;v<tamano;v++){
				if(a[i].compare(a[v])==0 && a[j].compare(a[v])==0){
					m=a[j];
				}	
			}	
		}	
	}
	return m;
}

void imprimir(string a[],int tamano)
{	
	cout<<"\t";
	for (int v=0;v<tamano;v++)
	{
		cout<<a[v]<<"\t";
	}
	cout<<"\n";
}

int main(){
	
	string letras[10]={"a","p","p","t","e","c","i","t","p"};

	cout<<"\n\t\tEste Programa Busca La Moda y Esta Es La Lista\n\t";
	imprimir(letras,10);
	ordenar(letras,10);
	cout<<"\n\t\tEsta Es La Lista Ordenada"<<endl;
	imprimir(letras,10);
	cout<<"\n\t\tEsta Es La Moda:"<<moda(letras,10);

}
