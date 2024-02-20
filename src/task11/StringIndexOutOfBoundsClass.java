package task11;
 
//Creating a class for StringIndexOutOfBoundsClass
public class StringIndexOutOfBoundsClass {

	public static void main(String[] args) {
		
		//declaring a value to a String and try to access the element which is greater than string length
		try {
		  String str="Vaishali";
		  char ch=str.charAt(10);
		}
		//using catch block to catch the exception occured
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception occured");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I want to run");
		}
		  
		  
	}
}
