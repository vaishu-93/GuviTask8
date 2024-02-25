package task12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a tree map to add employee id and names 
		TreeMap<Integer,String> empList=new TreeMap<>();
		empList.put(1, "Laya");
		empList.put(2, "Reena");
		empList.put(3, "Kaira");
		empList.put(4, "Pavithra");
		empList.put(5, "Deeksha");
		
		//adding the names of tree map into array list
		List<String> names=new ArrayList<>(empList.values());
		
		//using the sort method to sort the names in the array list
		Collections.sort(names);
		
		//Printing the employee names in alphabetical order using for each loop
		System.out.println("Names of employees in alphabetical order:");
		
		for(String name:names) {
			System.out.println(name);
		}
	}

}
