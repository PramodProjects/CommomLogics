package CommonPrograms;

import java.util.Arrays;

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

	}

}
