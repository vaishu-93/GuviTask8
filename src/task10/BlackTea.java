package task10;

//creating a subclass for class Tea
public class BlackTea extends Tea {

	//Overriding the Prepare Tea method from the Tea class
	public void prepareTea() {
	  	
		System.out.println("Prepare Black Tea");
	}
	
	//creating object for the class and calling the subclass method
	public static void main(String[] args) {
		
		BlackTea objBlack=new BlackTea();
		objBlack.prepareTea();
	}
}