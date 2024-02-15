package Task9;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="mom";  //Declaring a String
         
        String str1="";  //Declaring an empty string to store the reverse of the original string
        
        for(int i=0;i<str.length();i++) {
        	
        	str1 = str.charAt(i)+str1;
        }
        
        //Comparing the strings 
        if(str.equals(str1)) {
        	
        	System.out.println("The String is a palindrome");
        }
        
        else
        	
        	System.out.println("The string is not a palindrome");
	}

}
