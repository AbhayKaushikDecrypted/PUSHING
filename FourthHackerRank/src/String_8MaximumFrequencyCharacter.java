import java.util.Scanner;

public class String_8MaximumFrequencyCharacter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		int[] res = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			res[ch - 'a']++;
		}
		int max = 0;
		int maxindex = 0;
		for (int i = 0; i < res.length; i++) {
			if (res[i] > max) {
				max = res[i];
				maxindex = i;
			}
		}
		char ch = (char) (maxindex + 'a');
		System.out.println(ch);
		scn.close();
	}
}
