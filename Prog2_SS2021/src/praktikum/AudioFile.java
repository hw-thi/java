package praktikum;

import cert.EmulateOtherOs;

public class AudioFile {
	// Attribute
	private String pathname, filename; // 1. Schritt: parsePathname(String s) 
	private String author, title; 	   // 2. Schritt: parseFilename(String s) 
	
	private char separatorChar = System.getProperty("file.separator").charAt(0);
	
	private boolean isWindows() {
		String os = System.getProperty("os.name").toLowerCase();
		System.out.println("Betriebssystem: " + os);
		return os.indexOf("win") >= 0; // win in os gefunden ?
	}

	private String replaceString(String s, String findMe, 
			String replaceWith) {
		String result = "";
		int index = 0;
		
		for (;;) {
			int pos = s.indexOf(findMe, index);
			if (pos == -1) {
				result += s.substring(index);
				break; // Schleife verlassen
			}
			result += s.substring(index, pos);
			result += replaceWith;
			index = pos + 2;
		}
		return result;
	}
	
	public void parsePathname(String s) {
		
		// mehrfach-Vorkommen von Pfadtrennern durch einfach Pfadtrenner ersetzen
		// Beispiel: /my-tmp////part1//file.mp3/ -> /my-tmp/part1/file.mp3/
		// Idee: ersetze // durch / solange // gefunden wird
		
		while (s.indexOf("//") != -1)
			s = replaceString(s, "//", "/");
		while (s.indexOf("\\\\") != -1)
			s = replaceString(s, "\\\\", "\\");
		
		if (isWindows()) {
			s = s.replace('/', '\\');
		} else {
			// Linux/Mac
			s = s.replace('\\', '/');
			
			// prüfe, ob Laufwerksbezeichnung vorliegt: "D: ..."
			char erstesZeichen = s.charAt(0);
			char zweitesZeichen = s.charAt(1);
			
			//if (Character.isLetter(zweitesZeichen))
			if ((erstesZeichen >= 'A' && erstesZeichen <= 'Z' || 
				erstesZeichen >= 'a' && erstesZeichen <= 'z') && 
					zweitesZeichen == ':') {
				s = "/" + erstesZeichen + "/" + s.substring(3);
			}
		}
	}
	
	public void parseFilename(String s) {
		// Zerlege s in author und title
		// TODO
	}
	
	public String getPathname() {
		return pathname;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return "not yet implemented!";
	}
	
	/**
	 * Beispiele:
	 * /my-tmp/file.mp3
	 * unter Windows: \my-tmp\file.mp3
	 * unter Linux: /my-tmp/file.mp3 (\ -> / ersetzen)
	 */
	
	public static void main(String[] args) throws Exception {

		//EmulateOtherOs.emulateLinux();
		AudioFile af = new AudioFile();
		System.out.println(af.separatorChar);
		if (af.isWindows())
			System.out.println("unter windows!");
		else
			System.out.println("unter linux!");
		
		af.parsePathname("//my-tmp////part1//file.mp3/");
		System.out.println(af.getPathname()); // Normalisierung, Laufwerksbehandlung
		System.out.println(af.getFilename());
//		af.parseFilename(af.getFilename());
//		System.out.println(af.getAuthor());
//		System.out.println(af.getTitle());
//		System.out.println("Audiofile: " + af.toString());
		
		String s3 = "Hans-Georg Sonstwas -  Blue-eyed boy-friend.mp3";
		int punkt = s3.lastIndexOf('.');
		if (punkt == -1) {
			// keine Extension!
		} else {
			// Extension ausschneiden
			s3 = s3.substring(0, punkt);
		}
	}

}
