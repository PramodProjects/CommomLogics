package CommonPrograms;

public class String_WordReverse {

	public static void main(String[] args) {
		String str = "pra mod jan ji rala";
		String[] strArr = str.split(" ");
		String wordReverse = "";
		for (int i = 0; i < strArr.length; i++) {
			String strReverse = "";
			for (int j = 0; j < strArr[i].length(); j++) {
				strReverse = strArr[i].charAt(j) + strReverse;
			}
			wordReverse = wordReverse + strReverse + " ";
		}
		System.out.println(wordReverse);

		
		
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
