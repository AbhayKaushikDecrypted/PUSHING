import java.util.Arrays;
import java.util.Scanner;

public class BasicsAndPrime {
	static Scanner scn = new Scanner(System.in);
	static int counter = 0;

	public static void main(String[] args) {
		// HW(); // HELLO WORLD
		// SI(); // SIMPLE INTEREST
		// LOT(); // LARGEST OF THREE
		// PTN(); //print till n
		System.out.println("enter number");
		int n = scn.nextInt();
		// IsPrime1(n);
		// IsPrime2(n);
		// IsPrime3(n);
		// PTNR(n); //print till n using recursion
		// int sum = STNR(n); // sum till N
		// System.out.println(sum);
		// System.out.println(IPR(n, 2)); // is prime using recursion
		// IPAlgorithm(n); // is prime using Algorithm seive of eratostenes
		// APR(n, 2, 2); // all primes using recursion
		// APAlgorithm(n); // all primes using Algorithm seive of eratostenes

	}

	private static void HW() {
		System.out.println("enter number and string to be displayed");
		int n = scn.nextInt();
		String str = scn.next();
		System.out.println(n + "." + str);
		scn.close();
	}

	private static void SI() {
		System.out.println("enter p,r,t");
		int p = scn.nextInt();
		int r = scn.nextInt();
		int t = scn.nextInt();
		int SI = (p * r * t) / 100;
		System.out.println(SI);

	}

	private static void LOT() {
		System.out.println("enter a,b,c");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println(b);
		} else if (c > a && c > b) {
			System.out.println(c);
		}
	}

	private static void PTN() {
		System.out.println("enter number upto which we want to print");
		int n = scn.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}
	}

	private static void PTNR(int n) {
		if (n < 0) {
			return;
		}
		PTNR(n - 1);
		System.out.println(n);
	}

	private static int STNR(int n) {
		if (n < 0) {
			return 0;
		}
		int sumnm1 = STNR(n - 1); // we have to catch the n-1 value in a
									// variable and then

		int sum = sumnm1 + n; // add n to it

		return sum;
	}

	private static boolean IPR(int n, int div) {

		if (div >= n) {
			return true;
		}

		if ((n % div) == 0) {
			return false;
		}
		boolean res = IPR(n, div + 1);
		return res;
	}

	private static void IPAlgorithm(int n) {

		boolean[] arr = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;

		for (int i = 2; i * i < arr.length; i++) {
			for (int j = i; j * i < arr.length; j++) {
				arr[j * i] = false;
			}
		}
		if (arr[n] == false) {
			System.out.println("not prime");
		} else {
			System.out.println("prime");
		}

	}

	private static void APR(int n, int ng, int div) {

		if (ng > n) {
			return;
		}
		if (div >= ng) {
			System.out.println(++counter + "." + ng);
		}

		if ((ng % div) == 0) {
			APR(n, ng + 1, 2);
		} else {
			APR(n, ng, div + 1);
		}

	}

	private static void APAlgorithm(int n) {
		boolean[] table = new boolean[n + 1];
		Arrays.fill(table, true);
		table[0] = false;
		table[1] = false;
		for (int i = 2; i < table.length; i++) {
			for (int j = i; j * i < table.length; j++) {
				table[j * i] = false;
			}
		}
		for (int i = 0; i < table.length; i++) {
			if (table[i] == true) {
				System.out.println(++counter + "." + i);
			}
		}

	}
	
	private static void IsPrime1(int n) {
		int k = 2;
		while (k <= n - 1) {
			if (n % k == 0) {
				System.out.println("not prime");
				return;

			}
			k++;
		}
		System.out.println("is prime");

	}

	private static void IsPrime2(int n) {
		int k = 2;
		while (k <= n / 2) { // because after half of its value there is no
								// divisor left of that number
			if (n % k == 0) { // for ex- 100 is last fully divided by 100/2 = 50
								// only
				System.out.println("not prime");
				return;
			}
			k++;
		}
		System.out.println("prime");
	}
	
	private static void IsPrime3(int n) {
		int k = 2;
		while (k * k <= n) { // we want to loop the value of k upto sqrt of n
			if (n % k == 0) {
				System.out.println("not prime");
				return;
			}
			k++;
		}
		System.out.println("prime");
	}
}
