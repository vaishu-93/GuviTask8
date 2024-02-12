package Task8;

import java.util.Scanner;

public class PrimeNumber {
  
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		
		boolean flag=false;
		
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
			   flag = true;
			   break;
			}
		}
		
		if(!flag) {
			System.out.println(+number + " The number is a prime number");
		}
		else
			System.out.println(+number + " The number is not a prime number");
		
	}
}