package CommonPrograms;

import java.util.ArrayList;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import org.omg.Messaging.SyncScopeHelper;

public class Number_Even {

	public static void main(String[] args) {

		// Logic 1
		int number = 7;
		if(number%2 == 0)
			System.out.println("even number");
		else
			System.out.println("Odd number");
		
		// Logic 2
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// Lamda
		Predicate<Integer> pred = a -> a%2 ==0;
		System.out.println(pred.test(2));		
		
		// Lamda
		IntPredicate iPred = a -> a%2 ==0;
		System.out.println(iPred.test(2));		
		
		// Lamda
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			al.add(i);
		}
		al.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
		
	
	}

}
