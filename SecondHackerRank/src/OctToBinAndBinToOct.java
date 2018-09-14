import java.util.Scanner;

public class OctToBinAndBinToOct {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sn = scn.nextInt();
		byte sb = scn.nextByte();
		byte db = scn.nextByte();
		int sum1 = 0;
		int sum2 = 0;
		int pv1 = 1;
		int pv2 = 1;
		int rem = 0;
		int rem1 = 0;
		while (sn != 0) {
			rem1 = sn % 10;
			sn = sn / 10;
			sum1 = sum1 + (rem1 * pv1);
			pv1 = pv1 * sb;
		}
		while (sum1 != 0) {
			rem = sum1 % db;
			sum1 = sum1 / db;
			sum2 = sum2 + (rem * pv2);
			pv2 = pv2 * 10;
		}
		System.out.println(sum2);
		scn.close();
	}

}
