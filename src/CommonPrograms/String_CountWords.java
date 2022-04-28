package CommonPrograms;

public class String_CountWords {

	public static void main(String[] args) {
		String s = "fdsaj    fjh   fdalj fdjal";
		String[] s1 = s.split("\\w+");
		System.out.println(s1.length);

	}

}
