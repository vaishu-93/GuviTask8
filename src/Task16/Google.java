package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Google {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		//Initializing the Webdriver object 
		WebDriver driver=new FirefoxDriver();
	
		//Using get method to navigate to the url
		driver.navigate().to("https://www.google.com");
		
		//maximizing the window
		driver.manage().window().maximize();
		
		//Getting the url of the current page
		String currentUrl=driver.getCurrentUrl();
		
		//display the url
		System.out.println("THe URL of the page is: "+currentUrl);
		
		driver.close();
	}
}
