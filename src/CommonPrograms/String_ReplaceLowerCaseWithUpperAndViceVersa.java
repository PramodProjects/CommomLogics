package CommonPrograms;

public class String_ReplaceLowerCaseWithUpperAndViceVersa {

	public static void main(String[] args) {
		String str = "ABCabcAAbbNN";

		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				str1 = str1 + Character.toLowerCase(str.charAt(i));
			} else {
				str1 = str1 + Character.toUpperCase(str.charAt(i));
			}

		}

		System.out.println(str1);

		// Login 2
		String str2 = "Great Power";
		StringBuffer newStr = new StringBuffer(str2);

		for (int i = 0; i < str2.length(); i++) {

			// Checks for lower case character
			if (Character.isLowerCase(str2.charAt(i))) {
				// Convert it into upper case using toUpperCase() function
				newStr.setCharAt(i, Character.toUpperCase(str2.charAt(i)));
			}
			// Checks for upper case character
			else if (Character.isUpperCase(str2.charAt(i))) {
				// Convert it into upper case using toLowerCase() function
				newStr.setCharAt(i, Character.toLowerCase(str2.charAt(i)));
			}
		}
		System.out.println("String after case conversion : " + newStr);

	}

}
