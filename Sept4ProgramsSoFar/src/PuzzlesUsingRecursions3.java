
public class PuzzlesUsingRecursions3 {

	public static void main(String[] args) {
//		boolean[][] chess = new boolean[4][4];
//		long start = 0;
//		long end = 0;
		
//		start = System.currentTimeMillis();
//		printNQueensProactive(chess, 1, 0, "");
//		printNQueensSS(chess, 1, 1, "");
//		end = System.currentTimeMillis();
//		System.out.println(end - start);
				
//		printNQueensProactive(chess, 1, 0, "");
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		printEquiSets(arr, 0, "", 0, "", 0);
	}

	static int counter = 0;

	public static void printNQueens(boolean[][] chess, int qno, int pqb, String asf) {
		if (qno > chess.length) {
			if (isTheBoardSafe(chess) == true) {
				System.out.println(++counter + ". " + asf);
			}
			return;
		}

		for (int b = pqb + 1; b <= chess.length * chess.length; b++) {
			int rno = (b - 1) / chess.length;
			int cno = (b - 1) % chess.length;

			if (chess[rno][cno] == false) {
				chess[rno][cno] = true;
				printNQueens(chess, qno + 1, b, asf + rno + cno + " ");
				chess[rno][cno] = false;
			}
		}
	}

	public static void printNQueensProactive(boolean[][] chess, int qno, int pqb, String asf) {
		if (qno > chess.length) {
			System.out.println(++counter + ". " + asf);
			return;
		}

		for (int b = pqb + 1; b <= chess.length * chess.length; b++) {
			int rno = (b - 1) / chess.length;
			int cno = (b - 1) % chess.length;

			if (chess[rno][cno] == false) {
				if (isTheQueenSafe(chess, rno, cno) == true) {
					chess[rno][cno] = true;
					printNQueensProactive(chess, qno + 1, b, asf + rno + cno + " ");
					chess[rno][cno] = false;
				}
			}
		}
	}

	private static boolean isTheBoardSafe(boolean[][] chess) {
		for (int row = 0; row < chess.length; row++) {
			for (int col = 0; col < chess.length; col++) {
				if (chess[row][col] == true && isTheQueenSafe(chess, row, col) == false) {
					return false;
				}
			}
		}

		return true;
	}

	private static boolean isTheQueenSafe(boolean[][] chess, int row, int col) {
		int[][] dirs = { { -1, 0 }, // north
				{ -1, +1 }, // ne
				{ 0, +1 }, // e
				{ +1, +1 }, // se
				{ +1, 0 }, // s
				{ +1, -1 }, // sw
				{ 0, -1 }, // w
				{ -1, -1 } // nw
		};

		for (int rad = 1; rad < chess.length; rad++) {
			for (int j = 0; j < dirs.length; j++) {
				int re = row + rad * dirs[j][0];
				int ce = col + rad * dirs[j][1];

				if (re >= 0 && re < chess.length && ce >= 0 && ce < chess.length) {
					if (chess[re][ce] == true) {
						return false;
					}
				}
			}
		}

		return true;
	}

	public static void printNKnights(boolean[][] chess, int qno, int pqb, String asf) {
		if (qno > chess.length) {
			if (isTheBoardSafeForKnights(chess) == true) {
				System.out.println(++counter + ". " + asf);
			}
			return;
		}

		for (int b = pqb + 1; b <= chess.length * chess.length; b++) {
			int rno = (b - 1) / chess.length;
			int cno = (b - 1) % chess.length;

			if (chess[rno][cno] == false) {
				chess[rno][cno] = true;
				printNKnights(chess, qno + 1, b, asf + rno + cno + " ");
				chess[rno][cno] = false;
			}
		}
	}

	private static boolean isTheBoardSafeForKnights(boolean[][] chess) {
		for (int row = 0; row < chess.length; row++) {
			for (int col = 0; col < chess.length; col++) {
				if (chess[row][col] == true && isTheKnightSafe(chess, row, col) == false) {
					return false;
				}
			}
		}

		return true;
	}

	private static boolean isTheKnightSafe(boolean[][] chess, int row, int col) {
		int[][] dirs = { { -2, -1 }, // north
				{ -2, +1 }, // ne
				{ -1, -2 }, // e
				{ -1, +2 }, // se
				{ +1, -2 }, // s
				{ +1, +2 }, // sw
				{ +2, -1 }, // w
				{ +2, +1 } // nw
		};

		for (int j = 0; j < dirs.length; j++) {
			int re = row + dirs[j][0];
			int ce = col + dirs[j][1];

			if (re >= 0 && re < chess.length && ce >= 0 && ce < chess.length) {
				if (chess[re][ce] == true) {
					return false;
				}
			}
		}

		return true;
	}

	// printnqueens -> use box choices for combinations and proactive
	private static void printNQueensSS(boolean[][] chess, int qno, int bno, String asf){
		if(qno > chess.length){
			System.out.println(++counter + ". " + asf);
			return;
		}
		
		if(bno > chess.length * chess.length){
			return;
		}
		
		// box said no to queen
		printNQueensSS(chess, qno, bno + 1, asf);
		
		// box said yes to queen
		int rno = (bno - 1) / chess.length;
		int cno = (bno - 1) % chess.length;
		
		if(chess[rno][cno] == false){
			if(isTheQueenSafe(chess, rno, cno) == true){
				chess[rno][cno] = true;
				printNQueensSS(chess, qno + 1, bno + 1, asf + rno + cno + " ");
				chess[rno][cno] = false;
			}
		}
	}

	
	private static void printEquiSets(int[] arr, int vidx, 
									  String set1, int sos1,
									  String set2, int sos2){
		if(vidx == arr.length){
			if(sos1 == sos2){
				System.out.println(set1 + "  and " + set2);
			}

			return;
		}
		
		printEquiSets(arr, vidx + 1, set1 + arr[vidx], sos1 + arr[vidx], set2, sos2);
		printEquiSets(arr, vidx + 1, set1, sos1, set2 + arr[vidx], sos2 + arr[vidx]);
	}
	
}
