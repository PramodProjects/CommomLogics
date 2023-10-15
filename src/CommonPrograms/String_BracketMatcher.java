package CommonPrograms;

public class String_BracketMatcher {

	/*
	 * take the str parameter being passed and return 1 if the brackets are
	 * correctly matched and each one is accounted for. Otherwise return 0. For
	 * example: if str is "(hello (world))", then the output should be 1, but if str
	 * is "((hello (world))" the the output should be 0 because the brackets do not
	 * correctly match up. Only "(" and ")" will be used as brackets. If str
	 * contains no brackets return 1. *
	 */
	public static void main(String[] args) {

		String str = "((hello world))";
		int lCount = 0;
		int rCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				lCount++;
			} else if (str.charAt(i) == ')') {
				rCount++;
			}
		}

		if (lCount == rCount) {
			System.out.println("1");
		} else {
			System.out.println(0);
		}

	}

}
