package CommonPrograms;

public class String_CountCharactersSequentially {

	public static void main(String[] args) {
		// Ex: String str="abbbccaab";
		// Output: a1b3c2a2b1

		String s = "abbbccaab";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;

				} else {
					break;
				}
			}
			System.out.print(s.charAt(i) + "" + count);
			s = s.substring(count);
			count = 0;
			i--;
		}

	}

}
