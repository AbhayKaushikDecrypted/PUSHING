import java.util.Scanner;

public class String_9RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			char chp1 = s.charAt(i + 1);
			if (ch != chp1) {
				System.out.print(ch);
			}
		}
		System.out.println(s.charAt(s.length() - 1));
		scn.close();
	}
}
