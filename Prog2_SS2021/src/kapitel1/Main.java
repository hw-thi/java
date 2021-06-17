package kapitel1;








public class Main {  
	public static void main(String[] args) {    
		int year = 2009;    
		String color = "red";    
		double price = 3999.99;    
		float consumption = 6.5f;
		
		// Ausgabe: The car is from <year>, has the color <color>, consumes <consumption> l/100km and costs <price> Euros.
		System.out.println("The car is from " + year + ", has the color <color>, consumes <consumption> l/100km and costs <price> Euros.");
		System.out.printf("The car is from %06d, has the color <color>, consumes %.1f l/100km and costs <price> Euros.", year, consumption);
	}
}
