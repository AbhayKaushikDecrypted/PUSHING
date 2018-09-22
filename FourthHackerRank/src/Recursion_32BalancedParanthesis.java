import java.util.Scanner;

public class Recursion_32BalancedParanthesis {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		boolean res;
		res = balanced(s, 0, new StringBuilder());
		System.out.println(res);
		scn.close();
	}

	private static boolean balanced(String s, int vindex, StringBuilder sb) {
		if (vindex == s.length()) {
			return true;
		}
		char ch = s.charAt(vindex);
		if (ch == '[' || ch == '{' || ch == '(') {
			sb.append(ch);
		} else if (ch == ')') {
			if (sb.length() == 0) {
				return false;
			}
			sb.deleteCharAt(sb.length() - 1);
		} else if (ch == '}') {
			if (sb.length() == 0) {
				return false;
			}
			sb.deleteCharAt(sb.length() - 1);
		} else if (ch == ']') {
			if (sb.length() == 0) {
				return false;
			}
			sb.deleteCharAt(sb.length() - 1);
		}
		return balanced(s, vindex + 1, sb);
	}

}
