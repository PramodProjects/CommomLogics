package CommonPrograms;

public class Number_ConvertDecimalToBinary {

	public static void main(String[] args) {
		// Logic 1
		int decimal = 6;
		String str = "";
		while (decimal != 0) {

			int rem = decimal % 2;
			decimal = decimal / 2;

			str = rem + str;
		}
		System.out.println(str);

		// Logic 2

		int num = 4;
		int x = 0;
		int[] intArr = new int[100];
		while (num != 0) {
			intArr[x++] = num % 2;
			num = num / 2;
		}

		for (int i = x - 1; i >= 0; i--) {
			System.out.print(intArr[i]);
		}

	}

}
