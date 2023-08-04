package CommonPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.TreeSet;

public class Collections_Reverse {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");

		
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < list.size(); i++) {
			String str = (String) list.get(i);
			System.out.println(str);
			stack.push(str);
		}

		System.out.println("======= Reverse for loop using List");
		for (int i = list.size() - 1; i >= 0; i--) {
			String str = (String) list.get(i);
			System.out.println(str);
			
		}

		System.out.println("======= Reverse for loop in Stack ====");

		for (int i = stack.size() - 1; i >= 0; i--) {
			String str = (String) stack.get(i);
			System.out.println(str);
		}

		System.out.println("======= Using Iterator ====");

		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			String str = (String) stack.pop();
			System.out.println(str);
		}
		
		System.out.println("======= Using Linked List & descendingIterator ====");
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.addAll(list);
		Iterator<String> disIterator =  linkedList.descendingIterator();
		while (disIterator.hasNext()) {
			String str = disIterator.next();
			System.out.println(str);			
		}
		
		// Using NavigableSet
		NavigableSet set = new TreeSet();
		set.add("g");
		set.add("d");
		set.add("a");
		set.add("b");
		System.out.println(set);
		
		NavigableSet set1= set.descendingSet();
		System.out.println(set1);
		
		
		
	}
}
