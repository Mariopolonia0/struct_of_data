#include <iostream>
using namespace std;

void intercambiar(int &a,int &b);
void ordenar(int a[],int tamano);
void imprimir(int a[],int tamano);

int main(){
	int a[50]={1,5,3,-8,7,9,-5,4,7,-9,8,9,6,15,0,3,2,48,8,7,57,25,-41,10,1};
	cout<<"\n\n\tEsta Programa Ordena Una Lista De Numeros & Sera La Siguiente:\n\n";
	imprimir(a,25);
	ordenar(a,25);
	cout<<"\t\tEsta es la Lista Ordenada\n\n";
	imprimir(a,25);
}

void ordenar(int a[],int tamano){
	
	for(int i=0;i<tamano;i++){
		for(int j=i+1;j<tamano;j++){
			if(a[i]>a[j])
				intercambiar(a[j],a[i]);
		}
	}		
}

void intercambiar(int &a,int &b){
	int aux=0;
		aux=a;
		a=b;
		b=aux;
}

void imprimir(int a[],int tamano){
	
	for(int i=0;i<tamano;i++){
		cout<<a[i]<<"\t";
	}
	cout<<endl<<endl;
}


