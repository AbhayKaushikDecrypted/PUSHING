import java.util.Scanner;

public class Characters {
	static Scanner scn = new Scanner(System.in);
	static int counter = 0;

	public static void main(String[] args) {
		// System.out.println("enter character");
		// char ch = scn.nextLine().charAt(0);
		// CHECKCASE(ch);
		// CHANGECASE(ch);
		// Cel2Farh();
	}

	private static void CHECKCASE(char ch) {
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("lowercase");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("UPPERCASE");
		} else {
			System.out.println("Special Character");
		}
	}

	private static void CHANGECASE(char ch) {
		if (ch >= 'a' && ch <= 'z') {
			ch = (char) (ch - ('z' - 'Z'));
			System.out.println(ch);
		} else if (ch >= 'A' && ch <= 'Z') {
			ch = (char) (ch + ('z' - 'Z'));
			System.out.println(ch);
		} else {
			System.out.println("Special Character");
		}
	}

	private static void Cel2Farh() {
		System.out.println("enter start, end & increment size");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int n3 = scn.nextInt();
		System.out.println("F" + "\t" + "C");
		for (int i = n1; i <= n2; i += n3) {
			int cel = (int) ((5.0 / 9) * (i - 32));
			System.out.print(i + "\t" + cel);
			System.out.println();
		}
	}
}
