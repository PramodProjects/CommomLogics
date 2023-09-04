package CommonPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Array_DuplicateElements {

	public static void main(String[] Args) {
		
		// Logic 1
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
		
		// Logic 3
		int[] arr = new int[] { 2, 3, 1, 2, 8, 1, 2, 1, 1, 8, 3, 9, 4, 4 };
		
		for (int i = 0; i < arr.length; i++) {
			int count1 = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count1++;
					arr[j] = '\0';
				}
			}

			if (arr[i] != '\0' && count1>1) {
				System.out.println(arr[i] + "- is duplicate");
			}
			
		}


		// Logic 4  Using Map
		int[] num1 = { 1, 2, 3, 1, 2 };
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < num1.length; i++) {

			if (!hMap.containsKey(num1[i])) {
				hMap.put(num1[i], 1);

			} else {
				int n = hMap.get(num1[i]);
				hMap.put(num1[i], n + 1);

			}
		}
		Set<Entry<Integer, Integer>> set = hMap.entrySet();
		Iterator<Entry<Integer, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<Integer, Integer> entryMap =  it.next();
			if (entryMap.getValue() > 1) {
				System.out.println(entryMap.getKey() + " is  "  +  entryMap.getValue()+ " times");
			}
		}

	}

}
