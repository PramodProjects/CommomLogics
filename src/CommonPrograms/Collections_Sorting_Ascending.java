package CommonPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class Collections_Sorting_Ascending {

	public static void main(String[] args) {
				
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Z");
		alist.add("D");
		alist.add("d");
		alist.add("a");
		alist.add("H");
		alist.add("Z");
		alist.add("A");
		//alist.add(1);
		TreeSet<String> ts=new TreeSet<String>(alist);
		//ts.addAll(alist);
		System.out.println(ts);	
	}
}
