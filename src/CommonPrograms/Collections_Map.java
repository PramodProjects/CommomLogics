package CommonPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collections_Map {

	public static void main(String[] args) {
		
		// Add key and value
		HashMap map =new HashMap();
		map.put(101, "test1");
		map.put(102, "test2");
		//map.put(101, "test3");
		map.put(107, "test7");
		map.put(108, "test8");
		map.put(109, "test9");
		map.put(110, "test10");
		System.out.println(map.put(101, "test3"));
		
		System.out.println(map);
		
		Map map2 = new HashMap<>();
		map2.put(105, "test5");
		map2.put(106, "test6");
		System.out.println(map2);
		
		// Add group of map to another map
		map.putAll(map2);
		System.out.println(map);
		
		// get value
		Object s = map.get(101);
		System.out.println(s);
		
		//remove entry
		map.remove(101);
		System.out.println(map);
		
		
		// verify key available or not
		System.out.println(map.containsKey(101));
		
		// verify value is available or not
		System.out.println(map.containsValue("test2"));
		
//		// clear the map
//		map.clear();
//		System.out.println(map);
//		
		
		// get all keys
		Set set = map.keySet();
		System.out.println(set);
		
		// get all values
		Collection c = map.values();
		System.out.println(c);
		
		// get all entries
		Set set2 = map.entrySet();
		System.out.println(set2);
		
		Iterator itr =set2.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			if(entry.getValue().equals("test10")){
				entry.setValue("test11");
			}
		}
		
		System.out.println(set2);
		

	}

}
