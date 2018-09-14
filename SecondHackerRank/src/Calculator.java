import java.util.Scanner;

public class Calculator {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		input();
	}

	private static void input() {

		char ch = scn.nextLine().charAt(0);

		if (ch == 'X' || ch == 'x') {
			System.out.println("Invalid Operation.");
		} else {
			calculate(ch);
		}
	}

	private static void calculate(char ch) {

		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int ans = 0;
		if (ch == '+') {
			ans = n1 + n2;
			System.out.println(ans);
			input();
		} else if (ch == '-') {
			ans = n1 - n2;
			System.out.println(ans);
			input();
		} else if (ch == '*') {
			ans = n1 * n2;
			System.out.println(ans);
			input();
		} else if (ch == '/') {
			ans = n1 / n2;
			System.out.println(ans);
			input();
		} else if (ch == '%') {
			ans = n1 % n2;
			System.out.println(ans);
			input();
		}
	}
}
