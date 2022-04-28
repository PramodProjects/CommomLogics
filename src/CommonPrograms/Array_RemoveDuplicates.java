package CommonPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Array_RemoveDuplicates {

	public static void main(String[] args) {

		// Logic 1 - without using collection
		int[] numbers = {1, 7, 2, 7, 2, 2, 3, 3, 5 };

		int arrLength = numbers.length;
		for (int i = 0; i < arrLength; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if (numbers[i] == numbers[j]) {
					numbers[j] = numbers[arrLength - 1];
					arrLength--;
					j--;
				}
			}
		}
		
		for (int i = 0; i < arrLength; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();

		// ***************Logic 2 - Using collection********

		String[] arrayStrings = { "A", "U", "B", "A", "Z", "A", "B", "E", "P", "A" };
		List<String> listString = Arrays.asList(arrayStrings);
		Set<String> setString = new HashSet<String>(listString);
		for (String set : setString) {
			System.out.print(set + " ");
		}
		
		
		
		// Using Lambda Expression
				int[] lnumbers = { 1, 2, 2, 4, 4, 1 };
				IntStream sNumbers = IntStream.of(lnumbers);
				sNumbers.distinct().forEach(a -> System.out.println(a));
				
				

	}

}
