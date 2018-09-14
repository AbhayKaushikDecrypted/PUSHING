import java.util.Arrays;
import java.util.Iterator;

public class client {
	static int count = 0;

	public static void main(String[] args) {
		// getpolynomials(2, 3);
		// int[] findex = new int[26];
		// char ch = HFC("abbbccaacddaacd", findex);
		// System.out.println(ch);
		// int[] arr = { 5, 2, 0, 0, 9, 0, 8, 0, 0, 0, 7 };
		// anoymoussort(arr);
		// int[] cx = { 15, 8, 15, 3, 8, 7 };
		// find2(cx);
		soe(100); // most efficient method for calculating square root sieve of
					// eratosthenes
	}

	private static char HFC(String x, int[] findex) {

		for (int i = 0; i < x.length(); i++) {

			char ch = x.charAt(i);
			findex[ch - 'a']++;

		}
		int maxfi = 0;
		for (int i = 0; i < findex.length; i++) {
			if (findex[i] > findex[maxfi]) {
				maxfi = i;
			}
		}
		return (char) (maxfi + 'a');
	}

	private static void getpolynomials(int x, int n) {

		int sum = 0;
		int prod = x;

		for (int co = n; co >= 1; co--) {

			sum = sum + co * prod;
			prod = prod * x;
		}
		System.out.println(sum);
	}

	private static void anoymoussort(int[] arr1) {
		int d = 0;
		int z = 0;

		while (z <= arr1.length - 1) {
			if (arr1[z] == 0) {
				z++;
			} else {
				swap(arr1, d, z);
				z++;
				d++;
			}
		}
		display(arr1);
	}

	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void find(int[] cx) {
		int unique = 0;
		for (int val : cx) {
			unique ^= val;
		}
		System.out.println(unique);

	}

	private static void find2(int[] cx) {

		int xXORy = 0;
		for (int val : cx) {
			xXORy ^= val;
		}
		int rmsb = (xXORy) & (-xXORy);
		int x = xXORy;
		int y = xXORy;

		for (int val : cx) {
			if ((val & rmsb) == 0) { // those no. which have this bit off
				y ^= val;
			} else {
				x ^= val;
			}
		}
		System.out.println(x + " " + y);

	}

	private static void soe(int n) {
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		for (int i = 2; i * i < primes.length; i++) {
			for (int j = i; j * i < primes.length; j++) {
				primes[j * i] = false;
			}
		}
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] == true) {
				System.out.println(i);
			}
		}

	}
}
