package CommonPrograms;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("C:\\Users\\7504996\\OneDrive - TeleTech Holdings, Inc\\Projects\\Automation\\CommomLogics\\src\\CommonPrograms\\TextFile.txt");
		PrintWriter pw = new PrintWriter(fr);
		pw.write(100);
		pw.println();
		pw.write('a');
		pw.println();
		pw.write("test");
		pw.println();
		pw.println("pramod1");
		pw.println("pramod2");
		pw.flush();
		pw.close();
		

	}

}
