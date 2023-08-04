package CommonPrograms;

public class Number_ConvertDecimalToBinary {

	public static void main(String[] args) {
		//Logic 1
		/*Integer a = 100;
		String b = "";
		Integer c = 0;
		while (a != 0){
			
			c = a % 2;
			a = a/2;
	
			b = c.toString() + b;
		}
		System.out.println(b);
	*/
		
		
		// Logic 2
		
		int  a = 4;
		int x = 0;
		int[] intArr = new int[100];
		while(a!=0)
		{
			intArr[x++] = a%2;
			a = a/2;
		}
		
		for (int i = x-1;i>=0;i--)
		{
			System.out.print(intArr[i]);
		}
		
		
		
		

	}

}
