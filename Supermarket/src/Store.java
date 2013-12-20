import java.util.ArrayList;

public class Store {

	private ArrayList<Customer> customers;

	public Store() {
		customers = new ArrayList<Customer>();
	}

	public boolean addSale(String customerName, double amt) {
		boolean isFound = false;
		for (Customer customerArray : customers) {
			if (customerArray.getName().equals(customerName)) {
				Customer customer = new Customer(customerName, amt);
				customers.add(customer);
				isFound = false;
				
			} else{
				customerArray.addAmt(amt);
				isFound = true;
			}
		}
		return isFound;
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
			}
			return maxName;
		}
	}
	
	

}
