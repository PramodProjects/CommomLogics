package CommonPrograms;

import java.util.Arrays;

public class Array_CopyArrayIntoAnotherArray {

	public static void main(String[] args) {
		
		// Logic 1
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];
		arr2 = arr1;
		System.out.println(Arrays.toString(arr2));
		
		
//		// Logic 2
//		int[] arr1 = { 1, 2, 3, 4, 5 };
//		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
//		System.out.println(Arrays.toString(arr2));
		
	}

}
