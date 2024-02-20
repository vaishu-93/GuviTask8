package task10;

//Creating a class with data member
public class Circle {

	int radius;
	
	//creating default constructor
	public Circle()
	{
		
	}
	
	//creating constructor with parameter
	public Circle(int circleRadius) {
		
		this.radius=circleRadius;
	}
	
	//Method to calcuate the circumference of the cirlce
	public int circumferenceOfCircle(int radius) {
		return (int) (2*3.14*radius);
				
	}
	
	//Creating object for the class and calling the method 
	public static void main(String[] args) {
		
		Circle objCir=new Circle();
		System.out.println(objCir.circumferenceOfCircle(5));
	}
	
	
	}
