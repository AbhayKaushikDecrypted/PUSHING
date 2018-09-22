import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_38ASCIISubsequences {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		ArrayList<String> res = new ArrayList<>();
		res = subsequence(s);
		System.out.println(res.size());
		System.out.println(res);
		printss(s, "");
	}

	private static ArrayList<String> subsequence(String s) {
		if (s.length() == 0) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}
		char ch = s.charAt(0);
		String str = s.substring(1);
		ArrayList<String> res1 = subsequence(str);
		ArrayList<String> answer = new ArrayList<>();
		for (String value : res1) {
			answer.add(value);
			answer.add(ch + value);
			answer.add(((int) (ch)) + value);
		}
		return answer;
	}

	private static void printss(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}
		char ch = ques.charAt(0);
		String qsf = ques.substring(1);
		printss(qsf, asf);
		printss(qsf, asf + ch);
		printss(qsf, asf + (int) (ch));
	}

}
