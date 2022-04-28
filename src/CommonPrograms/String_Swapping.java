package CommonPrograms;

public class String_Swapping {

	public static void main(String[] args) {
		String str1 = "xy";
		String str2 = "abc";
		
		str1 = str1+ str2;
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("str1 - " + str1);
		System.out.println("str2 - " + str2);    
		
		
		
//		// using 3 variables
//		String str1 = "abc";
//		String str2 = "xyz";
//		
//		String temp = str1;
//		str1 =str2;
//		str2 = temp;
//		System.out.println(str1);
//		System.out.println(str2);

	}

}
