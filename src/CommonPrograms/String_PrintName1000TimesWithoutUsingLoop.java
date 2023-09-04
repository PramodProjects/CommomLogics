package CommonPrograms;

public class String_PrintName1000TimesWithoutUsingLoop {

	public static void main(String[] args) {
		String s = "i";
		s = s.replaceAll("i", "iiiiiiiiii"); // 10
		s = s.replaceAll("i", "iiiiiiiiii"); // 10*10 = 100
		s = s.replaceAll("i", "iiiiiiiiii"); // 100*10 = 1000
		
		s = s.replaceAll("i", "pramod" + "\n");
		
		System.out.println(s);
		

	}

}
