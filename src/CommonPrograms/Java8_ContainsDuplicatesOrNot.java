package CommonPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8_ContainsDuplicatesOrNot {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<Integer>(list);
		
		if(list.size() == set.size()) {
			System.out.println("Does not contain duplicates"); 
						
		}
		else
		{
			System.out.println("Contain duplicates");  
		}

	}

}
