package CommonPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\7504996\\OneDrive - TeleTech Holdings, Inc\\Projects\\Automation\\CommomLogics\\src\\CommonPrograms\\TextFile.txt");
		BufferedReader br =new BufferedReader(fr);
		String str;
		while((str = br.readLine())!=null) {			
			System.out.println(str);
		}

		br.close();
	}

}
