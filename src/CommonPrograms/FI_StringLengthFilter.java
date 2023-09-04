package CommonPrograms;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FI_StringLengthFilter {

	public static void main(String[] args) {
		String[] s = { "pra", "fsdafa", "fdsafdsafds" };

		// Logic 1
		Predicate<String> p = x -> x.length() > 5;
		for (String s1 : s) {
			if (p.test(s1)) {
				System.out.println(s1);
			}
		}

		// Logic 2 using streams
		Stream.of(s).filter(x -> x.length() > 5).forEach(a -> System.out.println(a));

		// Logic 3 using streams
		Arrays.stream(s).filter(x -> x.length() > 5).forEach(System.out::println);

	}

}
