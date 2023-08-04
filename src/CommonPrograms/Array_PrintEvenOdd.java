package CommonPrograms;

public class Array_PrintEvenOdd {

	public static void main(String[] args) {
		
		// Logic 1
		int[] numbers = { 2, 5, 6, 3, 3, 7 };
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] % 2 == 0)
				System.out.println(numbers[j] + " - is even");
			else
				System.out.println(numbers[j] + " - is odd");
		}
		
// 		// Logic 2
//		for (int value : numbers) {
//			if (value%2 == 0)
//				System.out.println(value + " - is even");
//			else
//				System.out.println(value + " - is odd");
//			
//		}
		
		

	}

}
