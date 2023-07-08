package CommonPrograms;

import java.net.MalformedURLException;
import java.net.URL;

public class CompareURLandIPAddress {

	public static void main(String[] args) throws MalformedURLException {
		System.out.println(new URL("https://www.toolsqa.com/").equals(new URL("https://104.26.14.176")));

	}

}
