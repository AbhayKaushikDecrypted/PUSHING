import java.util.Scanner;

public class ExceptClassOnes {
	static Scanner scn = new Scanner(System.in);
	static int counter = 0;

	public static void main(String[] args) {
		System.out.println("enter number");
		int n = scn.nextInt();
		HD(n);
		System.out.println();
		HollowHalfNoDiamond(n);
		System.out.println();
		NthFib(n);
		System.out.println();
		ND(n);
		System.out.println();
		NT(n);

	}

	private static void HD(int n) {
		int row = 1;
		int lstars = (n / 2) + 1;
		int rstars = (n / 2) + 1;
		int spaces = 1;
		while (row <= n) {
			for (int i = 1; i <= lstars; i++) {
				System.out.print("*");
			}
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= rstars; i++) {
				System.out.print("*");
			}
			if (row <= n / 2) {
				lstars--;
				rstars--;
				spaces += 2;
			} else {
				lstars++;
				rstars++;
				spaces -= 2;
			}
			System.out.println();
			row++;
		}
	}

	private static void HollowHalfNoDiamond(int n) {
		int lval = 1;
		int spaces = (n * 2) - 3;

		int row = 1;
		while (row <= n) {
			lval = row < n ? row : row - 1;
			for (int i = 1; i <= lval; i++) {
				System.out.print(i + "\t");
			}

			for (int i = 1; i <= spaces; i++) {
				System.out.print(" " + "\t");
			}

			for (int i = row; 1 <= i; i--) {
				System.out.print(i + "\t");
			}
			spaces -= 2;

			System.out.println();
			row++;
		}
	}

	private static void NthFib(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;
		int count = 1;
		while (count <= n) {
			sum = a + b;
			a = b;
			b = sum;
			count++;
		}
		System.out.println(a);
	}

	private static void ND(int n) {
		int val = 1;
		int spaces = n - 1;
		int values = 1;
		int row = 1;
		while (row <= n) {
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			val = row <= n / 2 ? row : n + 1 - row;
			for (int i = 1; i <= values; i++) {
				System.out.print(val);
				System.out.print(" ");
				val = i <= values / 2 ? val + 1 : val - 1;
			}
			if (row <= n / 2) {
				spaces -= 2;
				values += 2;
			} else {
				spaces += 2;
				values -= 2;
			}
			System.out.println();
			row++;
		}
	}

	private static void NT(int n) {
		int row = 1;
		int val = 1;
		int spaces = (n * 2) - 2;
		int values = 1;

		while (row <= n) {
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			int col = 1;
			val = row;
			while (col <= values) {
				System.out.print(val);
				System.out.print(" ");
				val = col <= values / 2 ? val + 1 : val - 1;
				col++;
			}
			spaces -= 2;
			values += 2;
			System.out.println();
			row++;
		}
	}

}
