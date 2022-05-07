package CommonPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Array_FindDuplicateElements {

	public static void main(String[] Args) {
		int[] num = { 2, 3, 1, 2, 8, 1, 2, 1, 1, 8, 3, 9, 4, 4 };
		ArrayList al = new ArrayList();
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {

				if (num[i] == num[j]) {

					count++;

				}
			}
			if (count > 1) {

				if (!al.contains(num[i])) {
					al.add(num[i]);
					System.out.println(num[i] + " - duplicate");
				}
			}
			count = 0;
		}

		
		// Using Collections
//		HashSet hSet = new HashSet();
//		for (int i = 0; i < num.length; i++) {
//			if (hSet.add(num[i]) == false) {
//				System.out.println(num[i] + " - is duplicate");
//			}
//		}

	}

}
