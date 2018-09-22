import java.util.Scanner;

public class Recursion_22MoveCharacters {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char ch = scn.next().charAt(0);
		int n = scn.nextInt();
		s = move(s, "", 0, ch, "");
		System.out.print(s.charAt(n)+" ");
		System.out.print(s);
		scn.close();
	}

	private static String move(String s, String s1, int vindex, char trg, String s2) {
		if (vindex == s.length()) {
			return (s1 + s2);
		}
		char ch = s.charAt(vindex);
		if (ch != trg) {
			s1 = s1 + ch;
		} else {
			s2 = s2 + ch;
		}
		String sb = move(s, s1, vindex + 1, trg, s2);
		return sb;
	}

}
