import java.util.ArrayList;

public class printeqisets {

	public static void main(String[] args) {
		// int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		// eqisets(arr, 0, new ArrayList<Integer>(), 0, new
		// ArrayList<Integer>(), 0);
		// System.out.println();
		// eqiset1(arr, 0, new ArrayList<Integer>(), 0, 50);
		// printpermutations("abc", "");
		// printpermutationsB(new StringBuilder("abc"), new StringBuilder());
		// System.out.println();
		// printquespermu("abc", "");
		// printquesB(new StringBuilder("abc"), new StringBuilder());
		// printrepeatpermu("abab", "");
		// System.out.println();
		printrepeatpermu2("abab", "");

	}

	private static void eqisets(int[] arr, int vidx, ArrayList<Integer> set1, int sumset1, ArrayList<Integer> set2,
			int sumset2) {
		if (vidx == arr.length) {
			if (sumset1 == sumset2) {
				System.out.println(set1 + " & " + set2);
			}
			return;
		}
		set1.add(arr[vidx]);
		eqisets(arr, vidx + 1, set1, sumset1 + arr[vidx], set2, sumset2);
		set1.remove(set1.size() - 1);

		set2.add(arr[vidx]);
		eqisets(arr, vidx + 1, set1, sumset1, set2, sumset2 + arr[vidx]);
		set2.remove(set2.size() - 1);
	}

	private static void eqiset1(int[] arr, int vidx, ArrayList<Integer> set1, int sumset1, int trg) {
		if (vidx == arr.length) {
			if (sumset1 == trg) {
				System.out.println(set1);
			}
			return;
		}

		// when not added in subset
		eqiset1(arr, vidx + 1, set1, sumset1, trg);

		// when added in array list
		set1.add(arr[vidx]);
		eqiset1(arr, vidx + 1, set1, sumset1 + arr[vidx], trg);
		set1.remove(set1.size() - 1);

	}

	private static void printpermutations(String s, String asf) {
		if (s.length() == 0) {
			System.out.println(asf);
			return;
		}

		char ch = s.charAt(0);
		String qsf = s.substring(1);

		for (int i = 0; i <= asf.length(); i++) {
			String A1 = asf.substring(0, i);
			String A2 = asf.substring(i);
			printpermutations(qsf, A1 + ch + A2);
		}
	}

	private static void printpermutationsB(StringBuilder s, StringBuilder asf) {
		if (s.length() == 0) {
			System.out.println(asf);
			return;
		}

		char ch = s.charAt(0);
		s.deleteCharAt(0);

		for (int i = 0; i <= asf.length(); i++) {

			asf.insert(i, ch);
			printpermutationsB(s, asf);
			asf.deleteCharAt(i);
		}
		s.insert(0, ch);
	}

	private static void printquespermu(String s, String asf) {
		if (s.length() == 0) {
			System.out.println(asf);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String qsfl = s.substring(0, i);
			String qsfr = s.substring(i + 1);
			printquespermu(qsfl + qsfr, asf + ch);
		}
	}

	private static void printquesB(StringBuilder s, StringBuilder asf) {
		if (s.length() == 0) {
			System.out.println(asf);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			s.deleteCharAt(i);
			asf.append(ch);
			printquesB(s, asf);
			asf.deleteCharAt(asf.length() - 1);
			s.insert(i, ch);
		}

	}

	private static void printrepeatpermu(String s, String asf) {
		if (s.length() == 0) {
			System.out.println(asf);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (wrongch(s, i, ch) == true) {
				continue;
			}
			String qsfl = s.substring(0, i);
			String qsfr = s.substring(i + 1);
			printrepeatpermu(qsfl + qsfr, asf + ch);
		}
	}

	private static boolean wrongch(String s, int j, char ch) {

		for (int i = 0; i < j; i++) {
			if (s.charAt(i) == ch) {
				return true;
			}
		}
		return false;
	}

	private static void printrepeatpermu2(String s, String asf) {
		if (s.length() == 0) {
			System.out.println(asf);
			return;
		}
		boolean[] alpha = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (alpha[ch - 'a'] == false) {
				alpha[ch - 'a'] = true;
				String qsfl = s.substring(0, i);
				String qsfr = s.substring(i + 1);
				printrepeatpermu2(qsfl + qsfr, asf + ch);
			}

		}
	}

}
