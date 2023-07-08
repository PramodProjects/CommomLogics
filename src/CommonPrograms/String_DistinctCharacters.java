package CommonPrograms;

public class String_DistinctCharacters {

	public static void main(String[] args) {
		
		// Logic 1
		String str = "abcabb";
		String distinctStr = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			distinctStr = distinctStr + c;
			str = str.replaceAll(Character.toString(str.charAt(i)), "");
			i--;
		}

		System.out.println(distinctStr);
		
		// Logic 2
		String str1 = "abcabb";
		str1.chars().distinct().forEach(a -> System.out.print((char)a));

	}

}
