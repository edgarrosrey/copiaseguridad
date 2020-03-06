//Edgar Rosa Rey

#include "Ecu2Grado.h"
#include <iostream>
using namespace std;
double a, b, c;
int numSols;
double x1, x2;

void pedirCoeficientes(double&, double&, double&);
void pantalla(double, double, double, int, double, double);

int main()
{
	pedirCoeficientes(a, b, c);

	numSols = calcularEcuacion(a, b, c, x1, x2);

	pantalla(a, b, c, numSols, x1, x2);

}

void pedirCoeficientes(double& oa, double& ob, double& oc) {

	cout << "***Ecuacion de Segundo Grado***\n";
	do {
		cout << "Dame el valor de a \n";
		cin >> oa;
		if (oa == 0) cout << "El coeficiente de a no puede ser 0. Introduzca un valor diferente porfavor";
	} while (oa == 0);
	cout << "Dame el valor de b \n";
	cin >> ob;
	cout << "Dame el valor de c \n";
	cin >> oc;

}

void pantalla(double ia, double ib, double ic, int Sol, double ix1, double ix2) {
	if (Sol == 0) cout << "La ecuacion de coeficientes a = " << ia << ", b = " << ib << ", c = " << ic << "\n";
	if (Sol == 0) cout << "No tiene soluciones reales";
	if (Sol == 1) cout << "Tiene una solucion real: x1 =" << ix1;
	if (Sol == 2) cout << "Tiene dos soluciones reales x1 =" << ix1 << " x2 = " << ix2;
	cout << "\n";
	cout << "\n";

}