import java.util.Scanner;

public class AnyIncrDecrorIncrDecrorDecrIncr {

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
			boolean res1 = incr(s, res);
			boolean res2 = incrdecr(s, res);
			res = res1 | res2;
		} else {
			boolean res3 = decr(s, res);
			boolean res4 = decrincr(s, res);
			res = res3 | res4;
		}
		System.out.println(res);
		scn.close();
	}

	private static boolean incr(int[] x, boolean ren) {
		int ending = 0;
		for (int i = 2; i < x.length; i++) {
			if (x[i] < x[i - 1]) {
				ren = false;
			}
		}
		return ren;
	}

	private static boolean incrdecr(int[] x, boolean ren) {
		int ending = 0;
		for (int i = 2; i < x.length; i++) {
			if (x[i] < x[i - 1]) {
				ending = i;
				break;
			}
		}
		if (ending == (x.length - 1)) {
			ren = false;
		} else {
			for (int j = (x.length - 1); j > ending; j--) {
				if (x[j] > x[j - 1]) {
					ren = false;
					break;
				}
			}
		}
		return ren;
	}

	private static boolean decr(int[] y, boolean ren) {
		int ending = 0;
		for (int i = 2; i < y.length; i++) {
			if (y[i] > y[i - 1]) {
				ren = false;
			}
		}
		return ren;
	}

	private static boolean decrincr(int[] y, boolean ren) {
		int ending = 0;
		for (int i = 2; i < y.length; i++) {
			if (y[i] > y[i - 1]) {
				ending = i;
				break;
			}
		}
		if (ending == (y.length - 1)) {
			ren = false;
		} else {
			for (int j = (y.length - 1); j > ending; j--) {
				if (y[j] < y[j - 1]) {
					ren = false;
					break;
				}
			}
		}
		return ren;
	}

}
