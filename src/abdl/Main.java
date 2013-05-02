package abdl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream is = new FileInputStream(new File("file.txt"));
		ADBLParser parser = new ADBLParser(is);
		try {
			parser.AddressBook();
			System.out.println("Input OK");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
