package CommonPrograms;

public class Number_Swapping {

	public static void main(String[] args) {
		
		// Logic 1 - with 3 variables
	/*	int a = 10;
		int b = 20;
		int temp;
		System.out.println("Before Swap");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
		temp = a;
		a = b;
		b= temp;
		
		System.out.println("After Swap");
		System.out.println("a - " + a);
		System.out.println("b - " + b);*/
		
		
		//Logic 2 - with 2 variables
		int a = 22;
		int b = 11;
		
		System.out.println("Before Swap");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
		
		//Logic 3
		
	/*	int a=10,b=20;
		
		System.out.println("Before Swap");
		System.out.println("a - " + a);
		System.out.println("b - " + b);
		
		 a=(a+b)-(b=a);
		 
		 System.out.println("After Swap");
			System.out.println("a - " + a);
			System.out.println("b - " + b);*/
		
		
		//Logic 4
		/*	int a = 10;
			int b = 20;
			
			System.out.println("Before Swap");
			System.out.println("a - " + a);
			System.out.println("b - " + b);
			
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println("After Swap");
		System.out.println("a - " + a);
		System.out.println("b - " + b);*/
		
		
				

	}

}
