import java.util.Arrays;

public class Main {
	public static int[] removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		int k = 1;
		for (int i = 1; i < arr.length; i++) {
			if (i == 1 || arr[i] != arr[i - 1]) {
				arr[i++] = arr[i];
			}
		}
		return Arrays.copyOf(arr, k);
	}

	public static void main(String[] args) {
		int[] arr = {2, 4, 1, 2, 1, 2, 4, 5};

		int[] distinct = removeDuplicates(arr);
		System.out.println(Arrays.toString(distinct));
	}
}