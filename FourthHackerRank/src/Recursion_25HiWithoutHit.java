import java.util.Scanner;

public class Recursion_25HiWithoutHit {
	static int counter = 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
//		int n = scn.nextInt();
		hicounter(s, 0);
		System.out.println(counter);
	}

	private static void hicounter(String s, int vindex) {
		if (vindex == s.length() - 2) {
			return;
		}
		char ch = s.charAt(vindex);
		char chp1 = s.charAt(vindex + 1);
		char chp2 = s.charAt(vindex + 2);
		if (ch == 'h' && chp1 == 'i' && chp2 != 't') {
			counter++;
		}
		hicounter(s, vindex + 1);
	}
}
