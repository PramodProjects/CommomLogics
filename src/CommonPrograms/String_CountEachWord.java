package CommonPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_CountEachWord {

	public static void main(String[] args) {
		String s = "aa aa bb cc aa bb cc";
		String[] str = s.split(" ");
		int count=0;
		ArrayList al = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if(str[i].equals(str[j])) {
					
					count++;
				}
			}
			if(!al.contains(str[i])) {
				al.add(str[i]);
			System.out.println(str[i] + " " + count);			
			}
			count =0;
		}
		
		// Logic 2
		String str1 = "aa aa bb cc aa bb cc";
		String[] strArr = str1.split(" ");
		//int[] freq = new int[str1.length()];
		int count1 = 1;
		for (int i = 0; i < strArr.length; i++) {
			count1 = 1;
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].equals(strArr[j])) {
					count1++;
					strArr[j] = "";
				}
			}
			if (strArr[i] != "") {
				System.out.println(strArr[i] + "-" + count1);
			}
		}

		


		// Logic 3
		Map<Object, Long> result = Arrays.stream(s.split(" ")).map(a -> a)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
	}

}
