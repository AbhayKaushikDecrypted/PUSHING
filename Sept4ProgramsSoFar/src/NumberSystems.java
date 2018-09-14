import java.util.Scanner;

public class NumberSystems {
	static Scanner scn = new Scanner(System.in);
	static int counter = 0;

	public static void main(String[] args) {
		System.out.println("enter number");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		// GCD(n1,n2);
		// REVERSE(n1);
		// DTB(n1);
		// System.out.println();
		// BTD(n2, 0, 1);
		// A2O(n1, n2);
		// S2O(n1, n2);
	}

	private static void GCD(int n1, int n2) {
		int rem = n2 % n1;
		if (rem == 0) {
			System.out.print(n1);
			return;
		}
		GCD(rem, n1);
	}

	private static void REVERSE(int n1) {
		if (n1 == 0) {
			return;
		}
		int rem = n1 % 10;
		System.out.print(rem);
		REVERSE(n1 / 10);
	}

	private static void DTB(int n1) {
		if (n1 == 0) {
			return;
		}
		DTB(n1 / 2);
		int rem = n1 % 2;
		System.out.print(rem);
	}

	private static void BTD(int n1, int sum, int pv) {
		if (n1 == 0) {
			System.out.println(sum);
			return;
		}
		int rem = n1 % 10;
		sum = sum + (rem * pv);
		BTD(n1 / 10, sum, pv * 2);
	}

	private static void A2O(int n1, int n2) {
		int sum = 0;
		int c = 0;
		int pv = 1;
		while (n1 != 0 || n2 != 0 || c != 0) {
			int rem1 = n1 % 10;
			n1 = n1 / 10;
			int rem2 = n2 % 10;
			n2 = n2 / 10;
			int sum1 = rem1 + rem2 + c;
			c = sum1 / 8;
			int dig = sum1 % 8;
			sum = sum + (dig * pv);
			pv = pv * 10;
		}
		System.out.println(sum);
	}

	private static void S2O(int n1, int n2) {
		int sum = 0;
		int b = 0;
		int pv = 1;
		int dif = 0;
		while (n1 != 0 || n2 != 0) {
			int rem1 = n1 % 10;
			n1 = n1 / 10;
			int rem2 = n2 % 10;
			n2 = n2 / 10;
			if ((rem1 - b) < rem2) {
				dif = rem1 + 8 - rem2 - b;
				b = 1;
			} else {
				dif = rem1 - rem2 - b;
				b = 0;
			}
			sum = sum + (dif * pv);
			pv = pv * 10;
		}
		System.out.println(sum);
	}
}
