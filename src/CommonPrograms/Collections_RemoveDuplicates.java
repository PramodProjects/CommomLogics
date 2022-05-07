package CommonPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections_RemoveDuplicates {

	public static void main(String[] args) {
		String[] arrayStrings = { "A", "U", "B", "A", "B" };
		List<String> listString = Arrays.asList(arrayStrings);
		Set<String> setString = new HashSet<String>(listString);
		for (String set : setString) {
			System.out.print(set + " ");
		}

	}

}
