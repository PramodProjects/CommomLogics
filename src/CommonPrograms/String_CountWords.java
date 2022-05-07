package CommonPrograms;

public class String_CountWords {

	public static void main(String[] args) {
		String s = "fdsaj    fjh    fdalj   fdjal fdd";
		String[] s1 = s.split("\\s+");
		System.out.println(s1.length);

		
		// logic 2
		String str = "fh fdj    fd uk";
		String[] str1 = str.split(" ");
		int count = 0;
		for (int i = 0; i < str1.length; i++) {
			if (!str1[i].equals("")) {
				count++;
			}
		}
		System.out.println(count);

	}

}
