package Task9;

import java.util.Scanner;

public class PatternPrinting {

	public static void main(String[] args) {
		 
		//Using the scanner class to get the number of rows as input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();
		
		int number=1;
		
		//iterating through the rows
		for(int i=1;i<=rows;i++)
		{
			//iterating to increment and  print the elements 
			for(int j=1;j<=i;j++) 
			{
				System.out.print(number +" ");
				number++;
			}
			
			System.out.println();		}
	}
}
