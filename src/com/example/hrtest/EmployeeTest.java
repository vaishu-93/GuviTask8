package com.example.hrtest;

//Importing the package to access the employee class
import com.example.hr.Employee;

//creating employee test class
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of employee class to access the methods and variables out of the package
		Employee emp=new Employee("Vaishali", 1);
		emp.printName();
		emp.printSalary(10092);
	}

}
