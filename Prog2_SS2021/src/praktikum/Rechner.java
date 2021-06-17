package praktikum;

public class Rechner {

	public int add(int x, int y) {
		int erg = x + y;
		return erg;
	}
	
	public static void main(String[] args) {
		Rechner rechner1 = new Rechner(); // Rechner-Objekt erzeugen
		System.out.printf("3 + 5 = %d\n", rechner1.add(3, 5));
	}

}
