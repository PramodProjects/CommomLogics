package CommonPrograms;

public class RandomDigit {

	public static void main(String[] args) {
		
		 int i = (int)(Math.random()*10);
		 System.out.println(i);
			
		 

		 // random number between min and max
		 int min=200, max=400;
		 int j = (int) (Math.random()*(max-min+1)+min);
		 System.out.println(j);
	}

}
