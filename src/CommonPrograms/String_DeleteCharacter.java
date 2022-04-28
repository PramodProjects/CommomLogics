package CommonPrograms;

public class String_DeleteCharacter {

	public static void main(String[] args) {
		String s = "pramamod";
		
		// PROGRAM 1
		System.out.println( s.replaceFirst(String.valueOf('a'), ""));
		
		// PROGRAM 2
		System.out.println(s.replace(String.valueOf(s.charAt(3)), ""));

	}

}
