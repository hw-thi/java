
public class StringDemo {

	private static boolean isWindows() {
		return false; // Linux
	}
	
	public static void main(String[] args) {
		// Pfadseparator: liest 1. Zeichen von Property file.separator
		char separatorChar = System.getProperty("file.separator").charAt(0);
		System.out.println("Pfadtrenner: " + separatorChar);
		
		// windows Pfad:
		String pfad1 = "D:\\Daten\\Musik\\Falco – Rock Me Amadeus.mp";
		String pfadNeu = pfad1;
		// unter Linux -> "/D/Daten/Musik/Falco - Rock Me Amadeus.mp";
		
		// 1. Teilaufgabe: suche nach Laufwerksbezeichnung "D:"
		if (pfad1.length() >= 2) {
			char zeichen1 = pfad1.charAt(0);
			char zeichen2 = pfad1.charAt(1);
			
			// Muster: Buchstabe (gross oder klein) + ":"
			char zeichen1Klein = Character.toLowerCase(zeichen1); // 1. Zeichen in Kleinbuchstabe wandeln
			if (('a' <= zeichen1Klein && zeichen1Klein <= 'z')
					&& zeichen2 == ':') {
				System.out.println("Laufwerk: " + zeichen1);
				if (!isWindows()) {
					// unter Linux
					// D: \Daten\Musik\Falco – Rock Me Amadeus.mp
					// 1. String: D:
					// 2. String: \Daten\Musik\Falco – Rock Me Amadeus.mp
					// Ergebnis: /D + \Daten\Musik\Falco – Rock Me Amadeus.mp
					pfadNeu =  "/" + zeichen1 + pfad1.substring(2); // alles ab 2. Index (ab 3. Zeichen)
					System.out.println(pfadNeu);
				}
			}
		}
		
		// 2. Teilaufgabe: Pfadtrenner korrigieren - pfadneu soll die "richtigen" Pfadtrenner enthalten
		String pfadErgebnis = "";
		for (int i = 0; i < pfadNeu.length(); ++i) {
			char zeichen = pfadNeu.charAt(i);
			
			if (isWindows()) {
				if (zeichen == '/') {
					pfadErgebnis += '\\';
				} else {
					pfadErgebnis += zeichen;
				}				
			} else {
				// Linux/Mac
				if (zeichen == '\\') {
					pfadErgebnis += '/';
				} else {
					pfadErgebnis += zeichen;
				}
			}
		}
		System.out.println(pfadErgebnis);
		
		/* weitere Methoden:
		 * - s.indexOf(str): sucht in s nach str, liefert Position von str oder -1
		 * - s.lastIndexOf(str): sucht in s nach str (von rechts nach links), liefert Position von str oder -1
		 * - s.trim: entfernt Leerzeichen vorne und hinten 
		 * - s.replace(char1, char2): ersetzt alle Zeichen char1 durch char2
		 */
		// 3. Teilaufgabe: Dateierweiterung (Extension) ermitteln
		int letzterPunktPosition = pfadErgebnis.lastIndexOf(".");
		if (letzterPunktPosition == -1) {
			System.out.println("keine Extension vorhanden!");
		} else {
			System.out.printf("Name ohne Extension: %s, Extension: %s%n",
					pfadErgebnis.substring(0, letzterPunktPosition), pfadErgebnis.substring(letzterPunktPosition+1));			
		}
	}

}








