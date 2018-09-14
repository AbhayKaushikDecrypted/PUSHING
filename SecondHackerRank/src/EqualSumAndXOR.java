import java.util.Scanner;

public class EqualSumAndXOR {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int p = 0;
		for (int i = 0; i <= n; i++) {
			if (n + i == (n ^ i)) {
				p++;
			}
		}
		System.out.println(p);
		scn.close();
	}

}
