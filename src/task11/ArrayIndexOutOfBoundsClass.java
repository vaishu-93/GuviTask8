package task11;

//Creating a class for ArrayIndexOutOfBoundsClass
public class ArrayIndexOutOfBoundsClass {

	public static void main(String[] args) {

		// declaring an array of size 5
		int a[] = new int[5];

		// trying to access the 10th element
		try {

			a[10] = 10;

		}
		// using catch block to catch the exception occurred
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception occured");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("I want to run");
		}
	}
}
