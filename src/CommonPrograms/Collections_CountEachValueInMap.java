package CommonPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
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
	    
	    
	    Collection<String> collection = hMap.values();
	    
	    Object[] strCollection = collection.toArray();
	    
	    Map<String, Integer> map = new HashMap<String, Integer>();
	    
	    for (int i = 0; i < strCollection.length; i++) {
			if(!map.containsKey(strCollection[i])) {
				map.put(strCollection[i].toString(), 1);
			}
			else
			{
				int n = (int)map.get(strCollection[i]);
				map.put(strCollection[i].toString(), n+1);
			}
		}
	    
	    System.out.println(map);
	    
	    // for duplicates
	    Set<Entry<String, Integer>> set = map.entrySet();
	    Iterator<Entry<String, Integer>> it =  set.iterator();
	    while(it.hasNext()) {
	    	Entry<String, Integer> entry =  it.next();
	    	if(entry.getValue()>1) {
	    		System.out.println(entry.getKey() + " - " + entry.getValue());
	    	}
	    }
	    

	}

}
