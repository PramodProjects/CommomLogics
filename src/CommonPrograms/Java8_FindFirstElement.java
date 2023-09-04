package CommonPrograms;

import java.util.Arrays;
import java.util.List;

public class Java8_FindFirstElement {

	public static void main(String[] args) {
		 List<Integer> list1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 list1.stream().findFirst().ifPresent(System.out::println);

	}

}
