package CommonPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// Integer Palindrome
		int number = 141;
		int num = number;
		int remainder = 0;
		int reverse = 0;
		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		if (num == reverse) {
			System.out.println(num + " - is Palindrome");
		} else {
			System.out.println(num + " - is not Palindrome");
		}

		// String Palindrome
		String str = "malayalam";
		String strReverse = "";
		for (int i = 0; i < str.length(); i++) {
			strReverse = str.charAt(i) + strReverse;
		}
		
//		for (int i =s.length()-1; i >=0; i--) {
//			
//			 ss = ss+ s.charAt(i);
//		}
		if (str.equals(strReverse)) {
			System.out.println(str + " - is Palindrome");
		} else {
			System.out.println(str + " - is not palindrome");
		}
		
		
		
//		// polidrom numbers between 1 to 1000
//		for (int i = 0; i < 1000; i++) {
//
//			int number = i;
//			int num = number;
//			int remainder = 0;
//			int reverse = 0;
//			while (number != 0) {
//				remainder = number % 10;
//				reverse = reverse * 10 + remainder;
//				number = number / 10;
//			}
//			if (num == reverse) {
//				System.out.println(num + " - is Palindrome");
//			}
//		}
		
		
//		// Another logic String polindrom
//		String str = "adada";
//		boolean flag = true;
//		for (int i = 0; i < str.length() / 2; i++) {
//			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
//				flag = false;
//				break;
//			}
//
//		}
//		if (flag) {
//			System.out.println("polindrom");
//		} else {
//			System.out.println("not polindrom");
//		}

		
		
	}

}
