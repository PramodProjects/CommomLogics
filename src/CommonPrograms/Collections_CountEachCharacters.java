package CommonPrograms;

import java.util.HashMap;

public class Collections_CountEachCharacters {

	public static void main(String[] args) {
		String str = "abaabccad";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				int x = map.get(c);
				map.put(c, x + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);

	}

}
