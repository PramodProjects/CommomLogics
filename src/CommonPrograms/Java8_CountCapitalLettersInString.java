package CommonPrograms;

public class Java8_CountCapitalLettersInString {

	public static void main(String[] args) {
		
		// Logic 1
		String str = "PramodJan";
		long cnt = str.chars().filter(a -> a>='A' && a<='Z').count();
		System.out.println(cnt);
		
		// Logic 2
		long cnt1 = str.chars().filter(a -> Character.isUpperCase(a)).count();
		System.out.println(cnt1);

	}

}
