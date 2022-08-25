#include <iostream>
using namespace std;

void intercambiar(int &a,int &b);
void ordenar(int a[],int tamano);
void imprimir(int a[],int tamano);

int main(){
	
	int estatura[11]={6,5,7,8,8,10,13,9,11,7,12};
	cout<<"\n\n\t\tEsta Es La Lista De La Estatura De Los 11 Luchadores\n\n\t\t\t";
	imprimir(estatura,10);
	cout<<"\n\n\t\tEsta Es La Lista Ordenada Por La Estatura De Los Luchadores:\n\n\t\t\t";
	ordenar(estatura,10);
	imprimir(estatura,10);
}

void ordenar(int a[],int tamano){
	
	for(int i=0;i<tamano;i++){
		for(int j=i+1;j<tamano;j++){
			if(a[i]>a[j]){
				intercambiar(a[i],a[j]);
			}
		}
	}	
}
void intercambiar(int &a,int &b){
	int aux=a;
		a=b;
		b=aux;
}
void imprimir(int a[],int tamano){
	
	for(int i=0;i<tamano;i++){
		cout<<a[i]<<"  ";
	}
}

