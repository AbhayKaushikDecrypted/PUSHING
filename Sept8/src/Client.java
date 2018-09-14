
public class Client {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 6, 7, 9 };
		SUMPAIR(arr, 7);
	}

	private static void SUMPAIR(int[] arr, int tg) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int sum = arr[start] + arr[end];
			if (sum < tg) {
				start++;
			} else if (sum > tg) {
				end--;
			} else {
				System.out.println(arr[start] + " " + arr[end]);
				start++;
				end--;
			}
		}
	}

}
