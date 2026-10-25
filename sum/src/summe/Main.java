package summe;

import funktion.eins.eins.xq.Xq;

public class Main {

    static void beispieleins() {

	// int_0^1 x^2 = 1/3 durch 1000 Schritte
	Xq xq = new Xq(1,0,0);
	double slinks = Riemannsummelinks.summe(xq, 0, 1, 100);
	double srechts = Riemannsummerechts.summe(xq, 0, 1, 100);
	double smitte = Riemannsummemitte.summe(xq, 0, 1, 100);
	System.out.println(slinks);
	System.out.println(srechts);
	System.out.println(smitte);
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
