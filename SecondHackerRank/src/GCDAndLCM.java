import java.util.Scanner;

public class GCDAndLCM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int y = gcd(n1, n2);
		int lcm = 0;
		lcm = (n1 * n2) / y; // as n1*n2 = hcf (or gcd)*lcm
		System.out.println(y + " " + lcm);
		scn.close();
	}

	private static int gcd(int a, int b) {
		int rem = b % a;
		while (rem != 0) {
			b = a;
			a = rem;
			rem = b % a;
		}
		return a;
	}
}
