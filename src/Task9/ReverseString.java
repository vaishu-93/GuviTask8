package Task9;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		//USing the scanner class to get input String from the user
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine(); 
		
		String reverse=""; //Declaring an empty to string to store the reverse of the user input
		
		//using the for loop to traverse through the string and reverse the string
		
		for(int i=0;i<str.length();i++) {
			
			reverse=str.charAt(i)+reverse;
		}
		
		System.out.println("The reversed string is:"+reverse);
	}
}
