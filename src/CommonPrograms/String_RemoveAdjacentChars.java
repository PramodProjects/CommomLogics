package CommonPrograms;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_RemoveAdjacentChars {

	public static void main(String[] args) {
		
		// Logic 1
		String input = "caaabbcdc";
		String regex = "(.)(\\1)+";
		
	    Matcher m = Pattern.compile(regex).matcher(input);	    
	    while(m.find()) {
	    	input = input.replaceAll(regex, "");
	    	m = Pattern.compile(regex).matcher(input);
	    }
		
	    System.out.println(input);
	    
	    
	    // logic 2
		String s = "&ccaaabbcdd";
		StringBuilder builder = new StringBuilder();
		char lastchar = '\0';
		for (int i = 0; i < s.length(); i++) {
			String str = builder.toString();
			if (!str.equals("") && (str.charAt(str.length() - 1) == s.charAt(i))) {
				builder.deleteCharAt(str.length() - 1);
			} else if (s.charAt(i) != lastchar) {
				builder.append(s.charAt(i));
			}
			lastchar = s.charAt(i);
		}
		System.out.println(builder.toString());
		
		
	}

}
