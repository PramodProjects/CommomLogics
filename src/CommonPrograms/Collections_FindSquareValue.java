package CommonPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections_FindSquareValue {

	public static void main(String[] args) {

		/*
		 * list a = [1,2,3,4]
		 *  list b = [2,4,6,9] 
		 *  if square of “a” is present in list
		 * “b”, then add that value in “map” like below map c = {2:4, 3:9}
		 * 
		 */
		List<Integer> a = Arrays.asList(1, 2, 3, 4);
		List<Integer> b = Arrays.asList(2, 4, 6, 9);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {

				if ((a.get(i) * a.get(i)) == b.get(j)) {
					map.put(a.get(i), b.get(j));
				}
			}
		}
		System.out.println(map);

	}

}
