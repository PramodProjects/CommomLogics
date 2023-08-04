package CommonPrograms;

public class Number_CountNumberOfEVENandODDDigits {

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
		
		
		
		// Count until 100
		int oCount = 0;
		int eCount = 0;
		for (int i = 1; i <= 101; i++) {
			
			if(i%2==0)
				eCount++;
			else
				oCount++;
		}
		System.out.println("Even numbers count " + eCount);
		System.out.println("Odd numbers count " + oCount);
		

	}

}
