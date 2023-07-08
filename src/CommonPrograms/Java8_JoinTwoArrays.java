package CommonPrograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Java8_JoinTwoArrays {

	public static void main(String[] args) {
		String[] s1 = { "aaa", "bbb" };
		String[] s2 = { "ccc", "ddd" };

		Stream<String> ss1 = Arrays.stream(s1);
		Stream<String> ss2 = Arrays.stream(s2);
		String[] str = Stream.concat(ss1, ss2).toArray(size -> new String[size]);
		System.out.println(Arrays.toString(str));

	}

}
