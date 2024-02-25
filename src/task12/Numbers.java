package task12;

import java.util.ArrayList;

public class Numbers {

	public static void main(String[] args) {
		
		//creating an array list to add numbers in a list
		ArrayList<Integer> numbers =new ArrayList<>();
		
		//adding numbers into the list
		numbers.add(81);
		numbers.add(10);
		numbers.add(76);
		numbers.add(34);
		numbers.add(64);
		
		//display the numbers in the list
		System.out.println("The numbers in the list are:"+numbers);
		
		//converting the array list into array
		Integer[] numList=numbers.toArray(new Integer[0]);
 
		//displaying the numbers in the array
		for(Integer  num:numList)
		{
			System.out.println(num);
		}
	}
}
