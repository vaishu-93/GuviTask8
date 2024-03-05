package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initializing the driver to ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		//Using the navigate to method to open the webpage
		driver.navigate().to("https://www.demoblaze.com/");
		
		//maximizing the window
		driver.manage().window().maximize();
		
		//Getting the title of the webpage
		String actualTitle=driver.getTitle();
		System.out.println("The title of the page is:"+actualTitle);
		String expectedTitle="STORE";
		
		//comparing the title with expected title
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Page Landed on correct Website");
		}
		else
			System.out.println("Page not landed on correct wensite");
		
		driver.close();
	}

}
