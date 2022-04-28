package CommonPrograms;

public class String_SubString {

	public static void main(String[] args) {
		// ex 1
		//get sub string between specified indexes
		String str = "pramodjanjiralakumar";
		System.out.println(str.substring(3, 5));

		// ex 2
		// get sub string from specified index to last character of the string 
		System.out.println(str.substring(3));
		
		//Ex 3
		// get sub string between first and last same characters
		System.out.println(str.substring(str.indexOf('a'), str.lastIndexOf('a')));

	}

}
