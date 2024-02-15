package Task9;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		
		//Using scanner class to get the user input of marks
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of the student:");
		int marks=sc.nextInt();
		
		//Using the and operator to check the marks and display the grade
		if(marks>=90 && marks<=99 ) {
			System.out.println("Grade A");
		}
		else if(marks>=80 && marks<=89)
		{
			System.out.println("Grade B");
		}
		else if(marks>=70 && marks<=79)
		{
			System.out.println("Grade C");
		}
		else if(marks>=60 && marks<=69)
		{
			System.out.println("Grade D");
		}
		else if(marks>=50 && marks<=59)
		{
			System.out.println("Grade E");
		}
		else if(marks==100)
		{
			System.out.println("Grade S");
		}
		else if(marks<50) 
		{
			System.out.println("F");
		}
		else if(marks>100)
		{
			System.out.println("Invalid Input");
		}
	}
}
