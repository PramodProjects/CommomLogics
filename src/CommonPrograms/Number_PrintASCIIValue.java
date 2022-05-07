package CommonPrograms;

public class Number_PrintASCIIValue {

	public static void main(String[] args) {
		// Logic 1 - assiging variable
		char c1 = 'x';
		int i = c1;
		System.out.println(i);
		
		// Type casting
		char c2 = 'x';
		int j = (int) c2;
		System.out.println(j);
		

		// Ascii Value Of All Chracters
		for (int k = 0; k <= 255; k++) {
			char ch = (char)k;
			System.out.println("ASCII value of - " + ch + " is " + k) ;
			
		}
	}

}
