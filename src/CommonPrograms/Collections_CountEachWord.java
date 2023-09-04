package CommonPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collections_CountEachWord {

	public static void main(String[] args) {
		String s = "aa aa bb cc aa bb cc";
		
		// Logic 1
		String[] str = s.split(" ");
		int count = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s1 : str) {
			if (map.containsKey(s1)) {
				int x = map.get(s1);
				map.put(s1, x + 1);
			} else {
				map.put(s1, 1);
			}

		}
		System.out.println(map);
		
		// Logic 2
		Map<Object, Long> result = Arrays.stream(s.split(" ")).map(a -> a)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);

	}

}
