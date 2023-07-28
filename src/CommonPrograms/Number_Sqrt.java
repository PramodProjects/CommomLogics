
package CommonPrograms;

public class Number_Sqrt {

	public static void main(String[] args) {
		int num = 129;
		// int squ = 25*25;
		for (int i = 1; i < num; i++) {
			int sq = i * i;
			if (sq == num) {
				System.out.println("Squareroot of " + num + " is " + i);
				break;
			}
			if (sq > num) {
				System.out.println(decimalSqrt(num, i - 1, i));
				break;
			}
		}
	}

	private static double decimalSqrt(double number, double i, double j) {
		// calculates the middle of i and j
		double midvalue = (i + j) / 2;
		// finds the square of the midvalue
		double square = midvalue * midvalue;
		// compares the midvalue with square up to n decimal places
		if (square == number || Math.abs(square - number) < 0.0000001)
			return midvalue;
		// if the square root belongs to second half
		else if (square > number)
			return decimalSqrt(number, i, midvalue);
		// if the square root belongs to first half
		else
			return decimalSqrt(number, midvalue, j);
	}
}
