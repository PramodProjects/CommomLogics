package CommonPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Number_Sum {

	public static void main(String[] args) {
		
		// Logic 1
		System.out.println(sum(1,2,3,4,5)); 	

		// Logic 2 Streams
		int sum1  = Stream.of(1,2,3,4).mapToInt(a -> a).sum();
		System.out.println(sum1);
		
		// Logic 3 Streams
		Integer[] nums = {1,2,3};
		int sum2 = Stream.of(nums).reduce(0, (a,b) -> a+b);
		System.out.println(sum2);
		
		// Logic 4 Streams
		Integer[] numbers = {1,1,1,1};
		int sum = Stream.of(numbers).mapToInt(a ->a).sum();
		System.out.println(sum);
		
		// Logic 5 Streams
		int[] nums3 = {1,1,1,1};
		int sum3 = Arrays.stream(nums3).sum();
		System.out.println(sum3);
		
		// Logic 6
		Integer[] nums4 = {1,1,1,1};
		int sum4 = Arrays.stream(nums4).mapToInt(a -> a).sum();
		System.out.println(sum4);
		
		// Logic 7 Streams
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		int sum5 = al.stream().mapToInt(a -> a).sum();
		System.out.println(sum5);
		
		// Logic 8
		int[] nums5 = {1,1,1,1};
		int sum6 = IntStream.of(nums5).sum();
		System.out.println(sum6);
	}

	public static int sum(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total = total + number;
		}
		
//		for (int i=0;i<numbers.length;i++)
//		{
//			total = total + numbers[i];
//		}
		return total;
	}
}
