package kapitel4;

enum AmpelZustand {
	ROT, GELB_ROT, GRUEN, GELB;
	
	@Override
	public String toString() {
		return name() + "(" + ordinal() + ")";
	}
}

public class Ampelsteuerung {
	private AmpelZustand zustand;
	
	private void start(String startZustand) {
		// rot -> rot-gelb -> grün -> gelb -> ...
		
		zustand = AmpelZustand.valueOf(startZustand);
		//zustand = AmpelZustand.ROT;
		
		for (int schritt = 0; schritt < 10; ++schritt) {
			System.out.print(zustand);
			switch (zustand) {
				case ROT:
					zustand = AmpelZustand.GELB_ROT;
					break;
				case GELB_ROT:
					zustand = AmpelZustand.GRUEN;
					break;
				case GRUEN:
					zustand = AmpelZustand.GELB;
					break;
				case GELB:
					zustand = AmpelZustand.ROT;
					break;
			}
			System.out.println(" -> " + zustand);
		}
	}

	public static void main(String[] args) {
		// alle Ampelzustände ausgeben
		for (AmpelZustand zustand : AmpelZustand.values()) {
			System.out.println(zustand);
		}
		
		Ampelsteuerung ampelsteuerung = new Ampelsteuerung();
		ampelsteuerung.start("ROT");
	}

}
