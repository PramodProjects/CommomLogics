package CommonPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class String_DistinctStringArray {

	public static void main(String[] args) {
		String str = "This is Apple, Apple is a good organization";
		String str2 = str.replaceAll(",", "");
		String[] strArr = str2.split(" ");

		String str1 = "";
		Set<String> lhs = new LinkedHashSet<String>();
		for (int i = 0; i < strArr.length; i++) {
			if (lhs.add(strArr[i]) == true) {
				if (strArr[i].equals("Apple")) {
					str1 = str1 + strArr[i] + ", ";
				}

				else {
					str1 = str1 + (strArr[i]) + " ";
				}
			}

		}
		System.out.println(str1);
		
		
		// Logic 2 Java 8 Streams
		String[] strArr1 = str.replace(",", "").split(" ");
		Arrays.stream(strArr1).distinct().forEach(a -> System.out.print(a + " "));
		

	}

}
