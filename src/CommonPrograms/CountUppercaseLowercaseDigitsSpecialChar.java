package CommonPrograms;

public class CountUppercaseLowercaseDigitsSpecialChar {

	public static void main(String[] args) {
		String s = "1234XXXXXgggg@@";

		int dCount = 0;
		int lCount = 0;
		int uCount = 0;
		int sCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				dCount++;
			} else if (Character.isLowerCase(c)) {
				lCount++;
			} else if (Character.isUpperCase(c)) {
				uCount++;
			} else {
				sCount++;
			}

		}

		System.out.println("Digits - " + dCount);
		System.out.println("Upper Chars - " + uCount);
		System.out.println("Lower chars - " + lCount);
		System.out.println("Special chars - " + sCount);

		
		
		/// Logic 2
		int nCount = 0;
		int clCount = 0;
		int slCount = 0;
		int scCount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >='a' && s.charAt(i)<='z')
				slCount++;
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				clCount++;
			else if(s.charAt(i) >='0' && s.charAt(i)<='9')
				nCount++;
			else
				scCount++;
		}
		
		System.out.println("number count " + nCount);
		System.out.println("small letters count " + slCount);
		System.out.println("Capital letters count " + clCount);
		System.out.println("Special Characters count " + scCount);
		
		
		
		
		
	}

}
