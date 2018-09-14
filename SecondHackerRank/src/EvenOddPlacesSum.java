import java.util.Scanner;

public class EvenOddPlacesSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		int count = counter(n);
		long rem = 0;
		long odd = 0;
		long even = 0;
		if (n >= 0) {
			for (int i = 1; i <= count; i++) {
				rem = (long) (n % (Math.pow(10, i)));
				n = (long) (n / (Math.pow(10, i)));
				if (i % 2 == 1) {
					odd = odd + rem;
				} else {
					even = even + rem;
				}
			}
			System.out.println(odd + " " + even);
		}
		// else {
		// n = -n;
		// for (int i = 0; i < count; i++) {
		//
		// quo = (int) (n / (Math.pow(10, (count - i - 1))));
		// n = (long) (n % (Math.pow(10, (count - i - 1))));
		// if (i % 2 == 0) {
		// ES = ES + quo;
		// } else {
		// OS = OS + quo;
		// }
		// }
		// }
		// System.out.println(count);
		// System.out.println(OS + " " + ES);
		scn.close();
	}

	private static int counter(long n1) {
		int count = 0;
		while (n1 != 0) {
			n1 = n1 / 10;
			count++;
		}
		return count;
	}
}
