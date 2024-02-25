package com.example.hr;

//creating an Employee class with data member
public class Employee {

	String name;
	int empId;

	// creating constructor for the employee class
	public Employee(String empName, int id) {

		this.name = empName;
		this.empId = id;
	}

	// creating a method to print the employee name
	public void printName() {

		System.out.println("The employee name is:" + name);
	}

//creating a method to print employee salary
	public void printSalary(double salary) {

		System.out.println("The salary of employee is:" + salary);
	}
}