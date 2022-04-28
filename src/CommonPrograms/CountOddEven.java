package CommonPrograms;

public class CountOddEven {

	public static void main(String[] args) {
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
