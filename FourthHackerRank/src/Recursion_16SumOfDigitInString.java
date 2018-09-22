import java.util.Scanner;

public class Recursion_16SumOfDigitInString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		int sum1 = STRINGSUM(s, 0);
		System.out.println(sum1);
		scn.close();
	}

	private static int STRINGSUM(String s, int sum) {
		if (s.length() == 0) {
			return sum;
		}
		int num = ((s.charAt(0) - '0'));
		s = s.substring(1);
		return STRINGSUM(s, sum + num);
	}
}
