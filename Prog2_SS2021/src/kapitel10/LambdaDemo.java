package kapitel10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Person implements Comparable<Person> {
	private String name;
	private int alter;
	private String geschlecht;
	
	public Person(String name, int alter, String geschlecht) {
		this.name = name;
		this.alter = alter;
		this.geschlecht = geschlecht;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public String getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", alter=" + alter + ", geschlecht=" + geschlecht + "]";
	}
	
	@Override
	public int compareTo(Person p) {
		return getAlter() - p.getAlter();
	}
	
}

@FunctionalInterface
interface MathOperation {
	int operation(int operand1, int operand2);
}

//interface Predicate<T> {
//	boolean test(T t);
//}
//
//interface Comsumer<T> {
//	void accept(T t);
//}

public class LambdaDemo {

	static private int berechne(int op1, int op2, MathOperation op) {
		return op.operation(op1, op2);
	}
	
	static private void verarbeitePersonen(List<Person> personen, Predicate<Person> zuVerarbeiten, Consumer<Person> consumer) {
		for (Person p : personen) 
			if (zuVerarbeiten.test(p)) {
				consumer.accept(p);
			}
	}
	
	public static void main(String[] args) {
		// Summe von x und y
		MathOperation summeOp = (x, y) -> x + y;
		int summe = berechne(4, 3, summeOp);
		int produkt = berechne(4, 3, (x, y) -> x * y);
		
		List<Person> personen = Arrays.asList(new Person("Hugo", 17, "M"), 
				new Person("Anna", 16, "W"), new Person("Sandra", 19, "W"));
		
		// gib vollj�hrige Personen aus
		verarbeitePersonen(personen, p -> p.getAlter() >= 18, p -> System.out.println(p));
		// gib Namen der Minderj�hrigen aus
		verarbeitePersonen(personen, p -> p.getAlter() < 18, p -> System.out.println(p.getName()));
		
		Collections.sort(personen);
		System.out.println(personen);
		/**
		 * Lambda: <parameterliste> -> Anweisung (ohne return) | Block
		 */
		Comparator<Person> personenVergleicher = (p1, p2) -> p1.getGeschlecht().compareTo(p2.getGeschlecht()); 
		
		// 1. Anweisung		
		Collections.sort(personen, personenVergleicher);
		// 2. mit Block
		Collections.sort(personen, (p1, p2) -> {
			return p1.getGeschlecht().compareTo(p2.getGeschlecht());	
		});
		// Parameter: () ab mehr als 1 Param. oder wenn Typen verwendet werden
		Collections.sort(personen, (Person p1, Person p2) -> {
			return p1.getGeschlecht().compareTo(p2.getGeschlecht());	
		});

	
		Collections.sort(personen, personenVergleicher);
}

}
