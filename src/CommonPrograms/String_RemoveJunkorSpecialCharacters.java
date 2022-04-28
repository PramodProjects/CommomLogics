package CommonPrograms;

public class String_RemoveJunkorSpecialCharacters {

	public static void main(String[] args) {

		String s = "%^&&jhfjkdsah 6438764";
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));

	}

}
