package CommonPrograms;

public class String_RemoveIntegers {

	public static void main(String[] args) {

		String s = "abcd123xyz456ADD@#$";
		
		// Logic 1
		 System.out.println(s.replaceAll("[0-9]", ""));
		 System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));

		// Logic 2
		char[] c = s.toCharArray();
		String result = "";
		for (char d : c) {
			if (!Character.isDigit(d))
				result = result + d;
		}
		System.out.println(result);
		
		

	}

}
