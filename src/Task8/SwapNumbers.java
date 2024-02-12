package Task8;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int number1 = sc.nextInt();
		int number2=sc.nextInt();
		
		int temp;
		temp=number1;
		number1=number2;
		
		System.out.println("The swapped numbers are: number1 = "+temp +" "+"number2="+number1);
	}
	
}
