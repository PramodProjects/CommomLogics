package CommonPrograms;

public class String_WordReverse {

	public static void main(String[] args) {
		
		// Logic 1
		String str = "pra mod jan ji rala";
		String[] strArr = str.split(" ");
		String wordReverse1 = "";		
		for (int i = 0; i < strArr.length; i++) {
			String strReverse = "";
			for (int j = 0; j < strArr[i].length(); j++) {
				strReverse = strArr[i].charAt(j) + strReverse;
			}
			wordReverse1 = wordReverse1 + strReverse + " ";			
		}
		System.out.println(wordReverse1);
		

		// Logic 2
		
		String strn = "This is Apple, Apple is a good organisation";		
		String[] strnArr = strn.split(" ");
		String wordRev = "";		
		for (int i = 0; i < strnArr.length; i++) {
			String strRev = "";
			for (int j = 0; j < strnArr[i].length(); j++) {

				strRev = strnArr[i].charAt(j) + strRev;

			}
			if (strRev.contains(",")) {
				strRev = strRev.replace(",", "");
				strRev = strRev + ",";
				wordRev = wordRev + strRev + " ";
			}

			else {
				wordRev = wordRev + strRev + " ";
			}
		}
		System.out.println(wordRev);
		
		
//		// Logic 3
//		// Using Strin Builder
//		String s = "abc xyz";
//
//		String[] s1 = s.split(" ");
//		String reverse = "";
//		for (String str : s1) {
//			StringBuffer sb = new StringBuffer(str);
//			sb.reverse();
//			reverse = reverse + " " + sb;
//		}
//
//		System.out.println(reverse);
		
		
		

//		// out put - xyz abc
//		String str ="abc xyz";
//		String strReverse ="";
//		
//		String[] strArr = str.split(" ");
//		for (int i = 0; i < strArr.length; i++) {
//			strReverse = strArr[i] + " " + strReverse;
//			
//		}
//		System.out.println(strReverse);

		
		
//		// Output - zyx cba
//		String str ="abc xyz";
//		String strReverse ="";
//		for (int i = 0; i < str.length(); i++) {
//			strReverse = str.charAt(i) + strReverse;
//			
//		}
//		System.out.println(strReverse);

	}

}
