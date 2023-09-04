package CommonPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class File_MergeTextFiles {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(
				"C:\\Users\\7504996\\OneDrive - TeleTech Holdings, Inc\\Projects\\Automation\\CommomLogics\\src\\CommonPrograms\\test3.txt");
		FileReader fr = new FileReader(
				"C:\\Users\\7504996\\OneDrive - TeleTech Holdings, Inc\\Projects\\Automation\\CommomLogics\\src\\CommonPrograms\\test1.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			pw.println(line);
		}

		br = new BufferedReader(new FileReader(
				"C:\\Users\\7504996\\OneDrive - TeleTech Holdings, Inc\\Projects\\Automation\\CommomLogics\\src\\CommonPrograms\\test2.txt"));

		while ((line = br.readLine()) != null) {
			pw.println(line);
		}

		pw.flush();
		pw.close();

	}

}
