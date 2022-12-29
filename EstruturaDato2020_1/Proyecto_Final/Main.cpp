#include <iostream>
#include "Nodo.cpp"
#include "Envio.cpp"
using namespace std;

void menu();
void opc5();
void opc1(Router route[8]);
void enviarmesensaje(Puerto puerto[50], Router route[8]);
void buscarmesensaje(Puerto puerto[50], Router route[8]);
void creditos();

int main()
{

	setlocale(LC_CTYPE, "Spanish");

	Router route[8];
	Puerto puerto[50];
	Envio E;
	route[0].inicialroute(route, puerto);
	int a;
	bool Q = true;
	do
	{
		menu();
		cin >> a;
		switch (a)
		{
		case 1:
			opc1(route);
			break;

		case 2:
			E.enviar(route, puerto);
			break;

		case 3:
			enviarmesensaje(puerto, route);
			break;

		case 4:
			buscarmesensaje(puerto, route);
			break;

		case 5:
			opc5();
			break;

		case 6:
			creditos();
			break;

		case 7:
			Q = false;
			break;

		default:
		{
			system("cls");
			cout << "\n\n\n\t\t\tOpcion No Existe \n\n\t\t\t\t";
			system("pause");
			break;
		}
		}
	} while (Q);
	return 0;
}

void enviarmesensaje(Puerto puerto[50], Router route[8])
{

	int a;
	char b;
	system("cls");
	cout << "\n\n\n\t\t\tDigite La Direcion Del Puerto:";
	cin >> a;

	Nodo *aux = route[1].BuscarPuerto(route, a);
	if (aux->getDireccion() == a)
	{
		cout << "\n\t\t\tDigite El Mensaje A Enviar:";
		cin >> b;
		aux->agregarmensaje(b);
		cout << "\n\t\t\t\tMensaje Guardado\n";
	}
	cout << "\n\t\t\t";
	system("pause");
}

void buscarmesensaje(Puerto puerto[50], Router route[8])
{
	int a;
	system("cls");
	cout << "\n\n\n\t\t\tDigite La Direcion Del Puerto:";
	cin >> a;
	Nodo *aux = route[1].BuscarPuerto(route, a);
	if (aux->getDireccion() == a)
	{
		aux->Imprimir();
	}
	cout << "\n\t\t\t";
	system("pause");
}

void opc1(Router route[8])
{
	int a;
	system("cls");
	cout << "\n\n\t\tDigite La Direcion Que Desea Buscar:";
	cin >> a;
	Nodo *aux = route[1].BuscarPuerto(route, a);
	if (aux->getDireccion() == a)
		cout << "\n\t\tPuerto Encotrado:" << aux->getDireccion();
	cout << "\n\n\t\t\t";
	system("pause");
}
void menu()
{
	system("cls");
	cout << "\n\n\t\tBienvenido Al Simulador De Red Lan\n\n";
	cout << "\t\t\t\tMenu\n\t\t\t\t1.Buscar Puerto\n\t\t\t\t2.Enviar Mensajes Aleatorio"
		 << "\n\t\t\t\t3.Enviar Mensaje A Puerto Deseado"
		 << "\n\t\t\t\t4.Buscar Mensaje En Puerto  Deseado"
		 << "\n\t\t\t\t5.Ver Esquema De La Red\n\t\t\t\t6.Credito"
		 << "\n\t\t\t\t7.Salir\n\n\t\t\t\tDigite Opcion:";
}

void creditos()
{
	system("cls");
	cout << "\n\n\n\t\t\tHecho Por Mario Pe�a Polonia";
	cout << "\n\n\t\t\tMatricula: 2016-0037";
	cout << "\n\n\t\t\tPara La Materia Estructura De Dato";
	cout << "\n\n\t\t\tEntregado En El A�o 2020";
	cout << "\n\n\t\t\tGracias Por Usar Nuestro Servicios\n\n\t\t\t\t";
	system("pause");
}

void opc5()
{
	system("cls");
	cout << "\n\n\n\t\t\tEstara Disponible En La Proxima Actualizacion";
	cout << "\n\n\t\t";
	system("pause");
}
