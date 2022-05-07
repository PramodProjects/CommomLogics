package CommonPrograms;

import java.util.ArrayList;
import java.util.function.Predicate;

import org.omg.Messaging.SyncScopeHelper;

public class Number_Even {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// Lamda
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			al.add(i);
		}
		al.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
	}

}
