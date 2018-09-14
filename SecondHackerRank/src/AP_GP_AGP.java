import java.util.Scanner;

public class AP_GP_AGP {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int d = scn.nextInt();
		int r = scn.nextInt();
		int n = scn.nextInt();
		int fap = APnumber(a, n, d);
		int fgp = GPnumber(a, n, r);
		int fagp = (fap * fgp) / a;
		int sap = APsum(a, n, d);
		int sgp = GPsum(a, n, r);
		int sagp = AGPsum(a, n, r, d);
		System.out.println(fap + " " + fgp + " " + fagp + " " + sap + " " + sgp + " " + sagp);
		scn.close();
	}

	private static int APnumber(int a, int n, int d) {
		int Tn = a + ((n - 1) * d);
		return Tn;
	}

	private static int GPnumber(int a, int n, int r) {
		int Tn = (int) (a * Math.pow(r, n - 1));
		return Tn;
	}

	private static int APsum(int a, int n, int d) {
		int Sn = ((n) * (a + APnumber(a, n, d))) / 2;
		return Sn;
	}

	private static int GPsum(int a, int n, int r) {
		int Sn = 0;
		if (r == 1) {
			Sn = a * n;
		} else {
			Sn = (((GPnumber(a, n, r)) * r) - a) / (r - 1);
		}
		return Sn;
	}

	private static int AGPsum(int a, int n, int r, int d) {
		int Sn = 0;
		if (r == 1) {
			Sn = APsum(a, n, d);
		} else {
			Sn = (int) ((a / (1 - r)) + ((d * r) * (1 - Math.pow(r, n - 1)) / (Math.pow(1 - r, 2))
					- (((APnumber(a, n, d)) * Math.pow(r, n)) / (1 - r))));
		}
		return Sn;
	}

}
