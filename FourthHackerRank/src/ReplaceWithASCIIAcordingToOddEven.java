import java.util.Scanner;

public class ReplaceWithASCIIAcordingToOddEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (i % 2 != 0) {
				ch = (char) (ch - 1);
			} else {
				ch = (char) (ch + 1);
			}
			s2 = s2 + ch;
		}
		System.out.println(s2);
		scn.close();
	}
}
