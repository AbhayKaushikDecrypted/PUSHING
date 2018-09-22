import java.util.Scanner;

public class Recursion_31SpecificStringBetweenParanthesis {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		s = parantheses(s, 0, 0, new StringBuilder());
		System.out.println(s);
		scn.close();
	}

	private static String parantheses(String s, int basevindex, int vindex, StringBuilder sb) {
		if (vindex == s.length() - 1) {
			return sb.toString();
		}
		char ch = s.charAt(vindex);
		char chp1 = s.charAt(vindex + 1);
		if (ch == '(' || ch == ')') {
			basevindex = vindex;
		}
		char ch1 = s.charAt(basevindex);
		if (ch1 == '(') {
			sb.append(ch);
		}
		if (ch == ')' && ch1 == ')' && chp1 != ')') {
			sb.append(')');
		}
		parantheses(s, basevindex, vindex + 1, sb);

		return sb.toString();
	}

}
