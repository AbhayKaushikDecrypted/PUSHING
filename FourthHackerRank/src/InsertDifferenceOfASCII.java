import java.util.Scanner;

public class InsertDifferenceOfASCII {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		String s2 = "";
		for (int i = 0; i < s.length() - 1; i++) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(i + 1);
			s2 = s2 + ch1;
			s2 = s2 + (int) (ch2 - ch1);
		}
		s2 = s2+(s.charAt(s.length()-1));
		System.out.println(s2);
		scn.close();
	}
}
