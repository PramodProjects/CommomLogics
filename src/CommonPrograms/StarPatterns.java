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
		
		
		
		System.out.println();
		System.out.println();
		/* Print below format
		******
		*****
		****
		***
		**
		*
		*/
		
		// Logic 1
		for (int i = 0; i <=5; i++) {
			for (int j = i; j <=5; j++) {
				System.out.print("*");							
			}
			System.out.println();
			
		}
		
		// Logic 2
		for (int i = 5; i >=0; i--) {
			for (int j = 0; j <= i; j++) {
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
			for (int j = i; j <=5; j++) {
				System.out.print(" ");
				
			}
			
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		/*## Printing the pattern ##
		*****
		 ****
		  ***
		   **
		    *
		    */
		
		
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < 6; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		/*## Printing the pattern ##
	    *
	   ***
	  *****
	 *******
	*********
		*/
		
		
		for (int i = 1; i < 6; i++) {
			for (int j = i; j < 6; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		/*## Printing the pattern ##
		*********
		 *******
		  *****
		   ***
		    *
		*/
		
		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = (i * 2) - 1; k <= 7; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		/*## Printing the pattern ##
	    *
	   ***
	  *****
	 *******
	*********
	 *******
	  *****
	   ***
	    *
		*/

		for (int i = 1; i < 6; i++) {
			for (int j = i; j < 6; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}


		for (int i = 1; i < 7; i++) {

			for (int j = 1; j <= i+1; j++) {
				System.out.print(" ");
			}
			for (int k = (i * 2) - 1; k <= 7; k++) {
				System.out.print("*");
			}

			System.out.println();
		}	
		
		
		System.out.println();
		System.out.println();
		/*## Printing the pattern ##
		*****
		 *****
		  *****
		   *****
		    *****
		*/
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 6; j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
		
		
		

		System.out.println();
		System.out.println();
		/*## Printing the pattern ##
		
		  *
	     * *
	    * * *
	   * * * *
	  * * * * *
		*/
		
		
		for (int i = 0; i < 6; i++) {
			for (int j = i; j < 6; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}
		
			System.out.println();
		}
		
		
		
		
		
		System.out.println();
		System.out.println();
		/*## Printing the pattern ##
		
	      *
	     * *
	    * * *
	   * * * *
	  * * * * *
	 * * * * * *
	  * * * * *
	   * * * *
	    * * *
	     * *
	      *
		*/
		
		for (int i = 0; i < 6; i++) {
			for (int j = i; j < 6; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}

			System.out.println();
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < 6; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		
		

		System.out.println();
		System.out.println();
		/*## Printing the pattern ##
		
		*
		**
		* *
		*  *
		*   *
		******

		*/
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == 6)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		/*## Printing the pattern ##
		
		
	    *
	   **
	  * *
	 *  *
	*****
	
		*/
		
		for (int i = 1; i <= 7; i++) {
			for (int j = i; j <= 7; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == 7)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		System.out.println();
		/*## Printing the pattern ##
		
		*****
		*  * 
		* *  
		**   
		*
		
		*/
		
		for (int i = 1; i <= 7; i++) {

			for (int j = i; j <= 7; j++) {
				if (j == 7 || j == i || i == 1)
					System.out.print("*");
				else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		/*## Printing the pattern ##
		*****
		 *  *
		  * *
		   **
		    *
		    
		 */
		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= 7; j++) {
				if (j == 7 || j == i || i == 1)
					System.out.print("*");
				else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}

		    
		    
		System.out.println();
		System.out.println();
		//## Printing the pattern ##
		/*
		   *
	      * *
	     *   *
	    *     *
	   *       *
	  *         *
	 *************
		*/
		
		for (int i = 1; i <= 7; i++) {

			for (int j = i; j <= 7; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++) {
				if (j == 1 || j == (i * 2) - 1 || i == 7)
					System.out.print("*");
				else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}

		
		System.out.println();
		System.out.println();
		//## Printing the pattern ##
		/*
		 0
		 01
		 002
		 0003
		 00004		 
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <i; j++) {				
				System.out.print(0);				
			}
			System.out.println(i);
		}
		
		
				
		System.out.println();
		System.out.println();
		//## Printing the pattern ##
		/*
		1
		22
		333
		4444
		55555
		666666
*/
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	
		
		
		System.out.println();
		System.out.println();
		//## Printing the pattern ##
		/*
		
		1
		12
		123
		1234
		12345
		123456
*/
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		System.out.println();
		//## Printing the pattern ##
		/*
		
1
23
456
78910
1112131415
		
		*/
		int k = 0;
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < i; j++) {
				k = k + 1;
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.println();
		System.out.println();
		//## Printing the pattern ##
		/*
		
		1
		21
		321
		4321
		54321
		654321

*/
		for (int i = 1; i < 7; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	
		
		
		System.out.println();
		System.out.println();
		//## Printing the pattern ##
		/*
		
		A
		AB
		ABC
		ABCD
		ABCDE
		ABCDEF
		ABCDEFG

		*/
		int alphabet = 65;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + j));
			}
			System.out.println();
		}
	
		
		
		
		System.out.println();
		System.out.println();
		//## Printing the pattern ##
		/*
		
		A
		BB
		CCC
		DDDD
		EEEEE
		FFFFFF
		GGGGGGG

		*/
		int alphabet1 = 65;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet1 + i));
			}
			System.out.println();
		}
	
		
		
		
		
		}
		
	}


