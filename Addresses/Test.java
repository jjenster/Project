import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) throws FileNotFoundException{
		
		Parser parser = new Parser("namecards.txt");
		
		ArrayList<Cutie> cuties = parser.constructCuties();
		
		Filter filter = new Filter(cuties);
		
		Scanner scan = new Scanner(System.in);
		
		boolean continueOn = true;
		
		while (continueOn == true){
			System.out.println();
			System.out.println("What would you like to search by?");
			System.out.println("Press 1 for name.");
			System.out.println("Press 2 for uni.");
			System.out.println("Press 3 for phone number.");
			System.out.println("Press 4 for email.");
			System.out.println("Press 5 for remark.");
			
			int choice = scan.nextInt();
			if(choice == 1){
				System.out.println("Please input element to search.");
				String name = scan.next();
				ArrayList <Cutie> nameList = filter.nameSearch(name);
				for(Cutie cutie:nameList){
					System.out.println(cutie);
				}
				System.out.println("Would you like to continue? 1 for yes, 2 for no.");
				int choicE = scan.nextInt();
				if(choicE == 2){
					continueOn = false;
				}
				
			}
			if(choice == 2){
				System.out.println("Please input element to search.");
				String uni = scan.next();
				System.out.print("Here are the results: " + filter.uniSearch(uni));
				System.out.println("Would you like to continue? 1 for yes, 2 for no.");
				int choicE = scan.nextInt();
				if(choicE == 2){
					continueOn = false;
				}
			}
			
		}
		
	}
}
