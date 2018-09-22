
public class Client {

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 2, 3, 4, 6, 7, 9 };
		// SUMPAIR(arr, 7);

		int[] arr = { 2, 15, 7, 6, 8, 4 };
		MAXARRAY(arr);
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

	private static void MAXARRAY(int[] arr) {
		int start = 0;
		int end = arr.length;
		int maxsum = 0;
		while (start < end) {
			int sum = (Math.abs(arr[start] - arr[end]) + Math.abs(start - end));
			if (sum>maxsum) {
				maxsum = sum;
				
			}
		}
	}
}