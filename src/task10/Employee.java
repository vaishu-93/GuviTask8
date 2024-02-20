package task10;

//creating the class with data members
public class Employee {

	int id;
	String fname;
	String lname;
	int salary;

	//creating constructor with arguments
	public Employee(int empId, String firstName, String lastName, int empSalary) {

		this.id = empId;
		this.fname = firstName;
		this.lname = lastName;
		this.salary = empSalary;
	}

	//using the getter method to get the values of the variable
	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getSalary() {
		return salary;
	}
	
    //method 1
	public int raiseSalary(int percent) {
		return salary * (percent / 100);
	}

	//method 2
	public String getName(String fname, String lname) {
		return fname + lname;
	}

	//creating the object for the class and passing the values for the variables 
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Vaishali", "Prasadh", 10000);
		
		//calling the getter method to return the values
		System.out.println(emp.getId());
		System.out.println(emp.getName(emp.fname, emp.lname));
		System.out.println(emp.getSalary());
		System.out.println(emp.raiseSalary(5));
	}
}
