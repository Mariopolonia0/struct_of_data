#include<iostream>
using namespace std;

int busquedaBinaria(int a[], int izquierda, int derecha,int valorBuscado){
	
	if(izquierda>derecha)
		return -1;
	
	int centro = (izquierda + derecha) / 2;
	
	if(valorBuscado == a[centro])
		return centro;
		
	if(valorBuscado < a[centro])
		return busquedaBinaria(a,izquierda, centro - 1, valorBuscado);
		
	if(valorBuscado > a[centro])
		return busquedaBinaria(a, centro + 1,derecha, valorBuscado);
}

int main(){
	int n[8]={8,13,17,26,44,56,88,99};
	cout<<"\n\n\tValor Encotrado:"<<n[busquedaBinaria(n,0,8,88)];
}
