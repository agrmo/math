package funktion.eins.eins.xq;

import funktion.eins.eins.Einseinsfunktion;

// ax^2+bx+c
public class Xq implements Einseinsfunktion {

    double a;
    double b;
    double c;
    
    public Xq(double a, double b, double c) {
	this.a = a;
	this.b = b;
	this.c = c;
    }

    public double[] berechne(double[] x) {
	
	double[] y = new double[x.length];

	for (int i = 0; i < x.length; i++) {
	    y[i] = a*x[i]*x[i]+b*x[i]+c;
	}

	return y;	
    }
}
