package CommonPrograms;

public class Number_RandomDigit {

	public static void main(String[] args) {

		int i = (int) (Math.random() * 10);
		System.out.println(i);

		// random number between min and max
		int min = 200, max = 400;
		System.out.println(Math.random());
		System.out.println(Math.random() * (max - min + 1));
		int j = (int) (Math.random() * (max - min +1) + min);
		System.out.println(j);

		// genrate OTP
		String s = "";
		for (int k = 0; k < 6; k++) {
			int m = (int) (Math.random() * 10);
			s = s + m;
		}
		int n = Integer.parseInt(s);
		System.out.println(n);

	}

}
