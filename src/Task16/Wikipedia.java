package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) {
		
		//Initializing the driver object to open the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Using the navigate to method to open the webpage
		driver.navigate().to("https://www.wikipedia.org/");
		
		//maximizing the window
		driver.manage().window().maximize();
		
		//Searching for "Artifical Intellignece" in search box
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Navigating to clicking on the History link
		driver.findElement(By.linkText("History")).click();
		
		//Getting the title of the section
		String title=driver.findElement(By.xpath("//span[@id='History']")).getText();
		
		//displaying the title
		System.out.println("The title of the section is :"+title);
		
		//closing the browser opened
		driver.close();
	}
}
