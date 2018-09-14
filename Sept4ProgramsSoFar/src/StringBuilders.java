
public class StringBuilders {

	public static void main(String[] args) {
		// TOGGLECASES("aBasdAXDEas");
		// INCREODDDECREEVEN("bcdef");
		// INSERTDIFFASCII("bcdf");
//		COMPRESSION1("aaabbbcbsssdeeerggghhh");
//		System.out.println();
//		COMPRESSION2("aaabbbcbsssdeeerggghhh");

	}

	private static void TOGGLECASES(String s) {
		StringBuilder sb = new StringBuilder(s); // converted to string builder
													// as strings are
													// immutable (unchangable)

		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - ('z' - 'Z'));
			} else {
				ch = (char) (ch + ('z' - 'Z'));
			}
			sb.setCharAt(i, ch);
		}

		sb.toString();
		System.out.println(sb);

	}

	private static void INCREODDDECREEVEN(String s) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (i % 2 == 0) {
				ch = (char) (ch - 1);
			} else {
				ch = (char) (ch + 1);
			}
			sb.setCharAt(i, ch);
		}
		sb.toString();
		System.out.println(sb);
	}

	private static void INSERTDIFFASCII(String s) {
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < sb.length() - 1; i++) {
			char chi = sb.charAt(i);
			char chip1 = sb.charAt(i + 1);
			sb1.append(chi);
			sb1.append(chip1 - chi);
		}
		sb1.append(s.charAt(s.length() - 1));
		sb1.toString();
		System.out.println(sb1);
	}

	private static void COMPRESSION1(String s) {
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < sb.length() - 1; i++) {
			char chi = sb.charAt(i);
			char chip1 = sb.charAt(i + 1);
			if (chi != chip1) {
				sb1.append(chi);
			}
		}
		sb1.append(s.charAt(s.length() - 1));
		sb1.toString();
		System.out.println(sb1);
	}

	private static void COMPRESSION2(String s) {
		int counter = 1;
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < sb.length() - 1; i++) {
			char chi = sb.charAt(i);
			char chip1 = sb.charAt(i + 1);
			if (chi == chip1) {
				counter++;
			} else {
				sb1.append(chi);
				if (counter > 1) {
					sb1.append(counter);
				}
				counter = 1;
			}
		}
		sb1.append(s.charAt(s.length() - 1));
		if (counter > 1) {
			sb1.append(counter);
		}
		sb1.toString();
		System.out.println(sb1);
	}
}
