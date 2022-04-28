package CommonPrograms;

public class String_DeleteDuplicateCharacters {

	public static void main(String[] args) {
		String str = "pprra";
		int count = 0;
		String deleteDuplicate="";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(str.charAt(i));
				deleteDuplicate = deleteDuplicate+str.charAt(i);
			}
			count = 0;
		}
		System.out.println();
		System.out.println(deleteDuplicate);
	}
}
