#include <iostream>
#include <vector>
#include <sstream>

//este ejercicio lo convirtió ChatGPT desde el que hice en Kotlin
using namespace std;

int main() {
    vector<int> ventas;
    string line;
    getline(cin, line);
    stringstream ss(line);
    int temp;

    while (ss >> temp) {
        ventas.push_back(temp);
    }

    int suma = 0;

    for (int i = 0; i < ventas.size(); i++) {
        suma += ventas[i];
    }

    double media = static_cast<double>(suma) / ventas.size();

    cout << "la media de ventas es: " << media << endl;
    cout << "ventas mayor a la media: ";

    for (int i = 0; i < ventas.size(); i++) {
        if (ventas[i] > media) {
            cout << ventas[i] << ", ";
        }
    }

    cout << endl;
    return 0;
}