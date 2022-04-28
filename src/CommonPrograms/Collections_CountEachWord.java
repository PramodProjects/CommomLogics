package CommonPrograms;

import java.util.HashMap;

public class Collections_CountEachWord {

	public static void main(String[] args) {
		String s = "aa aa bb cc aa bb cc";
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

	}

}
