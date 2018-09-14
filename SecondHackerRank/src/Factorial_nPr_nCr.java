import java.util.Scanner;

public class Factorial_nPr_nCr {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		int factn = factorial(n);
		int factr = factorial(r);
		int factnr = factorial(n - r);
		System.out.println(factn);
		System.out.println(factn / factnr);
		System.out.println(factn / (factr * factnr));
		scn.close();
	}

	private static int factorial(int x) {
		int factor = 1;
		for (int i = x; i >= 1; i--) {
			factor = factor * i;
		}
		return factor;
	}

}
