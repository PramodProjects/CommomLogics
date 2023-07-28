package CommonPrograms;


/*
 * Given a number N, the task is to check whether the number is an Automorphic number
 *  or not. A number is called an Automorphic number if and only if its 
 *  square ends in the same digits as the number itself.
 *  Input  : N = 76 
Output : Automorphic
Explanation: As 76*76 = 5776
 */
public class Number_Automorphic {

	public static void main(String[] args) {
		int num = 76;
		int sNum = 76 * 76; //5,776
		boolean flag = true;
		while (num != 0) {
			if (num % 10 != sNum % 10) {
				flag = false;
			}
			num = num / 10;
			sNum = sNum / 10;

		}
		if (flag) {
			System.out.println("Automorphic");
		} else {
			System.out.println("Not Automorphic");
		}
		
		
//		// print Automarphic numbers from 1 to 1000
//		for (int i = 1; i < 1000; i++) {
//
//			int num = i;
//			int sNum = i * i;
//			boolean flag = true;
//			while (num != 0) {
//				if (num % 10 != sNum % 10) {
//					flag = false;
//				}
//				num = num / 10;
//				sNum = sNum / 10;
//
//			}
//			if (flag) {
//				System.out.println(i + " is Automorphic");
//			} else {
//				System.out.println(i + " is Not Automorphic");
//			}
//
//		}
//
//		
		

	}

}
