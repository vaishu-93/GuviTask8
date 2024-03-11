package Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Instantiating the chrome driver
		WebDriver driver = new ChromeDriver();
		
		//maximizing the browser
		driver.manage().window().maximize();
		
		//Navigate to the facebook url
		driver.navigate().to("https://www.facebook.com/");
		
		//verifying if the browser had opened the facebook page
		String expectedTitle = "Facebook – log in or sign up";
		if (driver.getTitle().equalsIgnoreCase(expectedTitle)) {
			System.out.println("The page is landed on Facebook webpage");
		} else
			System.out.println("Invalid webpage");

		//clicking on the create new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		//Entering the value in the firstname field
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vaishu");
		
		//Entering the value in the lastname field
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Prashu");
		
		//Entering the email address in the email field
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("bluebirds028@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("bluebirds028@gmail.com");
		
		//Entering the password in the password field
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Anaira$30");
	  
		//Using the select class to set the value for dob (date,month and year)
		WebElement dateEle=driver.findElement(By.id("day"));
	    
		Select date =new Select(dateEle);
		date.selectByVisibleText("11");
		
		WebElement monthEle=driver.findElement(By.id("month"));
		Select month=new Select(monthEle);
		month.selectByVisibleText("May");
		

		WebElement yearEle=driver.findElement(By.id("year"));
		Select year=new Select(yearEle);
		year.selectByVisibleText("1985");
		
		//clicking on the radio button to selec the gender
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		//clicking on the sign up button
		driver.findElement(By.name("websubmit")).click();
		
	}

}
