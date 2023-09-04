package CommonPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_ConvertToUpperCase {

	public static void main(String[] args) {

		String[] names = { "aa", "bb", "bb", "nnn" };
		List<String> nameLst = Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(nameLst);

	}

}
