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

		char[] cArray = str1.toCharArray();

		for (int i = 0; i < cArray.length; i++) {
			for (int j = i + 1; j < cArray.length; j++) {
				if (cArray[i] == cArray[j]) {
					cArray[j] = '\0';
				}
			}

			if (cArray[i] != '\0') {
				System.out.print(cArray[i]);
			}
		}

		System.out.println();
		
		// Logic 3
		String str2 = "abcabb";
		str2.chars().distinct().forEach(a -> System.out.print((char) a));

	}

}
