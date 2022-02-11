#include <iostream>
#include "Nodo.cpp"
#include "Router.cpp"
using namespace std;

class Envio{
	private:
		string mensaje;
	public:
		Envio(){
			mensaje="";
		}
			
		void bienvenida(){
			system("cls");
			cout<<"\n\n\t\tBienvenido Al Simulador De Red Lan\n\n";
		}	
		
		
		void buscarmensaje(Router route[8],Puerto puerto[50]){
			
			
			
		}
				
		void enviar(Router route[8],Puerto puerto[50]){
			
			for(int v=403,c=65;v<=408;v++,c=c+6){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
					
				//bienvenida();		
			}
			
			for(int v=403,c=65;v<=408;v++,c=c+7){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			
			for(int v=403,c=65;v<=408;v++,c=c+3){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
		
			for(int v=203,c=65;v<=208;v++,c=c+4){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
				
			for(int v=103,c=65;v<=108;v++,c=c+3){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}		
			
			for(int v=300,c=77;v<=108;v++,c=c+3){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			
			for(int v=103,c=65;v<=108;v++,c=c+8){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			
			for(int v=300,c=100;v<=108;v++,c=c+3){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			
			for(int v=103,c=65;v<=108;v++,c=c+4){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra "<<pa;
			}
			
			for(int v=401,c=65;v<409;v++,c=c+3){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			
			for(int v=103,c=65;v<=108;v++,c=c+6){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			
			for(int v=401,c=65;v<=408;v++,c=c+3){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje(c);
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			
			for(int v=501,c=65;v<=508;v++,c=c+3){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje('o');
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			
			for(int v=501,c=65;v<=508;v++,c=c+3){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje('i');
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			
			for(int v=501,c=65;v<=508;v++,c=c+3){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje('r');
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			
			for(int v=501,c=65;v<=508;v++,c=c+3){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje('a');
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			
			for(int v=501,c=65;v<=508;v++,c=c+3){
				char pa=c;
				Nodo* aux=route[1].BuscarPuerto(route,v);
				aux->agregarmensaje('m');
				cout<<"\n\n\t\t\tMensaje Recivido En El Puerto "
				
					<<aux->getDireccion()<<" & Fue La Letra  "<<pa;
			}
			cout<<"\n\n\t\t\t";
			system("pause");
			
		}
};


