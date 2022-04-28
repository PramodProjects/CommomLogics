package CommonPrograms;

public class Array_LargestNumber {

	public static void main(String[] args) {

		int[] numbers = { 60, 34, 1, 4, 8, 3, 80, 10, 4, 8, 34, 2, 9, 70, 70 };
		int largest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		System.out.println(largest);
	}
}
