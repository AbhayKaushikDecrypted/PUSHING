import java.util.Scanner;

public class Recursion_19PalindromeOfString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		s = alllower(s);
		palindrome(s,0);
		scn.close();
	}

	private static void palindrome(String s, int vindex) {
		if (vindex >= s.length() / 2) {
			System.out.println(true);
			return;
		}
		char ch = s.charAt(vindex);
		char chp1 = s.charAt(s.length() - 1 - vindex);
		if (ch != chp1) {
			System.out.println(false);
		} else {
			palindrome(s, vindex + 1);
		}
	}

	private static String alllower(String s) {
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + ('z' - 'Z'));
			}
			s2 = s2 + ch;

		}
		return s2;
	}

}
