package CommonPrograms;

public class Number_ConvertBinaryToDecimal {

	public static void main(String[] args) {
		int binary = 110;
		int remainder;
		int decimal = 0;
		int j = 1;
		while (binary != 0) {
			remainder = binary % 10;
			decimal = decimal + remainder * j;
			j = j * 2;
			binary = binary / 10;
		}
		System.out.print(decimal);
	}

}
