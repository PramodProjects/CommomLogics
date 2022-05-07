package CommonPrograms;

public class String_MaxMinOccurringCharacter {

	public static void main(String[] args) {
		String str = "abcabbbcczzk";

		int[] freq = new int[str.length()];
		char[] strArr = str.toCharArray();
		int min, max;
		char minChar = strArr[0];
		char maxChar = strArr[0];

		for (int i = 0; i < strArr.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i] == strArr[j]) {
					freq[i]++;
					strArr[j] = '0';
				}
			}
		}

		min = max = freq[0];
		for (int i = 0; i < strArr.length; i++) {
			if (min > freq[i] && strArr[i] != '0') {
				min = freq[i];
				minChar = strArr[i];
			}
			if (max < freq[i] && strArr[i] != '0') {
				max = freq[i];
				maxChar = strArr[i];
			}
		}
		System.out.println("Minimum occurring character: " + minChar);
		System.out.println("Maximum occurring character: " + maxChar);

	}

}
