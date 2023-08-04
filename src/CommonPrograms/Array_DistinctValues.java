package CommonPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array_DistinctValues {

	public static void main(String[] args) {

		// Logic 1 - without using collection
		int[] numbers = { 1, 7, 2, 7, 2, 2, 3, 3, 5 };

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
		System.out.println();
		
		// ***************Logic 3 - ********
		int[] num1 = { 1, 7, 2, 7, 2, 2, 3, 3, 5 };
		int[] num2 = new int[num1.length];
		int count = 0;
		for (int i = 0; i < num1.length; i++) {
			boolean isDistinct = true;
			for (int j = 0; j < i; j++) {
				if (num1[i] == num1[j]) {
					isDistinct = false;
					break;
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

		// logic 4
		int[] num11 = { 1, 7, 2, 7, 2, 2, 3, 3, 5 };

		for (int i = 0; i < num11.length; i++) {

			for (int j = i + 1; j < num11.length; j++) {
				if (num11[i] == num11[j]) {
					num11[j] = '\0';
				}
			}

		}

		for (int i = 0; i < num11.length; i++) {
			if (num11[i] != '\0') {
				System.out.print(num11[i]);
			}
		}
		System.out.println();
		
		// Using Lambda Expression logic5
		int[] lnumbers = { 1, 2, 2, 4, 4, 1 };
		IntStream sNumbers = IntStream.of(lnumbers);
		sNumbers.distinct().forEach(a -> System.out.print(a));
		
		System.out.println();
		
		// logic 6
		Arrays.stream(lnumbers).distinct().forEach(a->System.out.print(a));

		System.out.println();
		
		// logic 7
		String[] arrayStrings1 = { "A", "U", "B", "A", "Z", "A", "B", "E", "P", "A" };
		Arrays.stream(arrayStrings1).distinct().forEach(a -> System.out.print(a));
		
		// logic 8
		String[] arrayStrings2 = { "A", "U", "B", "A", "Z", "A", "B", "E", "P", "A" };

		String[] distictVal = new String[arrayStrings2.length];

		int count1 = 0;

		for (int i = 0; i < distictVal.length; i++) {
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (arrayStrings2[i].equals(arrayStrings2[j])) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				distictVal[count1] = arrayStrings2[i];
				count1++;
			}

		}
		System.out.println(Arrays.toString(distictVal));
		String[] distictStrArr = Arrays.copyOf(distictVal, count1);
		System.out.println(Arrays.toString(distictStrArr));
	}

}
