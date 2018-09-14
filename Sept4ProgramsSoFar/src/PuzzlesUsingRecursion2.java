
public class PuzzlesUsingRecursion2 {

	public static void main(String[] args) {
		// printBPWDiagonals(0, 0, 2, 2, "");
		// printBPWIthMultiMoves(0, 0, 2, 2, "");
//		int[][] maze = { { 0, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0 },
//				{ 0, 1, 1, 0, 0 } };
//		floodfillReactive(maze, 0, 0, "", new boolean[maze.length][maze[0].length]);
//		boolean[] boxes = new boolean[4];
//		queenPermutations(boxes, 1, 2, "");
		int[] coins = {2, 3, 5, 6};
		coinChange(coins, 10, 0, "");
	}

	public static void printBP(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}

		if (sr < dr) {
			printBP(sr + 1, sc, dr, dc, psf + "V");
		}

		if (sc < dc) {
			printBP(sr, sc + 1, dr, dc, psf + "H");
		}
	}

	static int count = 0;

	public static void printBPWDiagonals(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			count++;
			System.out.println(count + ". " + psf);
			return;
		}

		if (sr < dr && sc < dc) {
			printBPWDiagonals(sr + 1, sc, dr, dc, psf + "V");
			printBPWDiagonals(sr, sc + 1, dr, dc, psf + "H");
			printBPWDiagonals(sr + 1, sc + 1, dr, dc, psf + "D");
		} else if (sr < dr) {
			printBPWDiagonals(sr + 1, sc, dr, dc, psf + "V");
		} else if (sc < dc) {
			printBPWDiagonals(sr, sc + 1, dr, dc, psf + "H");
		}
	}

	public static void printBPWIthMultiMoves(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			count++;
			System.out.println(count + ".  " + psf);
			return;
		}

		// horizontal calls
		for (int size = 1; size <= dc - sc; size++) {
			printBPWIthMultiMoves(sr, sc + size, dr, dc, psf + "H" + size);
		}

		// vertical calls
		for (int size = 1; size <= dr - sr; size++) {
			printBPWIthMultiMoves(sr + size, sc, dr, dc, psf + "V" + size);
		}

		// diagonal calls
		for (int size = 1; size <= dc - sc && size <= dr - sr; size++) {
			printBPWIthMultiMoves(sr + size, sc + size, dr, dc, psf + "D" + size);
		}
	}

	public static void floodfill(int[][] maze, int sr, int sc, String psf, boolean[][] visited) {
		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			System.out.println(psf);
			return;
		}

		visited[sr][sc] = true;
		if (sr - 1 >= 0 && maze[sr - 1][sc] != 1 && visited[sr - 1][sc] == false) {
			floodfill(maze, sr - 1, sc, psf + "T", visited);
		}

		if (sc + 1 < maze[0].length && maze[sr][sc + 1] != 1 && visited[sr][sc + 1] == false) {
			floodfill(maze, sr, sc + 1, psf + "R", visited);
		}

		if (sr + 1 < maze.length && maze[sr + 1][sc] != 1 && visited[sr + 1][sc] == false) {
			floodfill(maze, sr + 1, sc, psf + "D", visited);
		}

		if (sc - 1 >= 0 && maze[sr][sc - 1] != 1 && visited[sr][sc - 1] == false) {
			floodfill(maze, sr, sc - 1, psf + "L", visited);
		}
	}

	public static void floodfill1(int[][] maze, int sr, int sc, String psf, 
								  boolean[][] visited) {
		if(sr == maze.length - 1 && sc == maze[0].length - 1){
			System.out.println(psf);
			return;
		}
		
		visited[sr][sc] = true;
		if (sr > 0 && maze[sr - 1][sc] == 0 && visited[sr - 1][sc] == false) {
			floodfill1(maze, sr - 1, sc, psf + "T", visited);
		}

		if (sc < maze[0].length - 1 && maze[sr][sc + 1] == 0 && visited[sr][sc + 1] == false) {
			floodfill1(maze, sr, sc + 1, psf + "R", visited);
		}

		if (sr < maze.length - 1 && maze[sr + 1][sc] == 0 && visited[sr + 1][sc] == false) {
			floodfill1(maze, sr + 1, sc, psf + "D", visited);
		}

		if (sc > 0 && maze[sr][sc - 1] == 0 && visited[sr][sc - 1] == false) {
			floodfill1(maze, sr, sc - 1, psf + "L", visited);
		}
		visited[sr][sc] = false;
	}

	public static void floodfillReactive(int[][] maze, 
										 int sr, int sc, 
										 String psf, 
										 boolean[][] visited){
		if(sr == maze.length - 1 && sc == maze[0].length - 1){
			System.out.println(psf);
			return;
		}
		
		if(HaveIReachedAWrongPlace(maze, sr, sc, visited) == true){
			return;
		}
		
		visited[sr][sc] = true;
		floodfillReactive(maze, sr - 1, sc, psf + "T", visited);
		floodfillReactive(maze, sr, sc + 1, psf + "R", visited);
		floodfillReactive(maze, sr + 1, sc, psf + "D", visited);
		floodfillReactive(maze, sr, sc - 1, psf + "L", visited);
		visited[sr][sc] = false;
	}

	private static boolean HaveIReachedAWrongPlace(int[][] maze, int sr, int sc, boolean[][] visited) {
		if(sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length){
			return true;
		} else if(maze[sr][sc] == 1){
			return true;
		} else if(visited[sr][sc] == true){
			return true;
		} else {
			return false;
		}
	}

	static int counter = 0;
	public static void queenPermutations(boolean[] boxes, 
										 int qno, int tnq, 
										 String asf){
		if(qno > tnq){
			counter++;
			System.out.println(counter + ". " + asf);
			return;
		}
		
		for(int bno = 0; bno < boxes.length; bno++){
			if(boxes[bno] == false){
				boxes[bno] = true;
				queenPermutations(boxes, qno + 1, tnq, asf + "q" + qno + "b" + bno + " ");
				boxes[bno] = false;
			}
		}
		
	}
	
	public static void queenCombinations(boolean[] boxes, 
										 int qno, int tnq, 
										 String asf){
		
	}

	public static void coinChange(int[] coins, int amt, int psf, String asf){
		if(psf == amt){
			System.out.println(asf);
			return;
		}
		
		for(int coin: coins){
			if(psf + coin <= amt){
				coinChange(coins, amt, psf + coin, asf + coin);
			}
		}
	}

}
