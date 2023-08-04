package CommonPrograms;

import java.util.Arrays;

public class Array_EqualityOfTwoArrays {

	public static void main(String[] args) {
		
		// Logic 1
		int[] num1 = { 1, 3, 5 };
		int[] num2 = { 1, 3, 5 };

		boolean flag = true;
		if (num1.length == num2.length) {
			for (int i = 0; i < num2.length; i++) {
				if (num1[i] != num2[i]) {
					flag = false;
				}
			}
		} else {
			flag = false;
		}

		if (flag == true) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		
//		// Logic 2
//		boolean bool = Arrays.equals(num1, num2);
//		if (bool == true) {
//			System.out.println("equal");
//		} else {
//			System.out.println("not equal");
//		}

	}

}
