package CommonPrograms;

import java.util.ArrayList;

public class String_CountEachWord {

	public static void main(String[] args) {
		String s = "aa aa bb cc aa bb cc";
		String[] str = s.split(" ");
		int count=0;
		ArrayList al = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if(str[i].equals(str[j])) {
					
					count++;
				}
			}
			if(!al.contains(str[i])) {
				al.add(str[i]);
			System.out.println(str[i] + " " + count);			
			}
			count =0;
		}

	}

}
