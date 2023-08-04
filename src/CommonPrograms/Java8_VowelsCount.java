package CommonPrograms;

import java.util.function.IntPredicate;

public class Java8_VowelsCount {

	public static void main(String[] args) {
		
		// Logic 1
		IntPredicate vowels = new IntPredicate() {
			
			@Override
			public boolean test(int t) {				
				return t=='a' || t=='e' || t=='i' || t=='o' || t=='u'||
						t=='A' || t=='E' || t=='I' || t=='O' || t=='U';
			}
		};
		
		String str = "pramod";
		long l = str.chars().filter(vowels).count();
		System.out.println(l);
		
		
		// Logic 2
		String str1 = "pramod";
		long l1 = str1.chars().filter(x -> x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u').count();
		System.out.println(l1);
		

	}

}
