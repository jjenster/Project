import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		Store store = new Store();
		
		Scanner scan = new Scanner(System.in);
		
		boolean continueOn = true;
		
		while(continueOn = true){
			
			System.out.println("Please choose an action.");
			System.out.println("To add a new purchase, press 1.");
			System.out.println("To return the name of the best customer, press 2.");
			System.out.println("To exit, press 0.");
			
			int choice = scan.nextInt();
			if(choice == 0){
				System.out.println("Byebye.");
				continueOn = false;
			} else if(choice == 1){
				boolean nextCustomer = false;
				while(nextCustomer = true){
				System.out.println("Please enter name of customer.");
				String name = scan.next();
				System.out.println("Please enter amount spent.");
				double amt = scan.nextDouble();
				store.addSale(name, amt);
				System.out.println("Do you want to enter another customer? 1 for yes, 2 for no.");
				int yesNo = scan.nextInt();
				if(yesNo == 1){
					nextCustomer = true;
				} else{
					nextCustomer = false;
				}
				}
				System.out.println("Customers have been entered.");
				System.out.println("Customers have been entered.");
				System.out.println("Do you want to do another action? 1 for yes, 2 for no.");
				choice = scan.nextInt();
				if(choice == 1){
					continueOn = true;
				} else{
					continueOn = false;
				}
				
			} else{
				store.nameOfBestCustomer();
				System.out.println("Customers have been entered.");
				System.out.println("Do you want to do another action? 1 for yes, 2 for no.");
				choice = scan.nextInt();
				if(choice == 1){
					continueOn = true;
				} else{
					continueOn = false;
				}
				
			}
			
			
		}
	}

}
