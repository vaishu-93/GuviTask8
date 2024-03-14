package task21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Instantiating the chrome driver
		WebDriver driver = new ChromeDriver();

		// Navigating to the webpage
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		// maximizing the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//switching to the top frame
		WebElement topFrame=driver.findElement(By.xpath("//frame[@name='frame-top']"));
		
		driver.switchTo().frame(topFrame);
		
		//checking the number of frames in the parent frame
		List<WebElement> frameElements =driver.findElements(By.tagName("frame"));
		int numberOfFrames=frameElements.size();
		
		//displaying the number of frames in the top frame
		System.out.println("The top frame has " + numberOfFrames +" frames");
		
		//switching to the left frame
		WebElement leftFrame=driver.findElement(By.xpath("//frame[@name='frame-left']"));
		
		driver.switchTo().frame(leftFrame);
		
		//verifying the text present in the left frame
		String frametext=driver.findElement(By.tagName("body")).getText();
		frametext.contains("LEFT");
		System.out.println("The left frame contains the text 'LEFT'");
		
		//switching to the top frame
		driver.switchTo().parentFrame();
		
		
		Thread.sleep(1000);
		
		//switching to the middle frame
		WebElement middleFrame=driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		
		driver.switchTo().frame(middleFrame);
	
		//verifying the text present in the middle frame
		String frametext1=driver.findElement(By.tagName("body")).getText();
		frametext1.contains("MIDDLE");
		System.out.println("The middle frame contains the text 'MIDDLE'");
		
		//switching to the top frame
		driver.switchTo().parentFrame();
		
		//switching to the right frame
		WebElement rightFrame=driver.findElement(By.xpath("//frame[@name='frame-right']"));
		
		driver.switchTo().frame(rightFrame);
	
		//verifying the text present in the right frame
		String frametext2=driver.findElement(By.tagName("body")).getText();
		frametext2.contains("RIGHT");
		System.out.println("The right frame contains the text 'RIGHT'");
		
		//switching to the main frame
		driver.switchTo().defaultContent();
		
		//switching to the bottom frame
		WebElement bottomFrame=driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		
		driver.switchTo().frame(bottomFrame);
	
		//verifying the text present in the right frame
		String frametext3=driver.findElement(By.tagName("body")).getText();
		frametext3.contains("BOTTOM");
		System.out.println("The bottom frame contains the text 'BOTTOM'");
		
		//switching to the top frame
		driver.switchTo().parentFrame();
		
		//verifying the title of the page
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle="Frames";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("The title is matched");
		}
	}

}
