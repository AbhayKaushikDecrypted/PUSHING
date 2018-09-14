import java.util.Scanner;

public class OnTheBit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int mask = 1;
		mask = mask << k;
		n = n | mask;
		System.out.println(n);
		scn.close();
	}

}
