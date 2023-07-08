package CommonPrograms;

import java.util.function.IntPredicate;

public class Java8_VowelsCount {

	public static void main(String[] args) {
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

	}

}
