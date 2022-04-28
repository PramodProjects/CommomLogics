package CommonPrograms;

public class Array_SmallestNumber {

	public static void main(String[] args) {
		int[] numbers = { 3, 1, 5, 9, 9, 3, 4, 8 };
		int smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		System.out.println(smallest);

	}

}
