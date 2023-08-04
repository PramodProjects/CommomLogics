package CommonPrograms;

import java.util.Arrays;

public class Array_Sorting_String {

	public static void main(String[] args) {
		 String[] myArray = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j"};
	      int size = myArray.length;

	      for(int i = 0; i<size-1; i++) {
	         for (int j = i+1; j<myArray.length; j++) {
	            if(myArray[i].compareToIgnoreCase(myArray[j])>0) {
	               String temp = myArray[i];
	               myArray[i] = myArray[j];
	               myArray[j] = temp;
	            }
	         }
	      }
	      System.out.println(Arrays.toString(myArray));
	      
	      
	      // Logic 2
	      String[] myArray1 = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j"};
	      Object[] s1 =  Arrays.stream(myArray1).sorted().toArray();
	      System.out.println(Arrays.toString(s1));
	      
	   // Logic 3
	      String[] myArray2 = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j"};
	      Arrays.stream(myArray1).sorted().forEach(a ->System.out.print(a + ", "));
	     
	      
	}
	
	
	
	

}
