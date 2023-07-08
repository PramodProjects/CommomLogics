package CommonPrograms;

public class EscapeSpecialCharacters {

	public static void main(String[] args) {

		//		 /"Hello"/
		System.out.println("/\"Hello\"/");

		//	    /'Hello'/
		System.out.println("/'Hello'/");
		
		//	    	"Hello"
		System.out.println("\"Hello\"");
		
		//    	'I love "java" and "programming" and "Movies"'
		System.out.println("'I love \"java\" and \"programming\" and \"movies\"'");
		
		//  call function
		System.out.println(getXpath("pramod"));

	}
	
	
	public static String getXpath(String name) {
		String xpath = "//input[@id = '"+name+"']";
		return xpath;
	}

}
