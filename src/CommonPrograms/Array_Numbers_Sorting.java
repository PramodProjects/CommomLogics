package CommonPrograms;

import java.util.Arrays;
import java.util.Collections;

public class Array_Numbers_Sorting {

	public static void main(String[] args) {

		int[] numbers = { 3, 3, 5, 1, 9, 6, 4, 4 };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					numbers[i] = numbers[i] + numbers[j];
					numbers[j] = numbers[i] - numbers[j];
					numbers[i] = numbers[i] - numbers[j];
				}
			}
			System.out.print(numbers[i]);
			
		}
		System.out.println(Arrays.toString(numbers));
		
		
		// Logic 2
		int[] num1 = {1,95, 70, 1, 1, 6, 4, 5, 90, 90 };
		Arrays.sort(num1);		
		System.out.println(Arrays.toString(num1));
		
		// Descending order
		Integer[] num2 = {1,95, 70, 1, 1, 6, 4, 5, 90, 90 };		
		Arrays.sort(num2, Collections.reverseOrder());;
		System.out.println(Arrays.toString(num2));

	}

}
