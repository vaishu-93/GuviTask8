package task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Instantiating the chrome driver
		WebDriver driver = new ChromeDriver();

		//Navigating to the webpage
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//maximizing the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//locating the iframe
		WebElement frameEle=driver.findElement(By.cssSelector("iframe[id='mce_0_ifr']"));
		
		//switching to the iframe
		driver.switchTo().frame(frameEle);
		
		//locating the p tag and clearing the content
		driver.findElement(By.tagName("p")).clear();
		Thread.sleep(1000);
		
		//Writing the content in the p tag
		driver.findElement(By.tagName("p")).sendKeys("Hello People");
		
		Thread.sleep(1000);
		
		//closing the browser
		driver.quit();
	}

}
