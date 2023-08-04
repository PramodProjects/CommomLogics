package CommonPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_Anagram {

	public static void main(String[] args) {
		
		// Logic 1
		String firstString = "Army";
		String secondString = "mary";
		char[] fString = firstString.toLowerCase().toCharArray();
		char[] sString = secondString.toLowerCase().toCharArray();
		Arrays.sort(fString);
		Arrays.sort(sString);

		if (Arrays.equals(fString, sString))
			System.out.println("two strings are anagrams");
		else
			System.out.println("two strings are not anagrams");
		
		
		
		// Logic 2
		String s1 = "keep";
		String s2 = "Peeg";
		
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		
		boolean flag = true;
		if(c1.length == c2.length) {
			Arrays.sort(c1);
			Arrays.sort(c2);
			flag = Arrays.equals(c1, c2);			
		}
		else {
			flag = false;
		}
		if(flag) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
		
	}

}
