package kapitel3;

/**
 * Idee: allgemeine Basisklasse mit Vorgaben für konkrete Klassen
 * 
 */
abstract class Person {
	protected String name;

	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	abstract void essen();
	
	@Override
	public String toString() {
		return name;
	}
}

class Dozent extends Person {

	public Dozent(String name) {
		super(name);
	}

	@Override
	void essen() {
		System.out.println("Gehe zum Reimanns zum Essen - Yumm!");		
	}
	
}

public class Student extends Person {

	private int matrNr;
	
	public Student(String name, int matrNr) {
		// Konstruktorenverkettung bei Vererbung
		super(name); // Aufruf von Person(name)
		// this.name = name; Überflüssig!
		this.matrNr = matrNr;
	}
	
	@Override
	public String toString() {
		return "[Student, name = " + getName() + ", # = " + matrNr + "]";
	}
	
	public static void main(String[] args) {
		// Person p = new Person("Hugo"); geht nicht mehr!
		Student anna = new Student("Anna", 4711);
		System.out.println(anna);
	}

	@Override
	public void essen() {
		System.out.println("Gehe in die Mensa zum Essen - Yumm!");
	}

}
