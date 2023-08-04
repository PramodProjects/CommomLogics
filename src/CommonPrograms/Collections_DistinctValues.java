package CommonPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collections_DistinctValues {

	public static void main(String[] args) {
		
		
		// Logic 1
		String[] arrayStrings = { "A", "U", "B", "A", "B" };
		List<String> listString = Arrays.asList(arrayStrings);
		Set<String> setString = new HashSet<String>(listString);
		for (String set : setString) {
			System.out.print(set + " ");
		}
		
		
		// Logic 2
		List<String> list = listString.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
		
		
		// Logic 3
		listString.stream().distinct().forEach(a -> System.out.println(a));

	}

}
