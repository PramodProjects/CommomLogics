package CommonPrograms;

public class String_Replace {

	public static void main(String[] args) {
		String s = "abcd123xyz456";
		
		// Logic 1
		
//		s = s.replace("123", "");
//		s = s.replace("456", "");
//		System.out.println(s);
		
		// Logic 2
		
	 System.out.println(s.replaceAll("[0-9]", ""));	 // abcdxyz
		
	 String str = "Hello World he He";
     System.out.println( str.replace( 'H','W' ) );   // Wello World he We
     System.out.println( str.replaceFirst("He", "Wa") );   // Wallo World he He
     System.out.println( str.replaceAll("He", "Wa") );		//Wallo World he Wa
     

	}

}
