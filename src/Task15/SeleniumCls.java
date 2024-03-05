package Task15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Creating an object for ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//Opening the google webpage
		driver.get("https://www.google.com/");
		
		//Maximizing the window
		driver.manage().window().maximize();
		
		//Searching for Selenium browser driver 
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium Browser Driver");

		
		Thread.sleep(100);
		
		//closing the browser
		driver.close();
	}

}
