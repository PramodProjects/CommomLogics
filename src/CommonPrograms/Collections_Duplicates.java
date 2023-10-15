package CommonPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Set;

public class Collections_Duplicates {

	public static void main(String[] args) {
		
		// Logic 1
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
		Set<Entry<Integer, Integer>> set = hMap.entrySet();
		Iterator<Entry<Integer, Integer>> i = set.iterator();
		while (i.hasNext()) {
			Map.Entry<Integer, Integer> entryMap = (Map.Entry<Integer, Integer>) i.next();
			if (entryMap.getValue() > 1) {
				System.out.println(entryMap.getKey());
			}
		}
		
		// Logic 2
		Integer[] num1 = { 1, 2, 3, 1, 2 };
		Set<Entry<Integer, Long>> mm=Arrays.asList(num1).stream().map(a -> a)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet();
		Iterator<Entry<Integer, Long>> itr = mm.iterator();
		while(itr.hasNext()) {
			Entry<Integer, Long> entry = itr.next();
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
			}
		}
		
		
		// Logic 3
		Integer[] num2 = { 1, 2, 3, 1, 2 };
		Arrays.stream(num2).map(a -> a)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream().filter(a -> a.getValue() > 1)
		.forEach(a -> System.out.println(a.getKey() + " -  " + a.getValue()));
		
		

	}

}
