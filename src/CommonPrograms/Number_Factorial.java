package CommonPrograms;

public class Number_Factorial {

	public static void main(String[] args) {

		// Logic 1
		int number = 6;
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
			System.out.println(factorial);
		}
		System.out.println(factorial);

		System.out.println("factorial is " + fact(6));

	}

	// Logic 2 recursion
	public static int fact(int n) {
		if (n == 0)
			return 1;
		else
			return (n * fact(n - 1));
	}

}
