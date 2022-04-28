package CommonPrograms;

public class String_RemoveSpaces {

	public static void main(String[] args) {
		String str = "abc efg xyz    sss xcv";
		
		// Logic 1
		System.out.println(str.replaceAll("\\s", ""));
		
		// Logic 2
		System.out.println(str.replaceAll(" ", ""));
	}
}
