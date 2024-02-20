package task10;

//creating the Class with data members
public class Person {

	String name;
	int age;

	//creating constructor with arguments
	public Person(String personName, int personAge) {

		this.name = personName;
		this.age = personAge;
	}

	//using the getter methods to return the value of the variables
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// creating object for the class and passing the values as arguments
	public static void main(String[] args) {
		Person person = new Person("Vaishali", 20);
		
		//calling the getter method to return the values
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}
}