import java.util.Scanner;

public class Recursion_1OddAndEvenNumberPrinting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		PRINT(n);
		scn.close();
	}

	private static void PRINT(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);
		}
		PRINT(n - 1);

		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

}
