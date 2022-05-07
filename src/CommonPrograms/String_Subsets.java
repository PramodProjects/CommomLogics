package CommonPrograms;

public class String_Subsets {

	public static void main(String[] args) {
		
		/* All subsets for given string are:
		F
		FU
		FUN
		U
		UN
		N 
		*/
	
		
		String str = "FUN";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				System.out.println(str.substring(i, j + 1));
			}

		}

	}

}
