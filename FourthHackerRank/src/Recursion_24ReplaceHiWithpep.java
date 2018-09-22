import java.util.Scanner;

public class Recursion_24ReplaceHiWithpep {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		StringBuilder sb = new StringBuilder(s);
		char ch = sb.charAt(0);
		s = removehi(sb, 1, ch, new StringBuilder());
		System.out.println(s);
		scn.close();
	}

	private static String removehi(StringBuilder sb, int vindex, char ch, StringBuilder sb1) {
		if (vindex == sb.length() - 1) {
			return sb1.toString();
		}
		char chp1 = sb.charAt(vindex);
		if (ch == 'h') {
			if (chp1 == 'i') {
				sb.delete(vindex, vindex + 2);
				sb1.append("p");
				sb1.append("e");
				sb1.append("p");
				removehi(sb, 1,sb.charAt(0), sb1);
			}
		}
		else {
			sb1.append(ch);
			sb1.append(chp1);
			removehi(sb, vindex + 2, chp1, sb1);
		}

		return sb1.toString();

	}

}
