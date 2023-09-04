package CommonPrograms;

public class String_LongestWord {

	public static void main(String[] args) {

		String str = "Hello aaaaaaaa bbbbbbbb 567";
		String[] strArr = str.split(" ");
		int maxLength = strArr[0].length();
		int index = 0;
		for (int i = 0; i < strArr.length; i++) {
			int length = strArr[i].length();
			if (maxLength < length) {
				maxLength = length;
				index = i;
			}
		}

		System.out.println(maxLength + " - " + strArr[index]);

	}

}
