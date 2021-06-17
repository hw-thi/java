package kapitel4;

import java.util.ArrayList;

public class WrapperDemo {
	static public void main(String[] args) {
		// Problem: int ist primitiv - wir brauchen einen Objektwert (Klasse für int)!!
		// Wrapper-Klassen
		// int -> Integer
		// boolean -> Boolean
		// char -> Character
		// float/double -> Float/Double
		// long -> Long
		ArrayList<Integer> intListe = new ArrayList<Integer>();
		
		intListe.add(Integer.valueOf(3)); 
		intListe.add(7);// Autoboxing: int -> Integer
		intListe.add(-15);// Autoboxing: int -> Integer
		
		// Auto-Unboxing
		int wert = intListe.get(0); // Integer -> int
		int wert2 = intListe.get(0).intValue();
		
		for (int i : intListe) {
			System.out.println(i);
		}
	}
}
