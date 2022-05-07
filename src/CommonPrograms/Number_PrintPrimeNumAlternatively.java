package CommonPrograms;

public class Number_PrintPrimeNumAlternatively {

	public static void main(String[] args) {

		boolean flag = true;
		for (int i = 1; i < 1000; i++) {

			int num = i;
			int count = 0;
			for (int j = 1; j <= num; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2 && flag == true) {
				System.out.println(i + " is Prime");
				flag = false;
			} else if (count == 2 && flag == false) {
				flag = true;
			}

		}

	}

}
