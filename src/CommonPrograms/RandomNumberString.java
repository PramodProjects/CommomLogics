package CommonPrograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class RandomNumberString {

	public static void main(String[] args) {

		Random random = new Random();

		// Random number
		int i = random.nextInt(100);
		System.out.println(i);

		// Random double
		double j = random.nextDouble();
		System.out.println(j);

		// Random number by attach Apache Common Lang jar file
		int k = RandomUtils.nextInt(100, 200);
		System.out.println(k);

		String s1 = RandomStringUtils.randomNumeric(5);
		System.out.println(s1);

		// Random String by attach Apache Common Lang jar file
		String s2 = RandomStringUtils.randomAlphabetic(3);
		System.out.println(s2);

	}

}
