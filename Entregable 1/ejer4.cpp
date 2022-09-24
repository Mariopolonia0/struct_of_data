#include <iostream>
#include <string>
using namespace std;

int main()
{
	string a = "Mario";
	string b = "";
	string letra = "";
	cout << "Bienvenido A Su Juego Del Ahorcado\n";
	int v = 1;
	int j = 1;
	int turno = a.length() - 2;
	while (v < a.length())
	{
		string c = a;
		c = a[j];
		cout << "\nDigite la Siguiente letra M\n" << letra;
		cin >> b;
		if (b.compare(c) == 0)
		{
			v++;
			letra += b;
			j++;
			cout << "\nle quedan " << turno-- << " turno";
		}
		else
		{
			cout << "\nle quedan " << turno-- << " turno";
			++v;
		}
	}
	if (v > j)
	{
		cout << "\n\t\tUsted Perdio Bestia";
	}
	else
	{
		cout << "\n\t\tUsted Gano Felicidades";
	}
}
