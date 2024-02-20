package task11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//creating a class for FileNotFoundException
public class FileNotFoundExceptionClass {

	//implementing exception handling using the throws keyword in the method
	public static void method() throws FileNotFoundException {
		
		//Using the fileReader class to read a file
		FileReader file = new FileReader("C:\\Users\\vaish\\OneDrive\\Desktop\\myFile.txt");
		
		BufferedReader fileInput = new BufferedReader(file);
		
		//using throw keyword to throw the exception occurred
		throw new FileNotFoundException();
	}
	
	public static void main(String[] args) {
		// using catch block to catch the exception occurred
		try {
			method();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			e.getMessage();
		}
	System.out.println("rest of the code executes by default");
	}
}

