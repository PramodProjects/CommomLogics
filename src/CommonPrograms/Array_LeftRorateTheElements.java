package CommonPrograms;

import java.util.Arrays;

public class Array_LeftRorateTheElements {

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 4, 5 };
		int first = num1[0];

		for (int i = 0; i < num1.length - 1; i++) {
			num1[i] = num1[i + 1];
		}
		num1[num1.length - 1] = first;
		System.out.println(Arrays.toString(num1));
		
		
//		// Rotate left 2 time
//		int[] num1 = { 1, 2, 3, 4, 5 };
//		for (int i = 0; i < 2; i++) {
//
//			int first = num1[0];
//
//			for (int j = 0; j < num1.length - 1; j++) {
//				num1[j] = num1[j + 1];
//			}
//			num1[num1.length - 1] = first;
//		}
//		System.out.println(Arrays.toString(num1));

	}

}
