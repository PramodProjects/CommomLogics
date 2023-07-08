package CommonPrograms;

import java.util.Arrays;

public class Number_MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6 };

		// Logic 1
		int n = arr[arr.length - 1];
		// calculate the sum of all the array elements `arr`
		int sum = Arrays.stream(arr).sum();
		// expected sum - actual sum
		int missingNumber1 = (n * (n + 1) / 2) - sum;
		System.out.println(missingNumber1);

		// Login 2
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}
		int sum2 = 0;
		for (int i = 1; i <= arr[arr.length - 1]; i++) {
			sum2 = i + sum2;
		}
		int missingNumber2 = sum2 - sum1;
		System.out.println(missingNumber2);

	}

}
