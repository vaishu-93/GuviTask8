package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instantiating the chrome driver
		WebDriver driver = new ChromeDriver();

		// Navigating to the webpage
		driver.get("https://www.guvi.in/");

		// maximizing thw window
		driver.manage().window().maximize();

		// using implicit wait to wait for 20 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//clicking on the sign up button
		driver.findElement(By.linkText("Sign up")).click();
		
		// locating the element and entering the name
		driver.findElement(By.id("name")).sendKeys("Vaishali");

		// entering the email address in the email field
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bluebirds028@gmail.com");

		// entering the password in the password field
		driver.findElement(By.className("password-err")).sendKeys("Anaira$30");

		// entering the mobile number
		driver.findElement(By.cssSelector("input[id='mobileNumber']")).sendKeys("9108052962");

		//Clicking on the Sign up button
		driver.findElement(By.linkText("Sign Up")).click();
		
		//Verification not done as the page is navigated to another page 
	}

}
