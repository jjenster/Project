public class Seat {

	private double price;

//	public Seat() {
//
//	}
//
	public Seat(double aprice) {
		this.setPrice(aprice);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double aprice) {
		price = aprice;
		
	}
	
	public Seat setPriceReturn(double aprice) {
		Seat seat = new Seat(aprice);
		return seat;
	}
}
