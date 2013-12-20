import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

//		final int ROWS = 9;
//		final int COL = 10;
//
		// this is stupidly complicated. Nevermind. Just gonna do it the easy way
//		int[][] seatChart = new int[ROWS][COL];
//
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < COL - 1; j++) {
//				seatChart[i][j] = 10;
//			}
//		}
//		for (int i = 3; i < 5; i++) {
//			for (int j = 0; j < 1; j++) {
//				seatChart[i][j] = 10;
//			}
//			for (int j = 2; j < 7; j++) {
//				seatChart[i][j] = 20;
//			}
//			for (int j = 8; j < COL - 1; j++) {
//				seatChart[i][j] = 10;
//			}	
//		}
		// FUCK. Should have done this. Now my SeatChart constructor is fucked up. so are all the methods...
		
		double[][] seatChartArray = {
				{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
				{ 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
				{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

		SeatChart seatChart = new SeatChart(seatChartArray);
		seatChart.print();
		
		boolean buyMore = true;
		Scanner input = new Scanner(System.in);
		
		while (buyMore = true) {

			System.out.println("If you would like to buy based");
			System.out.println("- on position, press 1");
			System.out.println("- on price, press 2");
			System.out.println();
			System.out.println("To exit, press 0");
			
			int action = input.nextInt();

			if (action == 1) {
				System.out.println("Please select row.");
				int row = input.nextInt();
				System.out.println("Please select column.");
				int col = input.nextInt();
				boolean success = seatChart.pickSeat(row, col);
				
				if(success){
					System.out.println("Yay your ticket is bought!");
				} else{
					System.out.println("Niooooo your ticket has not been bought... Please try again.");
				}
			} else if (action == 2) {
				System.out.println("Please select price.");
				int price = input.nextInt();
				boolean success = seatChart.pickPrice(price);
				
				if(success){
					System.out.println("Yay your ticket is bought!");
				} else{
					System.out.println("Niooooo your ticket has not been bought... Please try again.");
				}
			} else
			{
				buyMore = false;
				System.out.println("Byebye.");
			}
		}

	}
}
