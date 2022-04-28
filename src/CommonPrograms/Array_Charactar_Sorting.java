package CommonPrograms;

import java.util.Arrays;

public class Array_Charactar_Sorting {

	public static void main(String[] args) {
	    String wordSt="hatgfaa";
	    char[] word=wordSt.toCharArray();
	    //String sort = "";
	    for(int i=0;i<word.length;i++){
	        for(int j=i+1;j<word.length;j++){
	            if(word[i]>word[j]){	            	
	                char temp=word[i];
	                word[i]=word[j];
	                word[j]=temp;
	            }
	        }
	       
	        //sort = sort+word[i];
	    }
	    System.out.print(word);
	    //wordSt=String.valueOf(sort);
	    //System.out.println(wordSt);
	    
	   
	}

}
