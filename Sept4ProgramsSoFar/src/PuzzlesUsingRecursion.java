
public class PuzzlesUsingRecursion {

	public static void main(String[] args) {
		// printSSWAscii("abc", "");
		// printKPC("784", "");
//		pbp(0, 10, "");
//		pbpWith16Opening(0, 10, "");
		
		int[] snl = new int[29];
		snl[3] = 19;
		snl[9] = 24;
		snl[26] = 2;
		snl[20] = 4;
		
		int[] moves = {2, 6, 6, 5, 3, 6, 5, 1, 6, 4, 1, 2, 3}; // last is 4
		pbpWithSnL(0, 28, snl, moves, 0);
	}

	public static void printSS(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printSS(roq, asf); // ch says no
		printSS(roq, asf + ch); // ch says yes
	}

	public static void printSSWAscii(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printSSWAscii(roq, asf); // ch says no
		printSSWAscii(roq, asf + ch); // ch says yes
		printSSWAscii(roq, asf + (int) ch); // ch says yes
	}

	static String[] codes = { ".;", "abc", "de", "fghi", "jkl", "mn", "opq", "rstu", "vw", "xyz" };

	public static void printKPC(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		String options = codes[ch - '0'];
		for (int i = 0; i < options.length(); i++) {
			printKPC(roq, asf + options.charAt(i));
		}
	}

	public static void pbp(int src, int dest, String psf) {
		if (src == dest) {
			System.out.println(psf);
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			int inter = src + dice;
			if (inter <= dest) {
				pbp(inter, dest, psf + dice);
			}
		}
	}

	public static void pbpWith16Opening(int src, int dest, String psf) {
		if(src == dest){
			System.out.println(psf);
			return;
		}
		
		if (src == 0) {
			pbpWith16Opening(1, dest, psf + 1);
			pbpWith16Opening(1, dest, psf + 6);
		} else {
			for (int dice = 1; dice <= 6; dice++) {
				if (src + dice <= dest) {
					pbpWith16Opening(src + dice, dest, psf + dice);
				}
			}
		}

	}

	public static void pbpWithSnL(int src, int dest, 
								  int[] snl,
								  int[] moves, 
								  int midx){
		if(src == dest){
			System.out.println(true);
			return;
		}
		
		if(midx == moves.length){
			System.out.println(false);
			return;
		}
		
		if(src == 0){
			if(moves[midx] == 1 || moves[midx] == 6){
				pbpWithSnL(1, dest, snl, moves, midx + 1);
			} else {
				pbpWithSnL(0, dest, snl, moves, midx + 1);
			}
		} else {
			if(src + moves[midx] > dest){
				pbpWithSnL(src, dest, snl, moves, midx + 1);
			} else {
				int inter = src + moves[midx];
				
				if(snl[inter] == 0){ // no snake or ladder
					pbpWithSnL(inter, dest, snl, moves, midx + 1);
				} else {
					pbpWithSnL(snl[inter], dest, snl, moves, midx + 1);
				}
			}
		}
	}
	

}
