package Kapitel2;

public class StringDemo {

	public static void main(String[] args) {
		String s = "Hallo !";
		s = s + " Ich bin " + 34 + " Jahre alt.";
		System.out.println(s);
		
		// Strings inhaltlich vergleichen
		String s1 = "Hallo";
		String s2 = new String("Hallo");
		if (s1 != s2) { // Referenzen vergleichen
			System.out.println("Objektreferenzen sind ungleich!");
		}
		if (s1.equals(s2)) { // Inhalte vergleichen
			System.out.println("Stringinhalte sind gleich!");			
		}
		
		// Toolbox
		System.out.printf("Länge von s1: %d%n", s1.length());
		System.out.printf("'   abc   ' ohne Leerzeichen: %s%n", "   abc   ".trim());
		if (s1.trim().length() == 0) {
			// s1 hatte nur Leerzeichen!
		}
		
		// suche einen String in einem String
		int pos = s1.indexOf("ll");
		System.out.printf("ll-Position: %d%n", pos);
		String filename = "datei1.info.txt";
		int punkt = filename.lastIndexOf(".");
		if (punkt != -1) {
			String extension =  filename.substring(punkt + 1);
			System.out.printf("%s, ext = %s%n", filename, extension);
		}
		
		String pfad = "X:\\Songs\\falco.ogg"; // Linux X: -> /X/
		char driveLetter = pfad.charAt(0);
		char colon = pfad.charAt(1);
		if ((driveLetter >= 'A' && driveLetter <= 'Z' || 
			driveLetter >= 'a' && driveLetter <= 'z') && 
			colon == ':') {
			pfad = "/" + driveLetter + "/" + pfad.substring(2);
		}
	}

}
