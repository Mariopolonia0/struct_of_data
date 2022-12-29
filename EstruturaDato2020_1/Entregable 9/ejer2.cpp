#include <iostream>
using namespace std;

class Nodo{
	public:
		Nodo* siguiente;
		char Dato;
	public:
		Nodo(char caracteres){
			Dato=caracteres;
			siguiente=NULL;
		} 
	
};
class ColaEstudiante{

	public:
		Nodo* primero;
		Nodo* ultimo;
		 
	public:
		
		ColaEstudiante(){
			primero=ultimo=NULL;
		}
		
		void push(char caracteres){
			Nodo* nuevo= new Nodo(caracteres);
			if (esVacia())
				primero=ultimo=nuevo;
			else{
				ultimo->siguiente=nuevo;
				ultimo=nuevo;
			}
		}
		
		Nodo* pop(){
			
			if(primero==NULL)
				return 0;
			
			Nodo* aux=primero;
			primero=primero->siguiente;
			aux->siguiente=NULL;
			return aux;
			
		}
		
		int peek(){
			if(esVacia())
				return 0;
			return primero->Dato;
		}
		
		Nodo* peek2(){
			if(esVacia())
				return NULL;
			
			return new Nodo(primero->Dato);
			
		}
		
		bool esVacia(){
			return primero==NULL;
		}	
		
};

int main(){
	ColaEstudiante c;
	c.push('M');
	c.push('A');
	c.push('R');
	c.push('I');
	c.push('O');
	
	ColaEstudiante c2;
	c2.push('M');
	c2.push('A');
	c2.push('R');
	c2.push('I');
	c2.push('O');
		
	Nodo* aux;
	Nodo* aux1;
	
	int a=0;
	
	while(aux=c.pop()){
		aux1=c2.pop();
		
		if(aux->Dato!=aux1->Dato)
			 a=1;			
		
	}
	cout<<"\n\n\n\t\t\tLa Colas Son Iguales:";
	if(a==0)
		cout<<"Es Cierto\n\n";
	else
		cout<<"No Es Cierto\n\n";		
			
}
