package CommonPrograms;

public class Array_PrintElementsEvenPosition {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 1; i < arr.length; i += 2) {
			System.out.println(arr[i]);

		}

	}

}
