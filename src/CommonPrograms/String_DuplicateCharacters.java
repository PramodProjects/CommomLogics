package CommonPrograms;

public class String_DuplicateCharacters {

	public static void main(String[] args) {
		String s = "habcabccgghy";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if(count>1) {
			System.out.println(s.charAt(i) + " " + count);
			}
			s = s.replaceAll(Character.toString(s.charAt(i)), "");
			count=0;
			i--;
		}	
	}
}
