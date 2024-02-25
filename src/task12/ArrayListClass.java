package task12;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an array list to add string elements
		ArrayList<String> flowers=new ArrayList<String>();
		flowers.add("Jasmine");
		flowers.add("Lotus");
		flowers.add("Lily");
		flowers.add("Daisee");
		flowers.add("Marigold");
		
		//displaying the elements in the array list
		System.out.println("List of flowers:"+flowers);
		
		//removing all elements in the list
		flowers.clear();
		System.out.println(flowers);
	}

 
}
