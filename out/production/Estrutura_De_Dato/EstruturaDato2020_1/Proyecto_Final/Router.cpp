#include <iostream>
#include<stdio.h>
#include "Puerto.cpp"

using namespace std;

class Router{
	protected:
		Nodo *principal; //Nodo raíz del árbol
		Nodo *routeractual;		
	public:
		Router(){
			principal = NULL;
		}
	
		Router(Nodo *r){
			principal = r;
		}
	
		void setRaiz(Nodo *p){
			principal = p;
		}
	
		Nodo * getRaiz(){
			return principal;
		}
		
		
		Nodo* nuevoRouter( Tipoelemento dato,Nodo* puerto1,Nodo* puerto2,Nodo* puerto3,Nodo* puerto4,Nodo* puerto5,Nodo* puerto6,Nodo* puerto7,Nodo* puerto8){
			routeractual=new Nodo(dato,puerto1 ,puerto2, puerto3, puerto4, puerto5, puerto6, puerto7,puerto8);
			
		}
		
		Nodo* getRouterActual(){
			return routeractual;
		}
		
		
		
		void inicialroute(Router route[8],Puerto puerto[50]){
	
			for(int v=1,c=101;v<=8;v++,c++){			
				puerto[v].setPuerto(c);
			}
	
			for(int v=9,c=201;v<=17;v++,c++){			
				puerto[v].setPuerto(c);
			}
			
			for(int v=20,c=301;v<=28;v++,c++){			
				puerto[v].setPuerto(c);
			}	
			
			for(int v=30,c=401;v<=38;v++,c++){			
				puerto[v].setPuerto(c);
			}
			
			for(int v=40,c=501;v<=48;v++,c++){			
				puerto[v].setPuerto(c);
			}
		
			route[5].nuevoRouter(500,puerto[40].getPuerto(),puerto[41].getPuerto(),puerto[42].getPuerto(),puerto[43].getPuerto(),puerto[44].getPuerto(),puerto[45].getPuerto(),puerto[46].getPuerto(),puerto[47].getPuerto());        
		
			route[4].nuevoRouter(400,puerto[30].getPuerto(),puerto[31].getPuerto(),puerto[32].getPuerto(),puerto[33].getPuerto(),puerto[34].getPuerto(),puerto[35].getPuerto(),puerto[36].getPuerto(),puerto[37].getPuerto());        
				
			route[3].nuevoRouter(300,puerto[20].getPuerto(),puerto[21].getPuerto(),puerto[22].getPuerto(),puerto[23].getPuerto(),puerto[24].getPuerto(),puerto[25].getPuerto(),puerto[26].getPuerto(),puerto[27].getPuerto());        
	
			route[2].nuevoRouter(200,route[4].getRouterActual(),route[5].getRouterActual(),puerto[11].getPuerto(),puerto[12].getPuerto(),puerto[13].getPuerto(),puerto[14].getPuerto(),puerto[15].getPuerto(),puerto[16].getPuerto());        
	
			route[1].nuevoRouter(100,route[2].getRouterActual(),route[3].getRouterActual(),puerto[3].getPuerto(),puerto[4].getPuerto(),puerto[5].getPuerto(),puerto[6].getPuerto(),puerto[7].getPuerto(),puerto[8].getPuerto());    
		
			route[1].setRaiz(route[1].getRouterActual());
	}
		
		Nodo* BuscarPuerto(Router route[8],int direc){
			Nodo *aux=route[1].getRouterActual();
			int v=1;
			while(v<6){
				if(route[v].Buscar(route[v].getRouterActual(),direc)->getDireccion()==direc){
					aux=route[v].Buscar(route[v].getRouterActual(),direc);
				}		
				v++;
			}
	
			if(aux->getDireccion()==direc)
				return aux;
			else	
			 	cout<<"\n\n\t\t\t"<<direc<<" No Existe Esta Direcion\n";
			 	
			return route[1].getRouterActual();
		}
		
		
		Nodo* Buscar(Nodo* ro,int d){
			
			if (ro==NULL)
				return ro;
					
			else if(ro->getDireccion()==d)
				ro->getDireccion();
				
			else if(ro->getPuerto1()->getDireccion()==d)
				return ro->getPuerto1();
				
			else if(ro->getPuerto2()->getDireccion()==d)	
				return ro->getPuerto2();
				
			else if(ro->getPuerto3()->getDireccion()==d)	
				return ro->getPuerto3();
				
			else if(ro->getPuerto4()->getDireccion()==d)	
				return ro->getPuerto4();
				
			else if(ro->getPuerto5()->getDireccion()==d)	
				return ro->getPuerto5();
				
			else if(ro->getPuerto6()->getDireccion()==d)	
				return ro->getPuerto6();
			
			else if(ro->getPuerto7()->getDireccion()==d)	
				return ro->getPuerto7();
				
			else if(ro->getPuerto8()->getDireccion()==d)	
				return ro->getPuerto8();						
			else
				return ro;
		}
		

		// Recorrido de un árbol en preorden
		void preorden(Nodo *r){
			if (r != NULL){
				r->visitar();
				r->getPuerto1()->visitar();
				r->getPuerto2()->visitar();
				r->getPuerto3()->visitar();
				r->getPuerto4()->visitar();
				r->getPuerto5()->visitar();
				r->getPuerto6()->visitar();
				r->getPuerto7()->visitar();
				r->getPuerto8()->visitar();
			}
		}
		
		
		
		
		
		
	/*	// Recorrido de un árbol binario en inorden
		void inorden(Nodo *r){
			if (r != NULL){
				inorden (r->subArbolIzdo());
				r->visitar();
				inorden (r->subArbolDcho());
			}
		}
		// Recorrido de un árbol binario en postorden
		void postorden(Nodo *r){
			if (r != NULL)	{
				postorden (r->subArbolIzdo());
				postorden (r->subArbolDcho());
				r->visitar();
			}
		}
*/
};

/*
		Nodo raizArbol(){
			if(principar)
				return *principar;
			else
				throw " arbol vacio";
		}
		bool esVacio(){
			return principar == NULL;
		}
	
		Nodo * hijoIzdo(){
			if(principar)
				return principar->subArbolIzdo();
			else
				throw " arbol vacio";
		}
		Nodo * hijoDcho(){
			if(principar)
				return principar->subArbolDcho();
			else
				cout<< " arbol vacio";
		}	

	*/	
	 
	 

