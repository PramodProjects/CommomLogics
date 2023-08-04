package CommonPrograms;

public class Number_RandomDigit {

	public static void main(String[] args) {
		
		 int i = (int)(Math.random()*10);
		 System.out.println(i);
			
		 

		 // random number between min and max
		 int min=200, max=400;
		 System.out.println(Math.random());
		 System.out.println(Math.random()*(max-min+1));
		 int j = (int) (Math.random()*(max-min+1)+min);
		 System.out.println(j);
	}

}
