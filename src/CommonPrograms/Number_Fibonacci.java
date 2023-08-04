package CommonPrograms;

public class Number_Fibonacci {

	// 0 1 1 2 3 5 8 13 21 34 55 89 
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		for (int i = 0; i <= 20; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
		
		
		// OR
//		int a = 0;
//		int b = 1;
//		System.out.println(a);
//		System.out.println(b);
//
//		for (int i = 0; i < 10; i++) {
//
//			int c = a + b;
//			System.out.println(c);
//			a = b;
//			b = c;
//
//		}
	}
}
