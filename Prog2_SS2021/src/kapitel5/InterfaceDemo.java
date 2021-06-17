package kapitel5;

interface IFigur {
	double flaeche();
	String name();
}

class Kreis implements IFigur {
	private double radius;

	public Kreis(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public String name() {
		return "Kreis";
	}
	public double flaeche() {
		return radius * radius * Math.PI;
	}
	
//	public double addiereFlaeche(Kreis k) {
//		return flaeche() + k.flaeche();
//	}
//
//	public double addiereFlaeche(Rechteck r) {
//		return flaeche() + r.flaeche();
//	}
	
	public double addiereFlaeche(IFigur f) {
		return flaeche() + f.flaeche();
	}
}

class Rechteck implements IFigur {
	private int laenge, breite;

	public Rechteck(int laenge, int breite) {
		this.laenge = laenge;
		this.breite = breite;
	}

	public double flaeche() {
		return (double) laenge * breite;
	}

	public String name() {
		return "Rechteck";
	}
	
	public int getLaenge() {
		return laenge;
	}

	public int getBreite() {
		return breite;
	}
	
}

class Auto implements IFigur {
	public double flaeche() {
		return 99.9;
	}
	public String name() {
		return "Auto";
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Kreis k1 = new Kreis(3.9);
		Kreis k2 = new Kreis(2.0);
		Rechteck r1 = new Rechteck(2, 3);
		System.out.println(k2.name() + k1.addiereFlaeche(k2));
		System.out.println(r1.name() + k1.addiereFlaeche(r1));
		Auto a = new Auto();
		System.out.println(a.name() + k1.addiereFlaeche(a));
	}
}
