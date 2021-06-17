package Kapitel2;

class AudioFile {
	private String pathname, filename, author, title;
	
	public void parsePathname(String s) {
		// s > pathname, filename
	}
	public void parseFilename(String s) {
		// s > author, title
	}
	// Getter für "pathname"
	public String getPathname() {
		return pathname; // keine Logik!
	}
	// Setter für "pathname"
	public void setPathname(String value) {
		pathname = value;
	}
	public String getFilename() {
		return filename;
	}
	
}

public class GetterSetterDemo {

	public static void main(String[] args) {
		AudioFile af = new AudioFile();
		af.parsePathname("/media/songs/falco - rock me.mp3");
		af.parseFilename(af.getFilename());
	}

}
