package CommonPrograms;

public class String_abbbccaab_a1b3c2a2b1 {

	public static void main(String[] args) {
		// Ex: String str="abbbccaab";
		// Output: a1b3c2a2b1

		// Logic 1
		String oldString = "abbbccaab";
		String newString = "";
		int count = 0;
		for (int i = 0; i < oldString.length(); i++) {
			for (int j = 0; j < oldString.length(); j++) {
				if (oldString.charAt(i) == oldString.charAt(j)) {
					count++;
				} else {
					break;
				}
			}

			newString = newString + oldString.charAt(i) + count;
			oldString = oldString.substring(count);
			i--;
			count = 0;
		}

		System.out.println(newString);


		
		// Logic 2
//		String str = "aabbba";
//		int count = 1;
//		for(int i = 0; i <str.length();i=i+count){
//		    count =1;
//		    for(int j = i+1; j<str.length();j++){
//		        if(str.charAt(i) == str.charAt(j)){
//		            count = count+1;
//		        }
//		        else{
//		             break;
//		        }
//		    }
//		    // Print here otherwise you will miss the last group of letters
//		    // Also if you just want one line use .print instead of println
//		    System.out.print(str.charAt(i)+""+count);
//		}

		
	}

}
