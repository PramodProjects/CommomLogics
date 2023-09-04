package CommonPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Collections_Sorting_Ascending {

	public static void main(String[] args) {

	
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Z");
		alist.add("D");
		alist.add("d");
		alist.add("a");
		alist.add("H");
		alist.add("Z");
		alist.add("A");
	
		// Logic 1
		alist.sort(Comparator.naturalOrder());
		System.out.println(alist);

		// Logic 2
		alist.stream().sorted().forEach(a -> System.out.print(a));
		System.out.println();
		
		// Logic 3 - ignore case
		alist.stream().sorted((a, b) -> a.compareToIgnoreCase(b))
		.forEach(x -> System.out.print(x));
		
		// Logic 4  - Collections class
		System.out.println();
		Collections.sort(alist);
		System.out.println(alist);
		
		// Logic 5
		NavigableSet<String> set = new TreeSet<String>();
		set.add("g");
		set.add("d");
		set.add("a");
		set.add("b");
		set.stream().sorted((a,b) -> a.compareToIgnoreCase(b)).forEach(System.out::println);
		
		
		
	}
}
