package CommonPrograms;

import java.util.StringJoiner;

public class Java8_StringJoiner {

	public static void main(String[] args) {
		
		//Logic 1
		StringJoiner sj = new StringJoiner(",", "{", "}");
		sj.add("pramod");
		sj.add("janjirala");
		sj.add("kumar");

		System.out.println(sj);
		
		// Logic 2
		StringJoiner sjn = new StringJoiner(":");
		sjn.add("pramod");
		sjn.add("janjirala");
		sjn.add("kumar");
		System.out.println(sjn);
		

	}

}
