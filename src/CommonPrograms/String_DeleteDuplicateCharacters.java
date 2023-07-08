package CommonPrograms;

public class String_DeleteDuplicateCharacters {

	public static void main(String[] args) {
		String str = "pprraqwp";
		int count = 0;
		String deleteDuplicate = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {

				deleteDuplicate = deleteDuplicate + str.charAt(i);

			}
			count = 0;
		}
		System.out.print(deleteDuplicate);
	}
}
