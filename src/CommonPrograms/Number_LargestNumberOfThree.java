package CommonPrograms;

public class Number_LargestNumberOfThree {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 500;
		
		// logic 1
		if (a>b && a>c)
			System.out.println("a is bigger");
		else if(b>c)
			System.out.println("b is bigger");
		else
			System.out.println("c is bigger");
		
		
		// logic 2
		int largest1 = a>b?a:b;
		int largest2 = c>largest1?c:largest1;
		System.out.println("largest number is - " + largest2);
		
		

	}

}
