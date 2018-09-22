import java.util.Scanner;

public class Recursion_4BinomialPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		CIT(n, 0, 0, 1);
		scn.close();
	}

	private static void CIT(int n, int r, int c, int old) {
		if (r == n) {
			return;
		}
		if (c <= r) {
			System.out.print(old);
			int ne = old * (r - c) / (c + 1);
			old = ne;
			CIT(n, r, c + 1, old);

		} else {
			System.out.println();
			CIT(n, r + 1, 0, 1);
		}
	}

}
