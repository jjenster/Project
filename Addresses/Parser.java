import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

	private File contactsFile;

	public Parser(String contactsPath) {
		contactsFile = new File(contactsPath);
	}

	public ArrayList<Cutie> constructCuties() throws FileNotFoundException {
		ArrayList<Cutie> cuties = new ArrayList<Cutie>();

		Scanner scan = new Scanner(contactsFile);
		String blankLine = scan.nextLine();

		while (scan.hasNextLine()) {

			String line = scan.nextLine();

			String[] lineParts = line.split(",");
			String name = lineParts[0];
			String uni = lineParts[1];
			String number = lineParts[2].replaceAll("[^0-9]", "");
			String email = lineParts[3];
			String remark = lineParts[4];

			Cutie cutie = new Cutie(name, uni, number, email, remark);
			cuties.add(cutie);
		}
		scan.close();
		return cuties;
	}
	
}
