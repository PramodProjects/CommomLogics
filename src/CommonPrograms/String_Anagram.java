package CommonPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_Anagram {

	public static void main(String[] args) {
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
	}

}
