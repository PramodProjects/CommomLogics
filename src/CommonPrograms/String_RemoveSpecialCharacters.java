package CommonPrograms;

public class String_RemoveSpecialCharacters {

	public static void main(String[] args) {

		String s = "%^&&jhfjkdsah 6438764";
		
		// Logic 1
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));

		//Logic 2
		System.out.println(s.replaceAll("\\W", ""));

	}

}
