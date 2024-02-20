package task11;

import java.security.InvalidKeyException;

//creating a class for Unchecked exception for invalid password
public class LoginSystem {

	//implementing exception handling using the throws keyword in the method
	public static void checkPassword(String password) throws InvalidKeyException {

		if (password.length() < 8) {
			System.out.println("Incorrect Password Exception occured");
		} else {
			System.out.println("Login successful");
		}
		//using throw keyword to throw the unchecked exception occurred
		throw new InvalidKeyException();

	}

	//using the try catch block to handle the exception occured
	public static void main(String[] args) {
		try {
			checkPassword("pqrqw");
		} catch (InvalidKeyException e) {

			e.printStackTrace();
			e.getMessage();
		}
	}
}
