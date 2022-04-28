package CommonPrograms;

import java.util.ArrayList;

public class Array_CountEachCharacter {

	public static void main(String[] args) {
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


	}

}
