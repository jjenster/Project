
public class Customer {

	private String name;
	private double amt;
	private double total;
	
	public Customer(String name, double amt){
		this.name = name;
		this.amt = amt;
		total = amt;
	}
	
	public void addAmt(double amt){
		total+=amt;
	}
	
	public double getAmt(){
		return amt;
	}
	
	public double getTotal(){
		return total;
	}
	
	public String getName(){
		return name;
	}
	
	
	
}
