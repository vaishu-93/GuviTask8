package Task15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Step 1: Set up the development environment 
		 * Step 2: Create a new Maven project, add the selenium dependency to your 'pom.xml' file 
		 * Step 3: Write the webdriver script
		 */
		// WebDriver is a Interface - so cannot create object of it
		// WebDriver Interface is implemented by various browser drivers classes
		// classes are: ChromeDriver() , EdgeDriver(), FirefoxDriver() etc
		// As WebDriver is a interface, it has abstract methods which are common methods
		// for all the browsers - close(), quit(), get() etc.

		//Creating an object for instantiating Chrome Driver
		WebDriver driver = new ChromeDriver();
		
		//Opening the webpage 
		driver.get("https://www.google.com/");
		
		//maximizing the window
		driver.manage().window().maximize();
		
		//Prints the title of the current page
		System.out.println("Page title: " + driver.getTitle());
		  
		//closing the browser
		driver.quit();
	}

}
