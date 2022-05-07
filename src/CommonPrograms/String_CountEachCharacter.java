package CommonPrograms;

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
		int count1 = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					count1++;
				}

			}
			System.out.println("number of occurences of - " + s1.charAt(i) + " - " + count1);
			s1 = s1.replaceAll(String.valueOf(s1.charAt(i)), "");
			i--;
			count1 = 0;

		}
		
		// Login 2
		String str = "abcabcz";
		char[] strArr = str.toCharArray();
		int[] freq = new int[str.length()];		
		
		for (int i = 0; i < strArr.length; i++) {
			freq[i] = 1;
			for (int j = i+1; j < strArr.length; j++) {
				if(strArr[i] == strArr[j]) {
					freq[i]++;
					strArr[j] = '0';
				}
			}
		}
	
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i] !='0') {
				System.out.println(strArr[i] + "-" + freq[i]);
			}
		}
		
		
		// Logic 3 Using lamda
		String s2 = "fdhklf";
		long cnt =s2.chars().filter(ch-> ch == 'f').count();
		System.out.println(cnt);

	}

}
