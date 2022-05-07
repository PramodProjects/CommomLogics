package CommonPrograms;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		char[] chars = {'a', 'b', 'c','e', 'b'};
		
		int vCount = 0;
		int cCount = 0;
		
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i'|| chars[i] == 'o'|| chars[i] == 'u') {
				vCount++;
			}
			else {
				cCount++;
			}
		}
		System.out.println("Vowels " + vCount);
		System.out.println("Consonants " + cCount);

	}

}
