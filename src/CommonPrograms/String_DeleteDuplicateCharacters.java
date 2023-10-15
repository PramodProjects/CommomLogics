package CommonPrograms;

public class String_DeleteDuplicateCharacters {

	public static void main(String[] args) {

		// Logic 1
		String string1 = "pprraqwp";
		int count1;
		char string[] = string1.toCharArray();
		for (int i = 0; i < string.length; i++) {
			count1 = 1;
			boolean flag = false;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j]) {
					flag = true;
					count1++;
					string[j] = '\0';
				}
			}
			if (flag == true) {
				string[i] = '\0';
			}

			if (string[i] != '\0') {
				System.out.print(string[i]);
			}
		}

		System.out.println();
//		// Logic 2
//		String str = "pprraqwp";
//		int count = 0;
//		String deleteDuplicate = "";
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = 0; j < str.length(); j++) {
//				if (str.charAt(i) == str.charAt(j)) {
//					count++;
//				}
//			}
//			if (count == 1) {
//
//				deleteDuplicate = deleteDuplicate + str.charAt(i);
//
//			}
//			count = 0;
//		}
//		System.out.print(deleteDuplicate);
		
		
		
		// Logic 3
		String str = "pprraqwp";
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i+1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}
			if (ch[i]!= '0' && count == 1) {
				System.out.print(ch[i]);
			}			
		}

//		// Logic 4
//		String str = "abbcccda";
//		for (int i = 0; i < str.length(); i++) {
//			int count=0;
//			for (int j = 0; j < str.length(); j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					count++;
//				}
//				
//			}
//			if(count>1) {
//				str = str.replace(String.valueOf(str.charAt(i)), "");
//				i--;
//			}
//			
//		}
//		System.out.println(str);
//		
//		

		// Logic 5
		System.out.println();
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			boolean flag = false;
			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					flag = true;
					sb.deleteCharAt(j);
					j--;
				}
			}
			if (flag == true) {
				sb.deleteCharAt(i);
				i--;

			}

		}
		System.out.println(sb);
	}
}
