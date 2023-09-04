
package CommonPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_CountEachCharacter {

	public static void main(String[] args) {
		String s = "abcdefab";
		char c = 'a';
		// count for single character
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}

		}
		System.out.println("Count of char - " + count);

		// Count all chars
		String s1 = "abcdabcdd";
		
		for (int i = 0; i < s1.length(); i++) {
			int count1 = 0;
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					count1++;
				}

			}
			System.out.println("number of occurences of - " + s1.charAt(i) + " - " + count1);
			s1 = s1.replaceAll(String.valueOf(s1.charAt(i)), "");
			//s1 = s1.replaceAll(Character.toString(s1.charAt(i)), "");
			i--;
			

		}
		
		// Login 2
		String str = "abcabcz00";
		char[] strArr = str.toCharArray();
		int[] freq = new int[str.length()];		
		
		for (int i = 0; i < strArr.length; i++) {
			freq[i] = 1;
			for (int j = i+1; j < strArr.length; j++) {
				if(strArr[i] == strArr[j]) {
					freq[i]++;
					strArr[j] = '\0';
				}
			}
		}
	
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i] !='\0') {
				System.out.println(strArr[i] + "-" + freq[i]);
			}
		}
		
		// Logic 3
		String str2 = "abcabcz00";
		char[] strArr2 = str2.toCharArray();		
		for (int i = 0; i < strArr2.length; i++) {
			int count2 = 1;
			for (int j = i + 1; j < strArr2.length; j++) {
				if (strArr2[i] == strArr2[j]) {
					count2++;
					strArr2[j] = '\0';
				}
			}
			if (strArr2[i] != '\0') {
				System.out.println(strArr2[i] + "-" + count2);
			}
		}
		
		
		
		// Logic 4 Using lamda
		String s2 = "fdhklf";
		long cnt =s2.chars().filter(ch-> ch == 'f').count();
		System.out.println(cnt);
		
		// Logic 5
		String s3 = "abcabca";
		Map<Object, Long> result = s3.chars().mapToObj(a -> (char) a)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);

	}

}
