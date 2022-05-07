package CommonPrograms;

public class String_Reverse {

	public static void main(String[] args) {
		
		// Logic 1
		String s = "aabbcdef";
		String reverse = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			reverse = c + reverse;

		}
		System.out.println(reverse);
		
		
		
//		// Logic 2
//		// Reverse string using for loop and tochararray()
//		String s = "abcd";
//		String reverse = "";
//		char[] c = s.toCharArray();
//		for (int i = 0; i < c.length; i++) {
//			reverse = c[i] + reverse;
//
//		}
//		System.out.print(reverse);
		
		
		
		
		// Logic 3
//		// Reverse string using reverse for loop and tochararray()
//		String s ="aabbcdef";
//		char[] c= s.toCharArray();;
//		String reverse = "";
//		for (int i = c.length-1; i >=0; i--) {
//			reverse = reverse+c[i];					
//		}
//		System.out.println(reverse);
		
		
		
		// Logic 4		
//		//Reverse string using recursion
//		String reverse = reverseRecursion("abcd");
//		System.out.println(reverse);
//		
		
		

	}
	
	// Reverse string using recursion
			public static String  reverseRecursion(String str) {
				if(str.isEmpty()) {
					return str;
				}
				return (reverseRecursion(str.substring(1)) + str.charAt(0));
				
			}

}
