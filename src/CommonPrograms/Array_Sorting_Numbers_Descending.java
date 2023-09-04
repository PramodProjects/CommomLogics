package CommonPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Array_Sorting_Numbers_Descending {

	public static void main(String[] args) {

		// Logic 1
		int[] numbers = { 3, 3, 5, 1, 9, 6, 4, 4 };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					numbers[i] = numbers[i] + numbers[j];
					numbers[j] = numbers[i] - numbers[j];
					numbers[i] = numbers[i] - numbers[j];
				}
			}
			System.out.print(numbers[i]);

		}
		System.out.println();
		System.out.println(Arrays.toString(numbers));

		// Logic 2
		Integer[] num1 = { 1, 95, 70, 1, 1, 6, 4, 5, 90, 90 };
		Arrays.sort(num1, Comparator.reverseOrder());
		System.out.println(Arrays.toString(num1));

		// Using Streams
		Integer[] numbers1 = { 3, 3, 5, 1, 9, 6, 4, 4 };
		Arrays.stream(numbers1).sorted((a, b) -> -a.compareTo(b)).forEach(x -> System.out.print(x));

	}

}
