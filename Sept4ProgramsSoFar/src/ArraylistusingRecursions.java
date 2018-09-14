import java.util.ArrayList;

public class ArraylistusingRecursions {

	public static void main(String[] args) {
		// ArrayList<Integer> list = new ArrayList<>();
		// list.add(10);
		// list.add(20);
		// list.add(30);
		// System.out.println(list.get(2));
		// list.set(1, 200);
		// list.remove(1);
		// list.add(1, 500);
		// System.out.println(list);
		// System.out.println(list.size());
		// for(int val: list){
		// System.out.println(val);
		// }

		// System.out.println(getSSAscii("ab"));
//		System.out.println(getKPC("784"));
		System.out.println(getBPProactive(0, 10));
	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recResult = getSS(ros);
		ArrayList<String> myResult = new ArrayList<>();

		for (String val : recResult) {
			myResult.add(val);
			myResult.add(ch + val);
		}

		return myResult;
	}

	public static ArrayList<String> getSSAscii(String str) {
		if (str.length() == 0) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recResult = getSSAscii(ros);
		ArrayList<String> myResult = new ArrayList<>();

		for (String val : recResult) {
			myResult.add(val);
			myResult.add(ch + val);
			myResult.add((int) ch + val);
		}

		return myResult;
	}

	static String[] codes = { ".;", "abc", "de", "fghi", "jkl", "mn", "opq", "rstu", "vw", "xyz" };

	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recResult = getKPC(ros);
		ArrayList<String> myResult = new ArrayList<>();

		for (String val : recResult) {
			String code = codes[ch - '0'];
			for (int i = 0; i < code.length(); i++) {
				char chcode = code.charAt(i);
				myResult.add(chcode + val);
			}
		}

		return myResult;
	}

	public static ArrayList<String> getBPReactive(int src, int dest) {
		if (src == dest) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}

		if (src > dest) {
			ArrayList<String> bresult = new ArrayList<>();
			return bresult;
		}

		ArrayList<String> myResult = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			int inter = src + dice;
			ArrayList<String> itod = getBPReactive(inter, dest);

			for (String pitod : itod) {
				myResult.add(dice + pitod);
			}
		}

		return myResult;
	}

	public static ArrayList<String> getBPProactive(int src, int dest) {
		if (src == dest) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}

		ArrayList<String> myResult = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			int inter = src + dice;
			if (inter <= dest) {
				ArrayList<String> itod = getBPProactive(inter, dest);

				for (String pitod : itod) {
					myResult.add(dice + pitod);
				}
			}
		}

		return myResult;
	}


}
