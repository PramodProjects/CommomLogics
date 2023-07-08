package CommonPrograms;

import java.util.stream.IntStream;

public class Java8_CharacterCountString {

	public static void main(String[] args) {
		String str = "pramodjanjirala";
		
		long l= str.chars().filter(a -> a=='j').count();

		System.out.println(l);

	}

}
