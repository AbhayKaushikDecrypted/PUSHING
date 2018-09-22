import java.util.Scanner;

public class Recursion_18StringOneTwoAreReverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		reverse(s1, s2, 0);
		scn.close();
	}

	private static void reverse(String s1, String s2, int vindex) {
		if (vindex == s1.length()) {
			System.out.println(true);
			return;
		}
		char ch1 = s1.charAt(vindex);
		char ch2 = s2.charAt(s2.length() - 1 - vindex);
		if (ch1 != ch2) {
			System.out.println(false);
			return;
		} else {
			reverse(s1, s2, vindex + 1);
		}
	}

}
