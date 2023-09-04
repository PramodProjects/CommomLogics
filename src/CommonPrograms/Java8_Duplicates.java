package CommonPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8_Duplicates {

	public static void main(String[] args) {

		// Logic 1
		List<String> list1 = Arrays.asList("aaa", "bbb", "ccc", "ddd", "aaa", "bbb", "aaa");
		list1.stream().filter(a -> Collections.frequency(list1, a) > 1).collect(Collectors.toSet())
				.forEach(System.out::println);

		// Logic 2
		List<String> list2 = Arrays.asList("aaa", "bbb", "ccc", "ddd", "aaa", "bbb", "aaa");
		list2.stream().map(a -> a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(a -> a.getValue() > 1)
				.forEach(a -> System.out.println(a.getKey() + "  " + a.getValue()));

		// Logic 3
		List<Integer> list3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new HashSet<Integer>();
		list3.stream().filter(a -> !set.add(a)).forEach(System.out::println);
	}

}
