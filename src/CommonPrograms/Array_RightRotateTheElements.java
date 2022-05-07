package CommonPrograms;

import java.util.Arrays;

public class Array_RightRotateTheElements {

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 4, 5 };

		int last = num1[num1.length - 1];
		for (int i = num1.length - 1; i > 0; i--) {
			num1[i] = num1[i - 1];
		}
		num1[0] = last;
		System.out.println(Arrays.toString(num1));
		
		
//		// For 3 right rotations
//		int[] num1 = { 1, 2, 3, 4, 5 };
//
//		for (int i = 0; i < 3; i++) {
//
//			int last = num1[num1.length - 1];
//			for (int j = num1.length - 1; j > 0; j--) {
//				num1[j] = num1[j - 1];
//			}
//			num1[0] = last;
//		}
//		System.out.println(Arrays.toString(num1));

	}

}
