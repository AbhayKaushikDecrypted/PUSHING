import java.util.Scanner;

public class Recursion_23CountOrRemoveHi {
	static int counter = 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int n = scn.nextInt();
		hicounter(s, 0);
		System.out.println(counter);
		StringBuilder sb = new StringBuilder(s);
		s = removehi(sb, 0);
		System.out.println(s.charAt(n));
		System.out.println(s);
		scn.close();
	}

	private static String removehi(StringBuilder sb, int vindex) {
		if (vindex == sb.length() - 1) {
			return sb.toString();
		}
		char ch = sb.charAt(vindex);
		char chp1 = sb.charAt(vindex + 1);
		if (ch == 'h' && chp1 == 'i') {
			sb.delete(vindex, vindex + 2);
			removehi(sb, 0);
		} else {
			removehi(sb, vindex + 1);
		}
		return sb.toString();

	}

	private static void hicounter(String s, int vindex) {
		if (vindex == s.length() - 1) {
			return;
		}
		char ch = s.charAt(vindex);
		char chp1 = s.charAt(vindex + 1);
		if (ch == 'h' && chp1 == 'i') {
			counter++;
		}
		hicounter(s, vindex + 1);
	}

}
