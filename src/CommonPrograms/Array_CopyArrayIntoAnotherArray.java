package CommonPrograms;

import java.util.Arrays;

public class Array_CopyArrayIntoAnotherArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];

		arr2 = arr1;

		System.out.println(Arrays.toString(arr2));
	}

}
