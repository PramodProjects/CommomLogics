package CommonPrograms;

public class String_DistinctCharacters {

	public static void main(String[] args) {
		String str = "abcabb";

		String distinctStr = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			distinctStr = distinctStr + c;
			str = str.replaceAll(Character.toString(str.charAt(i)), "");
			i--;
		}

		System.out.println(distinctStr);

	}

}
