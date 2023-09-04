package CommonPrograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Java8_Sum {

	public static void main(String[] args) {
		Integer[] numbers = { 60, 34, 1, 4, 8, 3, 80, 10, 4, 8, 34, 2, 9, 70, 70 };

		// Logic 1
		int sum1 = Stream.of(numbers).mapToInt(Integer::intValue).sum();
		System.out.println(sum1);

		// Logic 2
		int sum2 = Arrays.stream(numbers).mapToInt(a -> a.intValue()).sum();
		System.out.println(sum2);

		// Logic 3
		int sum3 = Arrays.stream(numbers).mapToInt(Integer::intValue).sum();
		System.out.println(sum3);
		
		// Logic 4
		int sum4 = Stream.of(numbers).mapToInt(a ->a).sum();
		System.out.println(sum4);
		

	}

}
