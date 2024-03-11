package task17;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUpClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		// Navigating to the webpage
		driver.get("https://www.demoblaze.com/");

		// maximizing thw window
		driver.manage().window().maximize();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Using actions class to perform mouse actions to move to element
		WebElement element=driver.findElement(By.linkText("Sign up"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element);
	
		
		action.build().perform();
		
		//clicking on the sign up button
		element.click();
		
		//Entering the username in username field
		driver.findElement(By.id("sign-username")).sendKeys("bluebirds980@gmail.com");
		
		//entering the password in the password field 
		driver.findElement(By.id("sign-password")).sendKeys("Shanaya&90");
		
		//clicking on the sign up button
		driver.findElement(By.xpath("//button[@onclick='register()']")).click();
		
		Thread.sleep(1000);
		
		//Using the alert class to handle the alert
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
	}

}
