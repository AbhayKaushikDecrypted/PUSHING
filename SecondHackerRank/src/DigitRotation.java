import java.util.Scanner;

public class DigitRotation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long r = scn.nextLong();
		long n = scn.nextLong();
		int count = counter(n);
		System.out.println(count);
		rotator(n, r);
		scn.close();
	}

	private static int counter(long n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	private static void rotator(long n, long r) {
		int digit = counter(n);
		long rem;
		long x;
		if (r >= 0) {
			for (long i = 1; i <= r; i++) {
				x = (long) (n / (Math.pow(10, (digit - 1))));
				rem = (long) (n % (Math.pow(10, (digit - 1))));
				n = (rem * 10) + x;
			}
			System.out.println(n);
		} else {
			r = -r;
			for (long i = 1; i <= r; i++) {
				x = (long) (n / 10);
				rem = (long) (n % 10);
				n = (long) (rem * Math.pow(10, (digit - 1)) + x);
			}
			System.out.println(n);
		}
	}
}
