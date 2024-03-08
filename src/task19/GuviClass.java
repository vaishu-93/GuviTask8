package task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Instantiating the chrome driver
		WebDriver driver=new ChromeDriver();
		
		//Navigating to the webpage
		driver.get("https://www.guvi.in/register");
		
		//maximizing thw window
		driver.manage().window().maximize();
		
		//using implicit wait to wait for 20 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//locating the element and entering the name
		driver.findElement(By.id("name")).sendKeys("Vaishali");
		
		//entering the email address in the email field
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bluebirds028@gmail.com");
		
		//entering the password in the password field
		driver.findElement(By.className("password-err")).sendKeys("Anaira$30");
		
		//entering the mobile number
		driver.findElement(By.cssSelector("input[id='mobileNumber']")).sendKeys("9108052962");
		
		//Getting the text by tagname and displaying in the console
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println("This is " + text + " page");
	}

}
