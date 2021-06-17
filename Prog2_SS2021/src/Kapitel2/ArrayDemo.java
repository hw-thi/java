package Kapitel2;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// Array für 5 int's
		int[] intArray = new int[5]; // Arrays sind Objekte!
		// Initialisierung: alles 0!
		for (int i = 0; i < intArray.length; ++i) {
			intArray[i] = i+1;
		}
		
		int[] intArray2 = { 3, 97, 11 };
		int i = 0;
		for (int wert : intArray2) {
			System.out.printf("intArray[%d] = %d%n", i++, wert);
		}
		
		// Sortierung
		Arrays.sort(intArray2);
		i = 0;
		for (int wert : intArray2) {
			System.out.printf("intArray[%d] = %d%n", i++, wert);
		}
	}

}
