
public class ScannerTest {

	public static void main(String[] args) {
		System.out.print("3 Zahlen: ");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		System.out.println(x + y + z);
	}

}
