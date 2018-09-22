import java.util.Scanner;

public class String_6Subsequences {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		int count = s.length();
		int mask = 1;
		for (int i = 0; i < (int) (Math.pow(2, count)); i++) {
			for (int j = s.length() - 1; j >= 0; j--) {
				mask = 1 << j;
				if ((i & mask) == mask) {
					char ch = s.charAt(s.length()-1-j);
					System.out.print(ch);
				}
			}
			System.out.println();
		}
		scn.close();
	}

}
