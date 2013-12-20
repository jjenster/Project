public class SeatChart {

	private Seat[][] seats;
	private int row, col;
	private Seat seat;

	public SeatChart(double[][] seatChart) {
		seats = new Seat[seatChart.length][seatChart[1].length];
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				// third try still not working
//				double price = seatChart[i][j];
//				seat = new Seat(price);
				
				// last try still not working...
				double price = seatChart[i][j];
				seat = new Seat(price);
				seat[i][j] = seat;
				
			//	seats[i][j] = seat.setPriceReturn(price);
				
				
// first version: seat[i][j].setPrice(seatChart[i][j]);
				// why the heck does this not work. 
// then this (I don't even know why I thought this would work better...				
//				Seat seat = seats[i][j];
//				seat = seat.setPrice(price);
// this part caused me to fail for... around 6 hours...	
			}
		}
	}

	// these mehtods don't work either. probably same array problem. can't seem to copy it over correctly
	public boolean pickSeat(int row, int col) {
		if (seats[row][col].getPrice() == 0) {
			System.out.println("This seat is not available.");
			return false;
		} else {
			System.out.println("Your seat is at " + "row " + row + "column " + col);
			seats[row][col].setPrice(0);
			return true;
		}
	}

	//abandoned this one because I don't know how to print 
	//the position of the found seat
	//
//	public boolean pickPrice(double aprice) {
//		boolean isFound = true;
//		for (Seat[] row : seats) {
//			for (Seat price : row) {
//				if (aprice != price.getPrice()) {
//					System.out.println("There is no seat at this price.");
//					isFound = false;
//				} else {
//					price.setPrice(0);
//					isFound = true;
//				}
//			}
//		}
//		return isFound;
//	}
	
	public boolean pickPrice(double aprice) {
		boolean isFound = true;
		for (row=0; row<seats.length; row++) {
			for (col=0; col<seats[0].length; col++) {
				if (aprice != seats[row][col].getPrice()) {
					System.out.println("There is no seat at this price.");
					isFound = false;
				} else {
					System.out.println("Your seat is at " + "row " + row + "column " + col);
					seats[row][col].setPrice(0);
					isFound = true;
				}
			}
		}
		return isFound;
	}
	
	public void print() {
		System.out
				.println("R/C \t[0] \t[1] \t[2] \t[3] \t[4] \t[5] \t[6] \t[7] \t[8] \t[9]");
		for (int i = 0; i < seats.length; i++) {
			System.out.print("[" + i + "]" + "\t");
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[j][i].getPrice() + "\t");
			}
			System.out.println();
		}
}
}
