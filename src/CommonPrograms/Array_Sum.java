package CommonPrograms;

public class Array_Sum {

	public static void main(String[] args) {
		int[] arrayInt = { 2, 5, 7, 2};
		int sum = 0;
		for (int i = 0; i < arrayInt.length; i++) {
			sum = sum + arrayInt[i];
		}
		
//		for (int i : arrayInt) {
//			sum = sum+i;
//		}
		
		System.out.println(sum);

	}

}
