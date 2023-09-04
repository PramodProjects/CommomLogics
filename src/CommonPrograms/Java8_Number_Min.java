package CommonPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.stream.Streams;

public class Java8_Number_Min {

	public static void main(String[] args) {

		// Logic 1
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(5);
		alist.add(9);
		alist.add(1);
		alist.add(4);

		int i = alist.stream().min((a, b) -> a.compareTo(b)).get();
		System.out.println(i);

		// Logic 2
		int[] arrayInt = { 2, 5, 7, 2 };
		int j = Arrays.stream(arrayInt).min().getAsInt();
		System.out.println(j);

		// Logic 3
		Integer[] arrayInt3 = { 2, 5, 7, 2 };
		int n = Arrays.stream(arrayInt3).min((a, b) -> a.compareTo(b)).get();
		System.out.println(n);

		// Logic 4
		int[] arrayInt1 = { 2, 5, 7, 2 };
		int k = IntStream.of(arrayInt1).min().getAsInt();
		System.out.println(k);

		// Logic 5
		Integer[] arrayInt2 = { 2, 5, 7, 2 };
		int m = Stream.of(arrayInt2).min((a, b) -> a.compareTo(b)).get();
		System.out.println(m);

	}

}
