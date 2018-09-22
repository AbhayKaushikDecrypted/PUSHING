import java.util.Scanner;

public class Recursion_2PrintTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		IT(n, 1, 1);
		scn.close();
	}

	private static void IT(int n, int i, int j) {
		if (i > n) {
			return;
		}
		if (j <= i) {
			System.out.print("*");
			IT(n, i, j + 1);

		} else {
			System.out.println();
			IT(n, i + 1, 1);
		}
	}

}
