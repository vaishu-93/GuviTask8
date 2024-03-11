package Task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Instantiating the chrome driver
		WebDriver driver = new ChromeDriver();
		
		//maximizing the browser window
		driver.manage().window().maximize();
		
		//Navigating to the url
		driver.navigate().to("https://jqueryui.com/droppable/");

		//using implicit wait to wait for 20 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//using javascript executor for scrolling the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		//Switching to the iframe to locate the elements
		driver.switchTo().frame(0);
		
		//locating the elements
		WebElement element1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement element2 = driver.findElement(By.id("droppable"));
		
		//using the actions class to perform the drag and drop action
		Actions action = new Actions(driver);
		action.dragAndDrop(element1, element2);
		action.build().perform();
		
		//verifying the css property for color change 
		String dropbgcolor=element2.getCssValue("background-color");
		if(dropbgcolor.equals("rgba(255, 250, 144, 1)"))
		{
			System.out.println("Back ground color is changed");
		}
		else
			System.out.println("Background color is not changed");
		
		//verifying if the drag and drop is successful by validating the text
		String expectedText = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable ui-state-highlight']")).getText();
		
		String text = driver.findElement(By.id("droppable")).getText();
		if (text.equalsIgnoreCase(expectedText)) {
			System.out.println("The item is dropped");
		} else
			System.out.println("The item is not dropped");
		
		//closing the browser opened
		driver.quit();
		
	}
}
