package CommonPrograms;

public class String_RemoveIntegers {

	public static void main(String[] args) {

		String s = "abcd123xyz456ADD@#$";
		
		// Logic 1
		 System.out.println(s.replaceAll("[0-9]", ""));
		 System.out.println(s.replaceAll("[^a-zA-Z0-9]", "")); // to remove special chars
		 System.out.println(s.replaceAll("\\W", "")); // to remove special chars
		 

		// Logic 2
		char[] c = s.toCharArray();
		String result = "";
		for (char d : c) {
			if (!Character.isDigit(d))
				result = result + d;
		}
		System.out.println(result);
		
		
		// Logic 3
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				s = s.replace(String.valueOf(s.charAt(i)), "");
				i--;
			}
		}
		System.out.println(s);

	}

}
