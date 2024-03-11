package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Instantiating the chrome driver
		WebDriver driver = new ChromeDriver();

		// Navigating to the webpage
		driver.get("https://jqueryui.com/datepicker/");

		// maximizing thw window
		driver.manage().window().maximize();

		// using implicit wait to wait for 20 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Switching to the iframe which contains the date picker
		WebElement frameEle=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameEle);
		
		//clicking on the webelement to select the date
		WebElement dateEle=driver.findElement(By.id("datepicker"));
		dateEle.click();
		
		//identifiying the table to select the date
		WebElement table=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		
		//locating the element to be selected
		WebElement date=table.findElement(By.xpath("//tr[6]//td[1]"));
		
		date.click();
		
		
		Thread.sleep(1000);
		
		
		//printing the selected date
		String dateSelected=dateEle.getAttribute("value");
		
		System.out.println("The date selected is :" +dateSelected);
		
		//closing the browser
		driver.quit();
	}

}
