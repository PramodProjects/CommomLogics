package CommonPrograms;

public class CountOddEven {

	public static void main(String[] args) {
		int number = 246135;
		int ecount = 0;
		int ocount = 0;

		while (number != 0) {

			int rem = number % 10;
			if (rem % 2 == 0) {
				ecount = ecount + rem;

			} else {
				ocount = ocount + rem;

			}
			number = number / 10;

		}

		System.out.println(ecount);
		System.out.println(ocount);

	}

}
