package summe;

import funktion.eins.eins.Einseinsfunktion;

// Eine Riemann-Summe von links.
public class Riemannsummelinks {

    public static double summe(Einseinsfunktion funktion,
			       double von, double bis, int anzahl) {

	double abstand = Math.abs(von-bis)/anzahl;
	double[] x = new double[anzahl];

	for (int i = 0; i < anzahl; i++) {
	    x[i] = i * abstand + von;
	}

	double summelinks = 0;
	double[] fx = funktion.berechne(x);

	for (int i = 0; i < fx.length; i++) {
	    summelinks += fx[i] * abstand;
	}

	return summelinks;
    }
}
