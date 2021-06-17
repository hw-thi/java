package Kapitel2;

public class Rechteck {

	public static int maxLaenge = 10;
	
	// Attribute
	int laenge, breite;
	
	// Konstruktoren
	Rechteck(int laenge, int breite) {
		if (laenge > maxLaenge) {
			throw new RuntimeException("L‰nge zu groﬂ!");
		}
		this.laenge = laenge;
		this.breite = breite;
	}
	Rechteck(int wert) {
		//laenge = wert;
		//breite = wert;
		// Aufruf des 1. CTOR
		// Konstruktorenverkettung!
		this(wert, wert); 
	}
	
	int flaeche() {
		return laenge * breite;
	}
	
	// Aufruf durch JVM: Rechteck.main(...);
	
	public static void main(String[] args) {
		System.out.printf("maximale L‰nge: %d%n", Rechteck.maxLaenge);
		Rechteck r1 = new Rechteck(15, 3);
		System.out.printf("Fl‰che: %d%n", r1.flaeche());
		Rechteck r2 = new Rechteck(5);
		System.out.printf("Fl‰che: %d%n", r2.flaeche());
	}

}

class Quadrat2 extends Rechteck {
	public static int maxLaenge = 20;
	Quadrat2(int l, int b) {
		super(l, b);
	}
	
}
