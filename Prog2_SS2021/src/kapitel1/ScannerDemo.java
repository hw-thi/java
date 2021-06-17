package kapitel1;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in); // Scanner erzeugen und in scanner merken
		// Python: x = int(input('Zahl: '))
		System.out.print("Zahl: ");
		int x = scanner.nextInt();
		System.out.println(x + 5);
		
		scanner.nextLine(); // \n lesen
		System.out.print("String: ");
		String zeile = scanner.nextLine(); // ganze Zeile
		System.out.println("Zeile: " + zeile);
		
		System.out.print("Fließkomma-Zahl: ");
		double d = scanner.nextDouble();
		System.out.println("Double: " + d);
		*/
		// Variable y um eins erhöhen: y += 1
		int y = 5;
		int z1 = y++; // y um 1 erhöhen: y = 6, z1 = 5 (Post-Inkrement)
		int z2 = ++y; // y um 1 erhöhen: y = 7, z2 = 7 (Prä-Inkrement)
		
		
		// for-Schleife
		// Python: for i in range(0, 10, 2): print(i) -> 0..9
		for (int i = 0;	i < 10; i += 2) {
			if (i > 5) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
