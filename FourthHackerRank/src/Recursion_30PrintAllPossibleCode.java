import java.util.Scanner;

public class Recursion_30PrintAllPossibleCode {
	static String str = "0abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		s = codes(s, 0,1, "");
		System.out.println(s);
	}

	private static String codes(String s, int vindex,int pair, String asf) {
		if (vindex == s.length()) {
			return asf;
		}
		String ch = s.substring(vindex,vindex+pair);
		int n = (ch - '0');
		asf = codes(s, vindex + 1, asf + str.charAt(n));
		return asf;
	}

}
