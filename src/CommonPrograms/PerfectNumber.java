package CommonPrograms;

public class PerfectNumber {

	// In number theory, a perfect number is a positive integer that is equal to the
	// sum of its positive divisors, excluding the number itself. For instance, 6
	// has divisors 1, 2 and 3 (excluding itself), and 1 + 2 + 3 = 6, so 6 is a
	// perfect number.

	public static void main(String[] args) {

		int perfectNumber = 28;
		int count = 0;
		for (int i = 1; i <= perfectNumber / 2; i++) {
			if (perfectNumber % i == 0) {
				count = count + i;
			}
		}
		if (count == perfectNumber) {
			System.out.println(perfectNumber + " is Perfect number");
		} else {
			System.out.println(perfectNumber + " is not Perfect number");
		}

//		int count =0;
//		for (int i=1;i<=10000;i++){
//			for(int j=1;j<=i/2;j++){
//				if(i%j==0){
//					count = count+j;
//				}
//			}
//			if(count==i){
//				System.out.println(i + " - is Perfect number");
//			}
//			count=0;
//		}
	}

}
