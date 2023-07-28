package CommonPrograms;

import java.util.Arrays;

public class Array_SmallestNumber {

	public static void main(String[] args) {
		
		
		// Logic 1
		int[] numbers = { 3, 1, 5, 9, 9, 3, 4, 8 };
		int smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		System.out.println(smallest);
		
		
		// Logic 2 - java 8
		int small = Arrays.stream(numbers).min().getAsInt();
		System.out.println(small);

	}

}
