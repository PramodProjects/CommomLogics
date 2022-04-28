package CommonPrograms;

public class Array_SearchElement_LinearSearch {

	public static void main(String[] args) {
		int[] numA = { 1, 4, 6, 2, 5, 2 };
		int num = 2;
		boolean flag = false;
		for (int i = 0; i < numA.length; i++) {
			if (num == numA[i]) {
				System.out.println("element found - " + numA[i]);
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("element not found");
		}

	}

}
