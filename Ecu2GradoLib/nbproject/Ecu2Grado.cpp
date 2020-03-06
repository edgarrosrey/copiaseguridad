//Edgar Rosa Rey
#include "Ecu2Grado.h"
#include <math.h>
#include <iostream>
int calcularEcuacion(double ia, double ib, double ic, double& ox1, double& ox2) {
	double d;
	int numSols;
	d = ib * ib - 4 * ia * ic;


	if (d < 0)numSols = 0;
	else if (d == 0)
	{
		numSols = 1;
		ox1 = -ib / (2 * ia);
	}
	else if (d > 0)
	{
		numSols = 2;
		ox1 = (-ib + sqrt(d)) / (2 * ia);
		ox2 = (-ib - sqrt(d)) / (2 * ia);
	}
	return numSols;

}
