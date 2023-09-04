package CommonPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class Array_Sorting_String_Ascending {

	public static void main(String[] args) {
		String[] myArray = { "JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j" };
		int size = myArray.length;

		// Logic 1
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i].compareToIgnoreCase(myArray[j]) > 0) {
					String temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(myArray));

		// Logic 2
		String[] myArray1 = { "JavaFX", "HBase", "OpenCV", "java", "hadoop", "Neo4j" };
		String[] s1 = Arrays.stream(myArray1).sorted(String.CASE_INSENSITIVE_ORDER).toArray(String[]::new);
		System.out.println(Arrays.toString(s1));

		// Logic 3
		String[] myArray2 = { "JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j" };
		Arrays.stream(myArray1).sorted().forEach(a -> System.out.print(a + ", "));

		// Logic 4
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));

		// Logic 5
		String[] myArray3 = { "javaFX", "hBase", "OpenCV", "Java", "Hadoop", "Neo4j" };
		Object[] s2 = Arrays.stream(myArray3).sorted((a, b) -> a.compareToIgnoreCase(b)).toArray();
		System.out.println(Arrays.toString(s2));

	}

}
