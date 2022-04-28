package CommonPrograms;

public class CountNumberOfEVENandODDDigits {

	public static void main(String[] args) {
		int number = 12345666;
		int countEven = 0;
		int countOdd = 0;
		while (number != 0) {
			int reminder = number % 10;
			if (reminder % 2 == 0) {
				System.out.println(reminder + " - is even");
				countEven++;
			} else {
				System.out.println(reminder + " - is odd");
				countOdd++;
			}
			number = number / 10;

		}

		System.out.println("Even digits count - " + countEven);
		System.out.println("Odd digits count - " + countOdd);

	}

}
