package CommonPrograms;

public class String_a2b3c4_aabbbcccc {

	public static void main(String[] args) {
		String s1 = "a1b2c3d4e1";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i))) {
				int k = Character.getNumericValue(s1.charAt(i));
				for (int j = 0; j < k; j++) {
					s2 = s2 + s1.charAt(i - 1);
				}
			}
		}
		System.out.println(s2);

	}

}
