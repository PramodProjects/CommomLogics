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

	}

}
