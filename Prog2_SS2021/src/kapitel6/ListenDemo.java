package kapitel6;

import java.util.ArrayList;

public class ListenDemo {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>(); // ArrayList für Strings
		
		// Hinzufügen
		strings.add("Ein String!");
		strings.add("zweiter String");
		strings.add("4"); 

		// Iteration
		for (int i = 0; i < strings.size(); ++i) {
			System.out.println(strings.get(i));
//			if (strings.get(i) instanceof String) {
//				String s = (String) strings.get(i);
//				System.out.println(s);
//			} else {
//				System.out.println("no String at index " + i);
//			}
		}
	}

}
