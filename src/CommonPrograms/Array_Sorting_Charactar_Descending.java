package CommonPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class Array_Sorting_Charactar_Descending {

	public static void main(String[] args) {

		// Logic 1
		String wordSt = "hatgfaa";
		char[] word = wordSt.toCharArray();
		// String sort = "";
		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i] < word[j]) {
					char temp = word[i];
					word[i] = word[j];
					word[j] = temp;
				}
			}

		}
		System.out.print(word);

		System.out.println();

		// Logic 2
		
		Character[] word1 = { 'f', 'l', 'W', 'a', 'T', 'A' };
		Arrays.sort(word1, (a, b) -> -a.compareTo(b));
		System.out.println(Arrays.toString(word1));
		
		// Logic 3
		Character[] word2 = { 'f', 'l', 'W', 'a', 'T', 'A' };
		Arrays.sort(word2, Comparator.reverseOrder());
		System.out.println(Arrays.toString(word2));
		
		// Logic 4
		Character[] word3 = { 'f', 'l', 'W', 'a', 'T', 'A' };
		Arrays.sort(word3, (a, b) -> -String.valueOf(a).compareToIgnoreCase(String.valueOf(b)));
		System.out.println(Arrays.toString(word3));

	}

}
