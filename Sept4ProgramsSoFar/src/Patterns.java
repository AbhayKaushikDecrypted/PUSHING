import java.util.Scanner;

public class Patterns {
	static Scanner scn = new Scanner(System.in);
	static int counter = 0;

	public static void main(String[] args) {
		System.out.println("enter number of rows");
		int r = scn.nextInt();
		// IT(r, 1, 1);
		// INT(r, 1,1);
		// ITFS(r, 1, 1, 0, 1);
		// CIT(r); // do that once again
		// TX(r);
		// SD(r);
		// ND(r); // do that once again
	}

	private static void IT(int r, int pr, int c) {
		if (pr > r) {
			return;
		}
		if (c <= pr) {
			System.out.print("*");
			IT(r, pr, c + 1);
		} else {
			System.out.println();
			IT(r, pr + 1, 1);
		}
	}

	private static void INT(int r, int pr, int c) {

		if (pr > r) {
			return;
		}
		if (c <= pr) {
			System.out.print(++counter + " ");
			INT(r, pr, c + 1);
		} else {
			System.out.println();
			INT(r, pr + 1, 1);
		}

	}

	private static void ITFS(int r, int pr, int c, int a, int b) {
		if (pr > r) {
			return;
		}

		if (c <= pr) {
			System.out.print(a + " ");
			int sum = a + b; // basic algorithm for fibbonacci series
			a = b;
			b = sum;
			ITFS(r, pr, c + 1, a, b);

		} else {
			System.out.println();
			ITFS(r, pr + 1, 1, a, b);
		}

	}

	private static void CIT(int n) {
		int cr = 0;
		while (cr < n) {
			int col = 0;
			int old = 1;
			while (col <= cr) {
				System.out.print(old);
				int New = old * (cr - col) / (col + 1);
				old = New;
				col++;
			}
			System.out.println();
			cr++;
		}
	}

	private static void TX(int r) {
		int pr = 1;
		while (pr <= r) {
			int col = 1;
			while (col <= r) {
				if (col == pr || col + pr == r + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				col++;
			}
			System.out.println();
			pr++;
		}
	}

	private static void SD(int r) {
		int spaces = 2;
		int stars = 1;
		int pr = 1;
		while (pr <= r) {
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= stars; i++) {
				System.out.print("*");
			}
			System.out.println();

			if (pr <= (r / 2)) {
				spaces--;
				stars += 2;
			} else {
				spaces++;
				stars -= 2;
			}

			pr++;
		}
	}

	private static void ND(int r) {
		int spaces = 2;
		int digits = 1;
		int value = 1;
		int pr = 1;
		while (pr <= r) {
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			value = pr <= (r / 2) ? pr : r + 1 - pr;
			for (int i = 1; i <= digits; i++) {
				System.out.print(value);
				value = i <= (digits / 2) ? value + 1 : value - 1;
			}
			if (pr <= (r / 2)) {
				spaces--;
				digits += 2;
			} else {
				spaces++;
				digits -= 2;
			}
			System.out.println();
			pr++;
		}

	}
}
