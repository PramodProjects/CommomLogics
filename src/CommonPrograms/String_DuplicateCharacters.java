package CommonPrograms;

public class String_DuplicateCharacters {

	public static void main(String[] args) {
		String s = "habcabccgghy";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if(count>1) {
			System.out.println(s.charAt(i) + " " + count);
			}
			s = s.replaceAll(Character.toString(s.charAt(i)), "");
			count=0;
			i--;
		}
		
		
		
		// Logic 2
		String string1 = "Great responsibility";    
        int count1;    
            
        //Converts given string into character array    
        char string[] = string1.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        //Counts each character present in the string    
        for(int i = 0; i <string.length; i++) {    
            count1 = 1;    
            for(int j = i+1; j <string.length; j++) {    
                if(string[i] == string[j] && string[i] != ' ') {    
                    count1++;    
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
            //A character is considered as duplicate if count is greater than 1    
            if(count1 > 1 && string[i] != '0')    
                System.out.println(string[i]);    
        }    
	}
}
