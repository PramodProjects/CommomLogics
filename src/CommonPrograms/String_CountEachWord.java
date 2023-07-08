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
		
		// Logic 2
		String str1 = "aa aa bb cc aa bb cc";
		String[] strArr = str1.split(" ");
		int[] freq = new int[str1.length()];

		for (int i = 0; i < strArr.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].equals(strArr[j])) {
					freq[i]++;
					strArr[j] = "";
				}
			}
		}

		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != "") {
				System.out.println(strArr[i] + "-" + freq[i]);
			}
		}


	}

}
