package Kapitel2;

public class Quadrat {
	// Attribute
	double seitenlaenge;
	
	// Default-Konstruktor
	Quadrat() {
	}
	// Initialisierung des Quadrat-Objekts
	Quadrat(double initSeitenlaenge) {
		seitenlaenge = initSeitenlaenge;
	}
	
	// Methoden
	void setSeitenlaenge(double wert) {
		seitenlaenge = wert;
	}
	
	double flaeche() {
		return seitenlaenge * seitenlaenge;
	}
	
	static int quadriere(int n) {
		return n * n;
	}
	
	@Override
	public boolean equals(Object o) {
		Quadrat q = (Quadrat) o; // ClassCastException, falls keine Quadratref vorhanden
		return this.seitenlaenge == q.seitenlaenge;
	}
	
	static public void main(String[] args) {
		Quadrat q1 = new Quadrat(3.0);
		Quadrat q2 = new Quadrat(3.0);
		
		if (q1 != q2) { // zeigen q1 und q2 auf unterschiedliche Objekte?
			System.out.println("q1 != q2");
		}
		if (q1.equals(q2)) {
			System.out.println("q1 gleich q2 (inhaltsgleich)");			
		}
		if (q1.equals("a")) {
			System.out.println("q1 gleich q2 (inhaltsgleich)");			
		}
	}
}
