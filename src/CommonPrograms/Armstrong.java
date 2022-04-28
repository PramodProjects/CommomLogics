package CommonPrograms;

public class Armstrong {

	public static void main(String[] args) {
		int number = 371;
		int remainder = 0;
		int arm = 0;
		int num = number;
		while (number != 0) {
			remainder = number % 10;
			arm = arm + remainder * remainder * remainder;
			number = number / 10;

		}
		if (arm == num) {
			System.out.println(num + " - is armstrong");
		} else {
			System.out.println(num + " - is not armstrong");
		}

		
		
		
//		// Armstring number from 1 to 1000
//		for (int i = 0; i < 1000; i++) {
//
//			int number = i;
//			int temp = number;
//			int arm = 0;
//			while (number != 0) {
//				int rem = number % 10;
//				arm = arm + (rem * rem * rem);
//				number = number / 10;
//			}
//
//			if (arm == temp)
//				System.out.println(i + " arm");
//			
//		}
	}

}
