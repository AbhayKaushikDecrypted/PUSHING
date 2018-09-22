import java.util.Scanner;

public class Recursion_3PrintInvertedTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		RT(n,1);
	}

	private static void RT(int n, int c) {
		if (n==0) {
			return;
		}
		if (c <= n) {
			System.out.print("*");
			RT(n,c + 1);
		} else {
			System.out.println();
			RT(n-1,1);
		}
	}

}
