package CommonPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array_Sum {

	public static void main(String[] args) {
		
		// Logic 1
		int[] arrayInt = { 2, 5, 7, 2};
		int sum = 0;
		for (int i = 0; i < arrayInt.length; i++) {
			sum = sum + arrayInt[i];
		}
		
//		for (int i : arrayInt) {
//			sum = sum+i;
//		}
		
		System.out.println(sum);
		
		// Logic 2
		int sum1 = IntStream.of(arrayInt).sum();
		System.out.println(sum1);
		
		// Logic 3
		int sum2 = Arrays.stream(arrayInt).sum();
		System.out.println(sum2);
		

	}

}
