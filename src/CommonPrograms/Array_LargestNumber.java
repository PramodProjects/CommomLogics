package CommonPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array_LargestNumber {

	public static void main(String[] args) {

		// Logic 1
		int[] numbers = { 60, 34, 1, 4, 8, 3, 80, 10, 4, 8, 34, 2, 9, 70, 70 };
		int largest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		System.out.println(largest);
		
		
		// Logic 2
		int max =Arrays.stream(numbers).max().getAsInt();
		System.out.println(max);
		
		
		// Logic 3
		// Need to be flattened to its primitive type
		int max1 = Stream.of(numbers).flatMapToInt(Arrays::stream).max().getAsInt();
		System.out.println(max1);
		
		// Logic 4
		int n1 = IntStream.of(numbers).max().getAsInt();
		System.out.println(n1);
		
		
		
		
		
		
	}
}
