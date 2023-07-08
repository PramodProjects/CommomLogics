package CommonPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_FindLengthWithOutUsingLengthMethod {

	public static void main(String[] args) {
		// logic 1

		String str = "pramod";
		char[] c = str.toCharArray();
		int count = 0;
		for (char d : c) {
			count++;
		}
		System.out.println(count);

		// Logic 2
		System.out.println(str.toCharArray().length);

		// Logic 3
		System.out.println(str.lastIndexOf(""));

		// Logic 4
		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		System.out.println(m.end());
		
		// logic 5
		int count1 = (int)str.chars().count();
		System.out.println(count1);
	}

}
