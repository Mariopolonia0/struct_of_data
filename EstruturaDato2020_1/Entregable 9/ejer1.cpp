#include<iostream>
using namespace std;

template <class T>class PilaGenerica{
	
	class NodoPila{
 		public:
 			NodoPila* siguiente;
 			T Dato;
 			T Dato1;
 			
 			NodoPila(T x){
 				Dato = x;
 				siguiente = NULL;
 			}
 			
 			NodoPila(T x1,T x2){
 				Dato = x1;
 				Dato1= x2;
 				siguiente = NULL;
 			}
 	};
 	
	NodoPila* primero;
	public:
 		PilaGenerica (){
 			primero = NULL;
 		}
 		
 		
		void push(T dato){
			NodoPila* nuevo;
 			nuevo = new NodoPila(dato);
 			nuevo -> siguiente = primero;
 			primero = nuevo;
		}
		
		void push(T dato1,T dato2){
			
			NodoPila* nuevo= new NodoPila(dato1,dato2);
 			nuevo -> siguiente = primero;
 			primero = nuevo;
		}
		
	 /*	T pop(){
	 		
 			if (esVacia())
			{
				return esVacia();
			}else{
				NodoPila* aux =
				nuevo = new NodoPila(primero -> Dato) ;
 				primero = primero -> siguiente;
 				
 				return aux;	
			}	
		}*/
		
		T pop(){
			
			if(primero==NULL)
				return 0;
			
			NodoPila* aux=primero;
			primero=primero->siguiente;
			aux->siguiente=NULL;
			return aux -> Dato;
	    }
	    
	    T pop1(){
			
			if(primero==NULL)
				return 0;
			
			NodoPila* aux=primero;
			primero=primero->siguiente;
			aux->siguiente=NULL;
			cout<< aux -> Dato <<"/"<< aux -> Dato1<<" ";
			return aux-> Dato;
	    }
 		
		T primeroPila(){
			
 			if (esVacia())
 				return NULL;
 			
			return primero -> Dato;
		}
 		
		bool esVacia(){
 			return primero == NULL;
 			
		}
		
 		void limpiarPila(){
 			NodoPila* n;
 			while(!esVacia())
 			{
 				n = primero;
 				primero = primero -> siguiente;
 				delete n;
 			}
		}
		
 		~PilaGenerica()
 		{
 			limpiarPila();
 		}
 		
 		void imprimircarta(){
 			
 			for(int i=0;i<13;i++)
 				cout<<pop()<<" ";
		}
 		
 		void imprimirdomino(){
 			
 			for(int i=0;i<64;i++){
 				if(i==7 || i==14 ||i==21 ||i==28||i==35||i==42){
 					cout<<"\n\n\t\t\t\t\t\t";
				 } 
				pop1();
			 }		
		}
 			 
};


int main(){
	PilaGenerica<string> carta;
	
	carta.push("2");
	carta.push("3");
	carta.push("4");
	carta.push("5");
	carta.push("6");
	carta.push("7");
	carta.push("8");
	carta.push("9");
	carta.push("10");
	carta.push("A");
	carta.push("K");
	carta.push("Q");
	carta.push("J");
	cout<<"\n\n\t\tEsta son las carta guardadas:   ";
	carta.imprimircarta();
	
	PilaGenerica<int> domino;
	
	for(int j=6;j>=0;j--){
		for(int i=6;i>=0;i--)
		domino.push(j,i);	
	}
	
		
	
	cout<<"\n\n\n\t\tEsta Son Las Ficha de Domino:   ";
	domino.imprimirdomino();
	    
	
		
}
