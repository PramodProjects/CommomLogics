package CommonPrograms;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Java8_AverageArray {

	public static void main(String[] args) {
		// Logic 1 using simple loop

		int[] num = { 1, 2, 3, 4 };
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total = total + num[i];
		}
		System.out.println(total / num.length);
		
		// Logic 2 Streams
		OptionalDouble od =  Arrays.stream(num).average();
		System.out.println(od.getAsDouble());

	}

}
