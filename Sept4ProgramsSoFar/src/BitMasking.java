import java.time.OffsetDateTime;
import java.util.Scanner;

public class BitMasking {
	static Scanner scn = new Scanner(System.in);
	static int counter = 0;

	public static void main(String[] args) {
		System.out.println("enter number");
		int n1 = scn.nextInt();
		// CHECK(n1);
		// ON(n1);
		// OFF(n1);
		// TOGGLE(n1);
		// PRINTALLBITS(n1);
	}

	private static void CHECK(int n1) {
		System.out.println("enter bit");
		int n2 = scn.nextInt();
		int mask = 1;
		mask = mask << n2;
		if ((n1 & mask) == mask) {
			System.out.println("bit is ON");
		} else {
			System.out.println("bit is OFF");
		}

	}

	private static void ON(int n1) {
		System.out.println("enter bit");
		int n2 = scn.nextInt();
		int mask = 1;
		mask = mask << n2;
		n1 = n1 | mask;
		System.out.println(n1);
	}

	private static void OFF(int n1) {
		System.out.println("enter bit");
		int n2 = scn.nextInt();
		int mask = 1;
		mask = ~(mask << n2);
		n1 = n1 & mask;
		System.out.println(n1);
	}

	private static void TOGGLE(int n1) {
		System.out.println("enter bit");
		int n2 = scn.nextInt();
		int mask = 1;
		mask = mask << n2;
		n1 = n1 ^ mask;
		System.out.println(n1);
	}

	private static void PRINTALLBITS(int n1) {

		for (int j = 31; j >= 0; j--) {
			int mask = 1;
			mask = mask << j;
			if ((n1 & mask) == mask) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
		}
	}

}
