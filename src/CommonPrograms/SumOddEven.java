package CommonPrograms;

import java.util.ArrayList;

public class SumOddEven {

	public static void main(String[] args) {
		
		// logic 1
		int oddTotal = 0;
		int evenTotal = 0;
		for (int i = 0; i <= 100; i++) {
			if(i%2==0) {
				evenTotal = evenTotal+i;
			}
			
			else {
				oddTotal = oddTotal+i;
			}
			
		}
		System.out.println("Even Total " + evenTotal);
		System.out.println("Odd Total " + oddTotal);
		
		// Using Streams Lambda Expression
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <=100; i++) {
			al.add(i);
		}		
		int evenCount = al.stream().filter(n->n%2 ==0).mapToInt(a->a).sum();
		int oddCount = al.stream().filter(n->n%2 ==1).mapToInt(a->a).sum();
		System.out.println("Even Total " + evenCount);
		System.out.println("Odd Total " + oddCount);
			
		
		
		// sum of odd even in number
		int number = 4445;
		int oSum = 0;
		int eSum = 0;

		while (number != 0) {
			int rem = number % 10;

			if (rem % 2 == 0)
				eSum = eSum + rem;

			else
				oSum = oSum + rem;
			number = number / 10;
		}

		System.out.println("Sum of even numbers " + eSum);
		System.out.println("Sum of odd numbers " + oSum);

	}

}
