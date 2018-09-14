import java.util.Scanner;

public class StrictlyIncrDecr {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] s;
		boolean res = true;
		s = new int[N];
		for (int i = 0; i < N; i++) {
			s[i] = scn.nextInt();
		}
		if (s[1] > s[0]) {
			res = incr(s, res);
		} else {
			res = decr(s, res);
		}
		System.out.println(res);
		scn.close();
	}

	private static boolean incr(int[] x, boolean ren) {
		for (int i = 2; i < x.length; i++) {
			if (x[i] < x[i - 1]) {
				ren = false;
			}
		}
		return ren;
	}

	private static boolean decr(int[] y, boolean ren) {

		for (int i = 2; i < y.length; i++) {
			if (y[i] > y[i - 1]) {
				ren = false;
			}
		}
		return ren;
	}

}
