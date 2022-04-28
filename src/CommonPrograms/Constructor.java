package CommonPrograms;

public class Constructor {
	int rollNum;
	String name;
	
	
	
	Constructor(int rollNum, String name){
		
		this.rollNum = rollNum;
		this.name = name;
	}

	public static void main(String[] args) {
		
		Constructor c1 = new Constructor(101, "pramod");
		Constructor c2 = new Constructor(102, "janjriala");
		System.out.println(c1.rollNum + c1.name);
		System.out.println(c2.rollNum + c2.name);
	}

}
