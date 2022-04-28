package CommonPrograms;

import java.util.Iterator;

public class StarPatterns {

	public static void main(String[] args) {
		
		/* Print below format
		*
		**
		***
		****
		*****
		******
		*/
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/* Print below format
		******
		*****
		****
		***
		**
		*
		*/
		
		for (int i = 0; i <=5; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print("*");							
			}
			System.out.println();
			
		}
		
		
		/* Print below format
		 
	       *
	      **
	     ***
	    ****
	   *****
	  ******
	  
		*/
		
		for (int i = 0; i <=5; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print(" ");
				
			}
			
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
