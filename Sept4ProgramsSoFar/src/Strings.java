
public class Strings {

	public static void main(String[] args) {
		// SEPRATE("abc");
		// SUBSTRING("abc");
		// boolean res = ISPALINDROME("abba");
		// System.out.println(res);
		// ALLSUBSTRINGCHECKER("ccabbbbacc");
		SUBSEQUENCE("abc");
	}

	private static void SEPRATE(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	private static void SUBSTRING(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				System.out.println(s.substring(i, j + 1));
			}
		}
	}

	private static boolean ISPALINDROME(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static void ALLSUBSTRINGCHECKER(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				boolean res = ISPALINDROME(s.substring(i, j + 1));
				if (res == true) {
					System.out.println(s.substring(i, j + 1));
				}
			}
		}
	}

	private static void SUBSEQUENCE(String s) {
		int mask = 1;
		for (int i = 0; i < Math.pow(2, s.length()); i++) {
			for (int j = s.length() - 1; j >= 0; j--) {
				mask = 1 << j;
				if ((i & mask) == mask) {
					System.out.print(s.charAt(s.length() - 1 - j));
				}
			}
			System.out.println();
		}
	}

	
}
