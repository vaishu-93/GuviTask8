package Task9;

public class LargestNumber {

	public static void main(String[] args) {
		
		//Declaring three integer variables to store the numbers
		
		int a=100; 
		int b=40;
		int c=20;
		
		//using the AND operator to check for the largest number
		
		if(a>b && a>c) {
			System.out.println("The largest number is " +a);
		}
		
		else if(b>a && b>c){
			System.out.println("The largest number is "+b);
		}
        		
		else if(c>a && c>b) {
			System.out.println("The largest number is "+c);
		}
			
	}
}
