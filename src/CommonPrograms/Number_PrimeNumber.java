package CommonPrograms;

public class Number_PrimeNumber {

	public static void main(String[] args) {
		
		// Print prime or not
		int number = 5;
		int count = 0;
		for (int i = 1; i <=number; i++) {
			if(number%i==0) {
				count++;
			}			
		}
		
		if(count==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
		
		
//		// Print prime or not until 100 numbers
//		int count =0;
//		for (int i=1; i<=100;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				if (i%j==0)
//				{
//					count++;
//				}
//			}
//			if (count == 2)
//			{
//				System.out.println("Prime Number - " + i);				
//			}
//			count =0;
//		}
	}
}
