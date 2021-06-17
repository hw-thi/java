package Kapitel2;

public class Konto {

	// Attribute
	int nr; // UML nr: int
	float stand; 
	int pin;
	
	// Methoden
	void geldAbheben(float betrag) {
		// betrag von stand abheben
		stand = stand - betrag;
		System.out.println("kontstand: " + stand);
	}
	
}
