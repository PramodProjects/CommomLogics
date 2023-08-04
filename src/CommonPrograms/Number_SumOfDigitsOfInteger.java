package CommonPrograms;

public class Number_SumOfDigitsOfInteger {

	public static void main(String[] args) {
		//Logic 1
		int number = 12345;
		int sum = 0;
		int remainder;
		while (number != 0) {
			remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;

		}
		System.out.println(sum);
		
		//Logic 2
		/*int n = 123;
		 int sum = 0;
	        while (n != 0) {
	            sum += n % 10;
	            n /= 10;
	        }
	        System.out.println(sum);*/

	}

}
