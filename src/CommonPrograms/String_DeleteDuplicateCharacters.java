package CommonPrograms;

public class String_DeleteDuplicateCharacters {

	public static void main(String[] args) {
		
//		
//		// Logic 1
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
		
		
		// Logic 2
		String str = "abbcccda";
		for (int i = 0; i < str.length(); i++) {
			int count=0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				
			}
			if(count>1) {
				str = str.replace(String.valueOf(str.charAt(i)), "");
				i--;
			}
			
		}
		System.out.println(str);
		
		
	}
}
