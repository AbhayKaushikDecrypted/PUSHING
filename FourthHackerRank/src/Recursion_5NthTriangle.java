import java.util.Scanner;

public class Recursion_5NthTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		System.out.println(SUM(n));
		scn.close();
	}

	private static int SUM(int n) {
		if (n == 0) {
			return 0;
		}

		int sumnm1 = SUM(n - 1);
		int sumn = sumnm1 + n;
		return sumn;
	}

}
