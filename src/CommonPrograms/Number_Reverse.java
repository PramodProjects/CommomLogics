package CommonPrograms;

public class Number_Reverse {

	public static void main(String[] args) {
		int number = 153;
		//int remainder = 0;
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println(reverse);

		reverseNumber(1234);

	}

	// Reverse number using Recursive method
	public static void reverseNumber(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			reverseNumber(number / 10);
		}
	}

}
