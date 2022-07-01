package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		JavascriptExecutor j= ((JavascriptExecutor)driver); 
		
		j.executeScript("window.scrollBy(80,900)"); 	// +ve x value--> right hand side, Y value +ve --> down 
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,2000)");	// +ve x value--> right hand side, Y value +ve --> down 
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,500)");		// +ve x value--> right hand side, Y value +ve --> down 
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,-2000)");	// +ve x value--> right hand side, Y value -ve --> up
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,-2000)");	// -ve x value--> left hand side, Y value +ve --> down 
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(-80,-2000)");	// -ve x value--> left hand side, Y value -ve --> up 
		Thread.sleep(2000);
		
	}

}
