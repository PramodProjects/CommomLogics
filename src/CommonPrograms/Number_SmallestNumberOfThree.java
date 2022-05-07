package CommonPrograms;

public class Number_SmallestNumberOfThree {

	public static void main(String[] args) {
		int a = 1;
		int b = 11;
		int c = 3;
		System.out.println(c < (a < b ? a : b) ? c : (a < b ? a : b));

		// Logic 2
		if (a < b && a < c) {
			System.out.println(a);
		} else if (b < c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}

}
