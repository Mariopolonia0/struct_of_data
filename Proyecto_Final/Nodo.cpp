#ifndef CARTA_H
#define CARTA_H
#include<stdio.h>
#include <iostream>
using namespace std;
typedef int Tipoelemento;

class  Nodo{
	private:
		Tipoelemento direcion;
		char mensaje;
		Nodo* primero;
		Nodo *puerto1;
		Nodo *puerto2;
		Nodo *puerto3;
		Nodo *puerto4;
		Nodo *puerto5;
		Nodo *puerto6;
		Nodo *puerto7;
		Nodo *puerto8;
		
		
	public:	
		Nodo *siguiente;
	
		Nodo(Tipoelemento valor){
			direcion = valor;
			siguiente=NULL;
		}			
	
		Nodo(char m){
			mensaje=m;
			siguiente=NULL;
		}
	
		Nodo( Tipoelemento valor,Nodo* epuerto1,Nodo* epuerto2,Nodo* epuerto3,Nodo* epuerto4,Nodo* epuerto5,Nodo* epuerto6,Nodo* epuerto7,Nodo* epuerto8){
			this->direcion = valor;
			this->puerto1=epuerto1;
			this->puerto2=epuerto2;
			this->puerto3=epuerto3;
			this->puerto4=epuerto4;
			this->puerto5=epuerto5;
			this->puerto6=epuerto6;
			this->puerto7=epuerto7;
			this->puerto8=epuerto8;
		}
	
		int getDireccion(){
			return direcion;
		}
		
		char getMensaje(){
			return mensaje;
		}
		
		void visitar()	{
			cout<< direcion << endl;
		}
		
		Nodo* getPuerto1(){
			return puerto1;
		}
	
		Nodo* getPuerto2(){
			return puerto2;
		}
		
		Nodo* getPuerto3(){
			return puerto3;
		}
		
		Nodo* getPuerto4(){
			return puerto4;
		}
		
		Nodo* getPuerto5(){
			return puerto5;
		}
		
		Nodo* getPuerto6(){
			return puerto6;
		}
		
		Nodo* getPuerto7(){
			return puerto7;
		}
		
		Nodo* getPuerto8(){
			return puerto8;
		}
		
		void agregarmensaje(char me){
			Nodo* nuevo= new Nodo(me);
			if (primero==NULL)
				primero=nuevo;
			else{
				nuevo->siguiente=primero;
				primero=nuevo;

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
		
		void Imprimir(){
			Nodo* aux=primero;
			cout<<"\n\t\t\t";
			while(aux){
				cout<<aux->getMensaje();
				aux=aux->siguiente;
			}
			cout<<"\n";
		}
		
	// operaciones de acceso
	/*Tipoelemento valorNodo();
	Nodo* subArbolIzdo();
	Nodo* subArbolDcho();
	int getvisitar();
	void visitar();
	void Imprimir();
	// operaciones de modificación
	void nuevoValor(Tipoelemento d);
	void ramaIzdo(Nodo* n);
	void ramaDcho(Nodo* n);*/
};

#endif




//Nodo::Nodo

/*	
	// operaciones de acceso
Tipoelemento Nodo::valorNodo(){ return dato; }
Nodo*  Nodo::subArbolIzdo(){ return izdo; }
Nodo*  Nodo::subArbolDcho(){ return dcho; }
	
void Nodo::visitar(){
	cout << dato << endl;
}

int Nodo::getvisitar(){
	return dato;
}



	// operaciones de modificación
void Nodo::nuevoValor(Tipoelemento d){ dato = d; }

void Nodo::ramaIzdo(Nodo* n){ izdo = n; }

void Nodo::ramaDcho(Nodo* n){ dcho = n; }

*/
