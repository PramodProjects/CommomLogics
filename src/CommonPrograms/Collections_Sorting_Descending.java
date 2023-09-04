package CommonPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Collections_Sorting_Descending {

	public static void main(String[] args) {
		//TreeSet ts = new TreeSet<>(new MyDescending());
		ArrayList<String> al = new ArrayList<String>();
		al.add("zgh");
		al.add("zgh");
		al.add("ajh");
		al.add("gbh");
		al.add("Zacf");
		al.add("Afghh");
		al.add("HLggg");
		al.add("Jsjk");
		al.add("Kzhgh");
		al.add("m");
		
		// Logic 1
		TreeSet treeSet = new TreeSet<>(new MyDescending());
		treeSet.addAll(al);		
		System.out.println(treeSet);
		
		
		// Logic 2
		al.sort(Comparator.reverseOrder());
		System.out.println(al);
		
		// Logic 3
		al.stream().sorted((a, b) -> -a.compareToIgnoreCase(b))
		.forEach(x -> System.out.println(x + " "));
		
		
		// Logic 4 - using Collections class
		Collections.sort(al, Comparator.reverseOrder());
		System.out.println(al);
	}

}

class MyDescending implements Comparator {

	public int compare(Object obj1, Object obj2) {
		String str1 = (String) obj1;
		String str2 = (String) obj2;
			
		return -str1.compareTo(str2);
		//OR
		//return str2.compareTo(str1);
		
		 // ===== For compare ignore case ==== 
		//return -str1.compareToIgnoreCase(str2);
		
		// ==== For return insertion order ====
		// return +1
		
		// ===== For reverse of insertion order =====
		// return -1
		
		// ==== For insert only first element ======
		// return 0
	}
}
