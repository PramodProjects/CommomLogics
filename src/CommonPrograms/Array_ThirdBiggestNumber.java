package CommonPrograms;

import java.util.Arrays;

public class Array_ThirdBiggestNumber {

	public static void main(String[] args) {
		int[] n = { 2, 1, 6, 3, 9, 4 };

		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] < n[j]) {
					n[i] = n[i] + n[j];
					n[j] = n[i] - n[j];
					n[i] = n[i] - n[j];
				}
			}
		}
		System.out.println(Arrays.toString(n));
		System.out.println(n[2]);


	}

}
