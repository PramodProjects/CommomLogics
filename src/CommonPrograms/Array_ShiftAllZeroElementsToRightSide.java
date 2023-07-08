package CommonPrograms;

import java.util.Arrays;

public class Array_ShiftAllZeroElementsToRightSide {

	public static void main(String[] args) {
		int[] num1 = { 0, 2, 0, 1, 6, 0, 4, 4 };
		int[] num2 = new int[num1.length];
		int count = 0;

		for (int i = 0; i < num1.length; i++) {
			if (num1[i] != 0) {
				num2[count] = num1[i];
				count++;
			}
		}

		System.out.println(Arrays.toString(num2));

	}

}
