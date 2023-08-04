package CommonPrograms;

import java.util.Arrays;
import java.util.Collections;

public class Array_2ndLargestNumber {

	public static void main(String[] args) {
		int[] num1 = { 6, 2, 3, 2, 9, 9, 7, 7, 5, 4, 2 };
		int[] num2 = new int[num1.length];
		int count = 0;
		for (int i = 0; i < num1.length; i++) {
			boolean isDistinct = true;
			for (int j = 0; j < i; j++) {
				if (num1[i] == num1[j]) {
					isDistinct = false;
				}
			}
			if (isDistinct == true) {
				num2[count] = num1[i];
				count++;
			}
		}

		System.out.println(Arrays.toString(num2));
		num2 = Arrays.copyOf(num2, count);
		System.out.println(Arrays.toString(num2));

		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (num2[i] < num2[j]) {
					num2[i] = num2[i] + num2[j];
					num2[j] = num2[i] - num2[j];
					num2[i] = num2[i] - num2[j];
				}
			}

		}
		System.out.println(Arrays.toString(num2));
		System.out.println("Second largest number: " + num2[1]);

		// logic 2
		int[] num11 = { 6, 2, 3, 2, 9, 7, 7, 5, 4, 2 };
		int[] num22 = Arrays.stream(num11).distinct().sorted().toArray();
		System.out.println(Arrays.toString(num22));
		System.out.println(num22[num22.length - 2]);

	}

}
