import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float c = (float) ((5.0 / 9) * (n - 32));
		System.out.println(c);
		scn.close();
	}

}
