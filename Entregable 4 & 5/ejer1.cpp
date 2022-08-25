#include <iostream>
using namespace std;

template <typename Dato> class Base
{
	public :
	Dato a[10]={};
	Dato b[10]={}; 
	Base(Dato a,int c){ this->a[c]; }
	imprimir(int op,int c)//clase del ejercicio #3
	{
	string o="";	
	if(op>=c)
	{
	    cout<<"\n\t\t "<<a[c];c++;imprimir(op,c);
	}else{return 0;} 	
	}	
};


int main()
{ int c=0,op=1;
  Base <string> nombre("",0);
  Base <double> numero(0,0);
  while(op>0){
  cout<<"Bienvenido a Su Base De Datos\n\t1.Guardar Nombre\n\t2.Guardar Numeros\n\tDigite Opcion Deseada o 0 Si desea Salir Y ver La BASE DE DATO:";
  cin>>op;
  if (op==1)
  {
  	cout<<"Digite Nombre A Guardar:";cin>>nombre.a[c];c++;system("cls");
  }else if(op==2)
   {
  	    cout<<"Digite Numero A Guardar:";cin>>numero.a[c];c++;system("cls");
	             } else{break; }
   }
  c--;op=c;c=0;system("cls");
  cout<<"\n\n\t\tDatos Guardados";nombre.imprimir(op,c);c=0;numero.imprimir(op,c);                         
  
}//Mario Peña Polonia  2016-0037
