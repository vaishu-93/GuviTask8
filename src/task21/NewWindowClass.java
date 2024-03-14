package task21;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instantiating the chrome driver
		WebDriver driver = new ChromeDriver();

		// Navigating to the webpage
		driver.get("https://the-internet.herokuapp.com/windows");

		// maximizing the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//clicking on the link to open the new window
		driver.findElement(By.linkText("Click Here")).click();

		//Getting the main window handle
		String mainWindowHandle = driver.getWindowHandle();

		//gettting all window handles
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		//iterating through the window handles to check for the child window
		
	
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			//Switching to the child window
			if (!mainWindowHandle.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				
				//getting the text in the child window
				String text = driver.findElement(By.tagName("h3")).getText();
				System.out.println(text);
			}

		}
		
		//closing the child window
		driver.close();
		
		//switching to the main window
		driver.switchTo().window(mainWindowHandle);

		//verifying the url of the main window
		String url = driver.getCurrentUrl();
		System.out.println(url);

		System.out.println("This the active window is the main window");

	}

}
