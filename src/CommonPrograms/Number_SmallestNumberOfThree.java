package CommonPrograms;

public class Number_SmallestNumberOfThree {

	public static void main(String[] args) {
		
		//Logic 1
		int a = 1;
		int b = 6;
		int c = 3;	
		
		System.out.println(c < (a < b ? a : b) ? c : (a < b ? a : b));
		
		// Logic 2
		int smallest1 = a < b ? a : b;
		int smallest2 = c < smallest1 ? c : smallest1;
		System.out.println(smallest2);
		

		// Logic 2
		if (a < b && a < c) {
			System.out.println(a);
		} else if (b < c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}

}
