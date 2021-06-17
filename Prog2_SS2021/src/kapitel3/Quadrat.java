package kapitel3;

public class Quadrat /* implizit: extends Object */ {
	private int seitenlaenge;
	
	public Quadrat(int seitenlaenge) {
		this.seitenlaenge = seitenlaenge;
	}
	
	@Override
	public String toString() {
		return "Quadrat(seitenlaenge = " + seitenlaenge + ") was: " +
				super.toString();
	}
	
	@Override
	public final boolean equals(Object o) {
		if (o instanceof Quadrat) {
			Quadrat q = (Quadrat) o; // typecast: Object -> Quadrat
			return q.seitenlaenge == seitenlaenge;
		} else {
			return false; // Typen passen nicht!
		}
	}
	
	public static void main(String[] args) {
		final Quadrat q1 = new Quadrat(3);
		Quadrat q2 = new Quadrat(3);
		
		String q1String = q1.toString();
		System.out.println(q1.getClass().getName() + ": " + q1String);
		
		if (q1.equals(q2)) {
			System.out.println("gleich!");
		} else {
			System.out.println("ungleich!");			
		}
		
		boolean b = q1.equals("aaa");
		System.out.println(b);
	}

}
