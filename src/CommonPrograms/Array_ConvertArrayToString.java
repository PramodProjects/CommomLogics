package CommonPrograms;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Array_ConvertArrayToString {

	public static void main(String[] args) {
		char c[] = {'H','e','l','l','o'};
        
		//  Logic 1
		String s = new String(c);
		System.out.println(s);
		
		// Logic 2
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			sb.append(c[i]);
		}
		System.out.println(sb);
		
		// Logic 3
		String s1 = String.valueOf(c);
		System.out.println(s1);
		
		// Logic 4 Streams
		String s2 = Stream.of(c).map(arr -> new String(arr))
				.collect(Collectors.joining());
		System.out.println(s2);
		

	}

}
