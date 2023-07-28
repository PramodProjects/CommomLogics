package CommonPrograms;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			System.out.println("test1");
			System.out.println("test2");
			System.out.println(10/0);
			System.out.println("test3");
			
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println(e.toString());
			e.printStackTrace();
			
		
			
		}

	}

}
