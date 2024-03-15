package task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		// Navigating to the webpage
		driver.get("https://phptravels.com/demo/");

		// maximizing the window
		driver.manage().window().maximize();

		//locating the form
		WebElement element1 = driver.findElement(By.className("demo_form"));

		//USing the explicit wait to check if the form is loaded
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element1));

		//entering the name in the first name field
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Yaara");

		//entering the last name in the last name field
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Shion");

		//entering the business name in the field
		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("Yaara Shion");

		//entering in the email id in the mail id field
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("yaara098@gmail.com");

		//getting the numbers to perform the addition
		String num1 = driver.findElement(By.id("numb1")).getText();

		String num2 = driver.findElement(By.id("numb2")).getText();

		Integer x1 = Integer.parseInt(num1);

		Integer x2 = Integer.parseInt(num2);

		Integer res = x1 + x2;

		String result = res.toString();

		//entering the result of addition in the result field
		driver.findElement(By.id("number")).sendKeys(result);

		Thread.sleep(1000);
		//submitting the form
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

		//verfying the text after form submission
		WebElement element2=driver.findElement(By.tagName("h2"));
		
		element2.getText().contains("Thank you!");
		
		System.out.println("The form is submitted successfully");

		//creating the webelement whose screenshot to be taken
		WebElement formElement=driver.findElement(By.className("completed"));
		
		//waiting for the form element to be visible
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(formElement));

		//using the get full page screenshot method to get the full page screenshot
	    File src=((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		
		// getting the path of the directory in which the user is working
		String path = System.getProperty("user.dir");

		// creating the file to save screenshot permanently
		File dest = new File(path + "/screenshots/form.png");

		//copying the screenshot into the permanent file
		FileHandler.copy(src, dest);
	}

}
