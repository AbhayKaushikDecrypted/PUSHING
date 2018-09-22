import java.util.Scanner;

public class Recursion_17NumberToString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		double res =(int) strtoint(s, 0);
		System.out.println(res);
		int div = scn.nextInt();
		double ans = (int)(res / div);
		System.out.println(ans);
		scn.close();
	}

	private static double strtoint(String s, double sum) {
		if (s.length() == 0) {
			return sum;
		}
		int num = ((s.charAt(0) - '0'));
		s = s.substring(1);
		sum = (sum + (num * Math.pow(10, s.length())));
		return strtoint(s, sum);
	}

}
