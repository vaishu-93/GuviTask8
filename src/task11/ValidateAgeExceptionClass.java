package task11;

//Creating a class 
public class ValidateAgeExceptionClass {

	//Creating a method to validate age
	public static void validate(int age) {
		if(age<18) {
			//using the throw keyword to throw the exception occurred
			throw new ArithmeticException("Invalid Age Exception");
		}
		else
		{
			System.out.println("The person is above age 18");
		}
	}
	
	public static void main(String[] args) {
		validate(15);
		System.out.println("The exception is thrown");
	}
}
