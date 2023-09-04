package CommonPrograms;

public class Number_NthPrimeNumber {

	public static void main(String[] args) {

		int nthPrime = 25;
		int cnt = 0;
		for (int i = 1; i < 1000; i++) {

			//int num = i;
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				cnt++;
			}
			if (cnt == 25) {
				System.out.println("nth Prime number of " + nthPrime + " is " + i);
				break;
			}

		}
	}

}
