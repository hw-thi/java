package kapitel1;

import java.util.Scanner;

/**
 * Setzt folgenden Python-Code um:
		def ggT(zahl1, zahl2):
		    """ Liefert das ggT von zahl1 und zahl2 """
		    while zahl1 > 0:
		        if zahl1 < zahl2:
		            (zahl1, zahl2) = (zahl2, zahl1)
		        zahl1 = zahl1 - zahl2
		    return zahl2
		
		x = int(input('x = '))
		y = int(input('y = '))
		print('ggt =', ggT(x, y))
 * @author windisch
 *
 */
public class GGTUebung {
	/**
	 * Liefert das ggT von zahl1 und zahl2
	 * @param zahl1
	 * @param zahl2
	 * @return ggT
	 */
	private static int ggT(int zahl1, int zahl2) {
		// while zahl1 > 0:
		while (zahl1 > 0) {
			// if zahl1 < zahl2:
			if (zahl1 < zahl2) {
				// (zahl1, zahl2) = (zahl2, zahl1)
				int tmp = zahl1;
				zahl1 = zahl2;
				zahl2 = tmp;
			}
			// zahl1 = zahl1 - zahl2
			zahl1 = zahl1 - zahl2;
		}
		// return zahl2
		return zahl2;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// x = int(input('x = '))
		System.out.print("x = ");
		int x = scanner.nextInt();
		// y = int(input('y = '))
		System.out.print("y = ");
		int y = scanner.nextInt();
		// print('ggt =', ggT(x, y))
		System.out.println("ggt = " + ggT(x, y));
		scanner.close();
	}
}








