package CommonPrograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class Array_ConvertObjectArrayToStringArray {

	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(1, "aa");
		hMap.put(2, "aa");
		hMap.put(3, "ab");
		hMap.put(4, "ab");
		hMap.put(5, "bb");
		hMap.put(6, "cc");
		hMap.put(7, "aa");

		// Logic 1
		Collection collection = hMap.values();
		Object[] obj = collection.toArray();
		String[] str = Arrays.copyOf(obj, obj.length, String[].class);
		System.out.println(Arrays.toString(str));

		// Logic 2
		Collection<String> collection1 = hMap.values();
		String[] str1 =  collection1.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(str1));

		// Logic 3
		Collection collection3 = hMap.values();
		Object[] obj3 = collection3.toArray();
		String[] str3 = Arrays.stream(obj3).toArray(String[]::new);
		System.out.println(Arrays.toString(str3));
		
		// Logic 4
		Collection collection2 = hMap.values();
		Object[] obj2 = collection2.toArray();
		String[] str2 = Arrays.asList(obj2).toArray(new String[obj2.length]);
		System.out.println(Arrays.toString(str2));
		
		

	}

}
