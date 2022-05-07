package CommonPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collections_FindDuplicates {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 1, 2 };
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {

			if (!hMap.containsKey(num[i])) {
				hMap.put(num[i], 1);

			} else {
				int n = hMap.get(num[i]);
				hMap.put(num[i], n + 1);

			}
		}
		Set set = hMap.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry entryMap = (Map.Entry) i.next();
			if ((int) entryMap.getValue() > 1) {
				System.out.println(entryMap.getKey());
			}
		}

	}

}
