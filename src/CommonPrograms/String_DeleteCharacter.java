package CommonPrograms;

public class String_DeleteCharacter {

	public static void main(String[] args) {
		String s = "pramamod";

		// PROGRAM 1
		System.out.println(s.replaceFirst(String.valueOf('a'), ""));
		System.out.println(s.replaceFirst(Character.toString('a'), ""));
		
		// PROGRAM 2
		System.out.println(s.replace(String.valueOf(s.charAt(3)), ""));

		// PROGRAM 3
		System.out.println(s.replace('a', 'm'));
		
		// PROGRAM 4
		System.out.println(s.replaceAll("a", "m"));
		
		// PROGRAM 5
		StringBuffer sf = new StringBuffer(s);
		sf.deleteCharAt(3);
		System.out.println(sf);

	}

}
