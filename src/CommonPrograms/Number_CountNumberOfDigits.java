package CommonPrograms;

public class Number_CountNumberOfDigits {

	public static void main(String[] args) {
		
		
		int number = 123456;
		int count = 0;
		
		while (number != 0) {
			count++;
			number = number / 10;

		}
		System.out.println(count);
		

	}

}
