package CommonPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8_FilterNamesStartingWithChar {

	public static void main(String[] args) {
		String[] array = new String[]{"John", "Jenny", "Martha", "Adam"};

		// Logic 1
		Stream<String> stream = Stream.of(array);
		//Printing only names that start with 'J'
		stream.filter(string -> string.startsWith("J"))
		        .forEach(string -> System.out.println(string));
		
		
		// Logic 2
		List<String> list = Arrays.stream(array)
				.filter(a -> a.startsWith("J")).collect(Collectors.toList());
		System.out.println(list);
		

	}

}
