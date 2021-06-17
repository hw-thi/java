package kapitel5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

class Kontakt {
	private String name;

	public Kontakt(String name) {
		super();
		this.name = name;
	}
	
}

class Nachricht implements Comparable {
	private int id;
	private Kontakt sender, empfaenger;
	private String text;
	private Date sendezeit;

	public Nachricht(int id, Kontakt sender, Kontakt empfaenger, String text, Date sendezeit) {
		this.id = id;
		this.sender = sender;
		this.empfaenger = empfaenger;
		this.text = text;
		this.sendezeit = sendezeit;
	}
	public int getId() {
		return id;
	}
	public Kontakt getSender() {
		return sender;
	}
	public Kontakt getEmpfaenger() {
		return empfaenger;
	}
	public String getText() {
		return text;
	}
	public Date getSendezeit() {
		return sendezeit;
	}
	@Override
	public int compareTo(Object o) {
		Nachricht n1 = this;
		Nachricht n2 = (Nachricht) o;
		return n1.getSendezeit().compareTo(n2.getSendezeit());
	}
}

class NachrichtenComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Nachricht n1 = (Nachricht) o1;
		Nachricht n2 = (Nachricht) o2;
		return n1.getSendezeit().compareTo(n2.getSendezeit());
	}
}

public class Nachrichtenaufgabe {

	public static void main(String[] args) throws ParseException {
		String dateString1 = "03.05.2021 10:31:12", dateString2 = "03.05.2021 10:31:20";
	    Date date1 = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss").parse(dateString1);  
	    Date date2 = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss").parse(dateString2);  
		Kontakt susie = new Kontakt("Susie"), herbert = new Kontakt("Herbert");
		Nachricht n1 = new Nachricht(4711, susie, herbert, "Hallo!", date1);
		Nachricht n2 = new Nachricht(4712, herbert, susie, "Hallo zurück!", date2);
		
		NachrichtenComparator c = new NachrichtenComparator();
		int vergleich = c.compare(n1, n2);
		System.out.println(vergleich);
		
		vergleich = n1.compareTo(n2);
		System.out.println(vergleich);
	}

}
