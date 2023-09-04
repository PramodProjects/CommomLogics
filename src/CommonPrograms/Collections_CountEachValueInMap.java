package CommonPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Set;

public class Collections_CountEachValueInMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(1, "aa");
		hMap.put(2, "aa");
		hMap.put(3, "ab");
		hMap.put(4, "ab");
		hMap.put(5, "bb");
		hMap.put(6, "cc");
		hMap.put(7, "aa");

		// Logic 1 - for count of each value and for duplicates
		Collection<String> collection = hMap.values();

		Object[] strCollection = collection.toArray();

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < strCollection.length; i++) {
			if (!map.containsKey(strCollection[i])) {
				map.put(strCollection[i].toString(), 1);
			} else {
				int n = map.get(strCollection[i]);
				map.put(strCollection[i].toString(), n + 1);
			}
		}

		System.out.println("Count of each value - " + map);

		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
			}
		}

		// for duplicates Logic 2
		Collection coll = hMap.values();
		Object[] obj = coll.toArray();
		for (int i = 0; i < obj.length; i++) {
			int count = 1;
			for (int j = i + 1; j < obj.length; j++) {
				if (obj[i].equals(obj[j])) {
					obj[j] = "";
					count++;
				}
			}
			if (!obj[i].equals("") && count > 1) {
				System.out.println(obj[i] + "  -  " + count);

			}

		}	
		
		
		// Logic 3 Streams
		Map<String, Long> result = hMap.values().stream().map(a -> a)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
		

	}

}
