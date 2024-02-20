package task11;

import java.util.Scanner;

public class DivisionByZeroClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using the scaaner class to get input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int number1 = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the second Number:");
		int number2 = sc1.nextInt();
		
		//Using the try catch block to implement exception handling for division by zero
		try {
			int result = number1 / number2;

		} 
		//Using the catch block to throw the exception occured
		catch (ArithmeticException e) {
			System.out.println("Arithemtic exception occured");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally block will want to run");
		}
	}

}
