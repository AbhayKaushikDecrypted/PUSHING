import java.util.Scanner;

public class String_7Permutation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		permutations(s, "");
		scn.close();
	}

	private static void permutations(String s, String asf) {
		if (s.length() == 0) {
			System.out.println(asf);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String qlsf = s.substring(0, i);
			String qrsf = s.substring(i + 1, s.length());
			permutations(qlsf + qrsf, asf + ch);
		}
	}
}