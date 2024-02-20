package task10;

//Creating class with balance as data member
public class Account {

	double balance;
	
	//default constructor with no parameters
	public Account() {
		
	}
	
	//constructor with parameter
	public Account(int accBalance)
	{
		this.balance=accBalance;
	}
	
	//method 1
	public void withdraw() {
		System.out.println("I can withdraw my amount");
	}
	
	//method 2
	public void depositBalance() {
		System.out.println("I can deposit my amount");
	}
	
	//creating object for the class and using the object to call the methods
	public static void main(String[] args) {
		
		Account objAcc=new Account();
		objAcc.depositBalance();
		objAcc.withdraw();
	}
}
