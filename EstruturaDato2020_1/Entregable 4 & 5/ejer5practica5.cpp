#include <iostream>
using namespace std;
/*
mario peña polonia 2016-0037
la secuencia que resultan en el ejercicio 1 del entregable 5 es de 7 el numero de secuencia
y en el ejercicio 2 es de 9 la secuencia y aqui estan los programas del ejercicio
*/
int fibonacci(int n) //serie de fibonaci  
{
	if(n<=1) 
	{
		return n;
	}else
	{
		return fibonacci(n-1)+fibonacci(n-2);
	}
}

template <typename N>N Suma(N n1,N n2,N n3)
{	
	return n1+n2+n3;; 
}

int main()
{	
	cout<<"Sucesion de Fibonacci :"<<fibonacci(5);
	cout<<"\nesta es la suma:"<<Suma(5,1,2);
}
