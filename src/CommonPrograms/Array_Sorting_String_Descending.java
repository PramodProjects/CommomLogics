package CommonPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class Array_Sorting_String_Descending {

	public static void main(String[] args) {
		String[] myArray = { "JavaFX", "HBase", "OpenCV", "java", "hadoop", "Neo4j" };
		int size = myArray.length;

		// Logic 1
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i].compareToIgnoreCase(myArray[j]) < 0) {
					String temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(myArray));

		// Logic 2
		String[] myArray1 = { "javaFX", "hBase", "OpenCV", "Java", "Hadoop", "Neo4j" };
		Object[] s1 = Arrays.stream(myArray1).sorted((a,b)-> -a.compareToIgnoreCase(b)).toArray();
		System.out.println(Arrays.toString(s1));

		// Logic 3
		String[] myArray2 = { "javaFX", "HBase", "OpenCV", "Java", "hadoop", "Neo4j" };
		Arrays.stream(myArray1).sorted((a,b)-> -a.compareToIgnoreCase(b)).forEach(a -> System.out.print(a + ", "));
		System.out.println();
		
		
		// Logic 4
		String[] myArray3 = { "javaFX", "HBase", "OpenCV", "Java", "hadoop", "Neo4j" };
		Arrays.sort(myArray3, Comparator.reverseOrder());
		System.out.println(Arrays.toString(myArray3));
	}

}
