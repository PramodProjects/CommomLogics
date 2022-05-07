package CommonPrograms;

public class Number_GCD {

	public static void main(String[] args) {
		// Greatest Common Divisor
		// Factors of 12: 1, 2, 3, 4, 6, 12
		// Factors of 8: 1, 2, 4, 8
		// Common Factors: 1, 2, 4
		// Greatest Common Factor: 4

		int num1 = 8;
		int num2 = 12;
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);

	}

}
