import java.util.ArrayList;

public class Store {

	private ArrayList<Customer> customers;

	public Store() {
		customers = new ArrayList<Customer>();
	}

	return isFound;
	}
	
	public void addSale(String customerName, double amt) {
		
	boolean found = false;
		
	for (Customer customerArray : customers) {
		if (customerArray.getName().equals(customerName)) {
			customerArray.addAmt(amt);
			System.out.println(customerArray.getName() + " spent "
					+ customerArray.getAmt());
			found = true;
		}
				
	if(!found){
			Customer customer = new Customer(customerName, amt);
			customers.add(customer);
			System.out.println(customer + "spent" + customer.getAmt());
				
				
		}
	}
		
}

	public String nameOfBestCustomer() {
		if(customers.size()==0){
			System.out.println("No customer.Your store sucks.");
			return "Meh";
		} else{
			double largest = customers.get(0).getTotal();
			String maxName = customers.get(0).getName();
			for(Customer customerArray:customers){
				if(customerArray.getTotal()>largest){
					largest = customerArray.getTotal();
					maxName = customerArray.getName();
				}
				System.out.println(maxName);
			}
			return maxName;
		}
	}
	
	

}
