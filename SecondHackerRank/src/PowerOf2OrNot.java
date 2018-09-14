import java.util.Scanner;

public class PowerOf2OrNot {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean res = true;
		int rem = 0;
		while (n != 2) {
			rem = n % 2;
			n = n / 2;
			if (rem != 0) {
				res = false;
				break;
			}
		}
		System.out.println(res);
		scn.close();
	}

}
