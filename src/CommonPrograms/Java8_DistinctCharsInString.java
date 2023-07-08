package CommonPrograms;

import java.util.Arrays;

public class Java8_DistinctCharsInString {

	public static void main(String[] args) {
		String str = "abcab";
		str.chars().distinct().forEach(a -> System.out.print((char)a));
		
		System.out.println();
		
		// Disting strings
		String strr = "This is Apple, Apple is a good organization";
		String strr2 = strr.replaceAll(",", "");
		String[] strArr = strr2.split(" ");
		Arrays.stream(strArr).distinct().forEach(a -> System.out.print(a + " "));
		

	}

}
