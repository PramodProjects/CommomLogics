package CommonPrograms;

import java.util.Arrays;

public class Array_3rdLargestNumber {

	public static void main(String[] args) {
		int[] num11 = {6, 2, 3, 2, 9, 7, 7, 5, 4,2};
		Integer[] num22 = Arrays.stream(num11).boxed().distinct().sorted((a, b) -> -a.compareTo(b)).toArray(Integer[]::new);
		System.out.println(Arrays.toString(num22));
		System.out.println(num22[2]);
		

	}

}
