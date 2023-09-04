package CommonPrograms;

public class Number_ConvertDecimalToBinary {

	public static void main(String[] args) {
		//Logic 1
		int a = 4;
		String b = "";
		int c = 0;
		while (a != 0){
			
			c = a % 2;
			a = a/2;
	
			b = c + b;
		}
		System.out.println(b);
	
		
		
		// Logic 2
		
		int  num = 4;
		int x = 0;
		int[] intArr = new int[100];
		while(num!=0)
		{
			intArr[x++] = num%2;
			num = num/2;
		}
		
		for (int i = x-1;i>=0;i--)
		{
			System.out.print(intArr[i]);
		}
		
		
		
		

	}

}
