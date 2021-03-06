import java.util.Scanner;

public class Recursion_21RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int n = scn.nextInt();
		char ch = s.charAt(s.length() - 1);
		s = duplicates(s, new StringBuilder(), 0);
		s = s + ch;
		System.out.println(s.charAt(n));
		System.out.println(s);
		scn.close();
	}

	private static String duplicates(String s, StringBuilder sb, int vindex) {
		if (vindex == s.length() - 1) {
			return sb.toString();
		}
		char ch = s.charAt(vindex);
		char chp1 = s.charAt(vindex + 1);
		if (ch == chp1) {
			duplicates(s, sb, vindex + 1);
		} else {
			sb.append(ch);
			duplicates(s, sb, vindex + 1);
		}

		return sb.toString();
	}

}
