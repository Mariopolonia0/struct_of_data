#include <iostream>
#include "Nodo.cpp"


using namespace std;

class Puerto{
	
	private:
		Nodo* puerto;
	
	public:
		
		Puerto(){
			puerto=NULL;
			
		}
	
		void setPuerto(int a){
			puerto=new Nodo(a);	
		}
		
		Nodo* getPuerto(){
			return puerto;
		}
		
		int direcionpuerto(){
			if(!esVacia())
				return puerto->getDireccion();
			
		}
		
		bool esVacia(){
			return puerto==NULL;
		}
		
			
		
		
			
		
		
	/*	Puerto* BuscarPuerto(int d){
			
			if (ro==NULL)
				return NULL;
					
			else if(ro->getRouterActual()->getDireccion()==d)
				return ro->;
				
			else if(ro->getPuertogetDireccion()==d)
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
		}*/
		
		/*Puerto* BuscarPuerto(Puerto pu[50],int direc){
			Puerto aux;pu->getPuerto();
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
			 	cout<<"\nPuerto "<<direc<<" No Existe En La Direcion ";
			 	
			return route[1].getRouterActual();
		}
		*/
		
	/*	Nodo* Buscar(Nodo* ro,int d){
			
			if (ro==NULL)
				return NULL;
					
			else if(ro->getDireccion()==d)
				ro->getPuerto1();
				
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
		}*/
		
			
};



