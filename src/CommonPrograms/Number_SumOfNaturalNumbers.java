package CommonPrograms;

public class Number_SumOfNaturalNumbers {

	public static void main(String[] args) {
		int num = 100, i = 1, sum1 = 0, sum2 = 0;

		// Logic 1
		while (i <= num) {
			sum1 = sum1 + i;
			i++;
		}
		System.out.println("Sum of First 100 Natural Numbers is = " + sum1);

		// Logic 2
		for (i = 1; i <= num; i++) {
			sum2 = sum2 + i;
		}

		System.out.println("Sum of First 100 Natural Numbers is = " + sum2);
	}
}
