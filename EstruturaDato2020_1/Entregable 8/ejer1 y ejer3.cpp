#include <iostream>
using namespace std;

class Nodo{
	public:
		Nodo* siguiente;
		int Dato;
	
	Nodo(int digito){
		Dato=digito;
		siguiente=NULL;
	}
};

class EnteroLargo{
	
	public:
		int con=0;
		Nodo* primero;
		Nodo* ultimo;
		
		
	public:	
		EnteroLargo(){
			primero=ultimo=NULL;	
		}
		
		void agregar(int digito){
			Nodo* nuevo= new Nodo(digito);
			if (esVacia())
				primero=ultimo=nuevo;
			else{
				ultimo->siguiente=nuevo;
				ultimo=nuevo;
				ultimo->siguiente=primero;
			}
			con++;	
		}
	
		void agregarconsecutivo(int numero){
			
			if(numero<0)
				numero=numero*-1;
			Nodo* nuevo= new Nodo(numero);
			Nodo* aux=primero;
			if (esVacia())
				primero=ultimo=nuevo;
			else if(2>=con)	
				agregar(numero);
			else{
				int p=0;
				while(p<2-1 && aux){
					aux=aux->siguiente;
					p++;
				}
				if(aux->siguiente){
					nuevo->siguiente=aux->siguiente;
					nuevo=aux->siguiente=nuevo;
				}	
			}
			con++;	
		}
		
		bool esVacia(){
			return	primero==NULL;	
		}
		
		void llenarnumero(){
			int digito;
			for(int v=0;v<10;v++){
				cout<<"Digite Digito:";cin>>digito;
				agregar(digito);
				
			}
			
		}
		
		void Imprimir(){
			Nodo* aux=primero;
			
			if(!esVacia()){
				do{
					cout<<aux->Dato<<"\t";
					aux=aux->siguiente;
				}while(aux!=primero);	
			}
		    cout<<"\n\n";
		}
		
		int mayor(){
			Nodo* aux=primero;
			
			Nodo* mayor=primero;
			
			if(!esVacia()){
				do{
					if(aux->Dato>mayor->Dato){
						mayor->Dato=aux->Dato;
					}
					aux=aux->siguiente;
				}while(aux!=primero);	
			}
			
		    return mayor->Dato;	
		}
};

/*

int suma(Tlista &lista)
 {
 int s=0;
 while(lista!=NULL)
 {s=s+lista->nro;
 lista=lista->sgte;
 }
 return s;
}



*/
int main(){
	EnteroLargo n1,n2;
	n1.agregar(5);
	n1.agregar(6);
	n1.agregar(5+5);
	n1.agregarconsecutivo(8);
	/*n1.llenarnumero();
	cout<<"\nEste es El Numero:";n1.Imprimir();
	n2.llenarnumero();
	cout<<"\nEste es El Numero:";n2.Imprimir();*/
	//cout<<n1.mayor();
	n1.Imprimir();
}
