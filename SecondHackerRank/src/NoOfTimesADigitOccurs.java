import java.util.Scanner;

public class NoOfTimesADigitOccurs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		byte d = scn.nextByte();
		int count = counter(n, d);
		System.out.println(count);
		scn.close();
	}

	private static int counter(long n1, int d) {
		int count = 0;
		long q;
		while (n1 != 0) {
			q = n1 % 10;
			n1 = n1 / 10;
			if (q == d) {
				count++;
			}
		}
		return count;
	}

}
