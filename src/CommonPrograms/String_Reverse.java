package CommonPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
		
		// Logic 5
		String s1 = Stream.of(s).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining());
		System.out.println(s1);
		
		// Logic 6
		String s2 = Arrays.asList(s).stream()
			    .map(a -> new StringBuilder(a).reverse().toString())
			    .collect(Collectors.toList()).get(0);
		System.out.println(s2);

					
		// Logic 7	
		//Reverse string using recursion
		String rev = reverseRecursion("abcd");
		System.out.println(rev);
		
		
		

	}
	
	// Reverse string using recursion
			public static String  reverseRecursion(String str) {
				if(str.isEmpty()) {
					return str;
				}
				return (reverseRecursion(str.substring(1)) + str.charAt(0));
				
			}

}
