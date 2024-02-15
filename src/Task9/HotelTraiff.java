package Task9;

import java.util.Scanner;

public class HotelTraiff {

	public static void main(String[] args) {
		
		//Using the scanner class to get user input for month, room rent and number of days
		
		System.out.println("Enter the month:");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		
		System.out.println("Enter the room rent:");
		Scanner sc1 = new Scanner(System.in);
		float roomRent = sc1.nextFloat();
		
		System.out.print("Enter the noOfDays:");
		Scanner sc2 = new Scanner(System.in);
		int noOfDays = sc2.nextInt();

		//Using the switch statement to check the condition
		
		double traiff;

		//Based on user input, the traiff is calculated
		switch (month) {
		case 3:
			traiff = 1.20 * roomRent * noOfDays;
			System.out.println("The room rent is" + traiff);
			break;
		case 4:
			traiff = 1.20 * roomRent * noOfDays;
			System.out.println("The room rent is" + traiff);
			break;
		case 5:
			traiff = 1.20 * noOfDays * roomRent;
			System.out.println("The room rent is" + traiff);
			break;

		case 11:
			traiff = 1.20 * roomRent * noOfDays;
			System.out.println("The room rent is" + traiff);
			break;
		case 12:
			traiff = 1.20 * roomRent * noOfDays;
			System.out.println("The room rent is" + traiff);
			break;
		default:
			traiff = roomRent * noOfDays;
			System.out.println("The room rent is" + traiff);
			break;
		}

	}

}
