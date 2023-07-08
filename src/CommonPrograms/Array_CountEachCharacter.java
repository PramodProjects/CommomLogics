package CommonPrograms;

import java.util.ArrayList;

public class Array_CountEachCharacter {

	public static void main(String[] args) {
		
		// Logic 1
		char[] c = { 'a', 'a', 'b', 'c', 'a', 'b', 'c', 'c' };
		ArrayList al = new ArrayList<>();
		int count =0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if(c[i] == c[j]) {
					count++;
				}

			}
			
			if(!al.contains(c[i])) {
				al.add(c[i]);
			System.out.println(c[i] + "  " + count);			
			}
			count=0;
		}
		
		// Logic 2
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1, 8 };
		int count1 = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count1++;
					arr[j] = -1;
				}
			}

			if (arr[i] != -1) {
				System.out.println(arr[i] + "-" + count1);
			}
			count1 = 1;
		}



	}

}
