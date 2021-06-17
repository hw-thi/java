package kapitel5;

import java.util.Arrays;
import java.util.Comparator;

// Comparator-Interface
//interface Comparator {
//	int compare(Object o1, Object o2);
// 		Ergebnis:
//			> 0 (z.B. 1):	o1 > o2
//			< 0 (z.B. -1):	o1 < o2
//			0: 			 :	o1 gleich o2 
//}

class Quadratvergleicher1 implements Comparator {
	@Override
	/**
	 * vergleicht Quadrate nach Namen
	 */
	public int compare(Object o1, Object o2) {
		Quadrat q1 = (Quadrat) o1;
		Quadrat q2 = (Quadrat) o2;
		String name1 = q1.getName();
		String name2 = q2.getName();
		return name1.compareTo(name2);
	}
}

class Quadratvergleicher2 implements Comparator {
	@Override
	/**
	 * vergleicht Quadrate nach Umfang
	 */
	public int compare(Object o1, Object o2) {
		Quadrat q1 = (Quadrat) o1;
		Quadrat q2 = (Quadrat) o2;
		int umfang1 = q1.umfang();
		int umfang2 = q2.umfang();
		return umfang1 - umfang2; // geht nicht bei double/float !!!
	}
}

class Quadrat implements Comparable {
	private String name;
	private int seitenlaenge;
	
	public String getName() {
		return name;
	}
	
	public int umfang() {
		return 4 * seitenlaenge;
	}
	
	public Quadrat(int seitenlaenge, String name) {
		this.seitenlaenge = seitenlaenge;
		this.name = name;
	}
	
	@Override
	/**
	 * Vergleicht zwei Quadrate anhand ihrer Seitenlänge.
	 */
	public int compareTo(Object o) {
		if (!(o instanceof Quadrat))
			throw new RuntimeException("compareTo: kein Quadrat übergeben!");
		Quadrat q = (Quadrat) o;
		if (this.seitenlaenge < q.seitenlaenge) {
			return -1; // aufgerufenes Objekt < Übergebenes Q.
		} else if (this.seitenlaenge > q.seitenlaenge) {
			return 1; // aufgerufenes Objekt > Übergebenes Q.
		}
		
		return 0; // beide Quadrate gleich
	}

	@Override
	public String toString() {
		return "Quadrat [seitenlaenge=" + seitenlaenge + "]";
	}
	
}

public class SortierDemo {

	public static void main(String[] args) {
		int[] zahlen = { 5, 33, 42, -15 };
		Integer i1 = 3, i2 = 55;
		int vergleich = i1.compareTo(i2);
		Arrays.sort(zahlen);
		for (int i : zahlen) {
			System.out.println(i);
		}
		
		Quadrat q1 = new Quadrat(31,"q1"), q2 = new Quadrat(1, "q2"), q3 = new Quadrat(5, "q3");
		Quadrat[] quadrate = { q1, q2, q3 };
		Arrays.sort(quadrate);
		for (Quadrat q : quadrate) {
			System.out.println(q);
		}
		Arrays.sort(quadrate, new Quadratvergleicher1());
		for (Quadrat q : quadrate) {
			System.out.println(q);
		}
		Arrays.sort(quadrate, new Quadratvergleicher2());
		for (Quadrat q : quadrate) {
			System.out.println(q);
		}
		
		int v1 = q1.compareTo(q2);
		//int quatsch = q1.compareTo("abc");
	}

}
