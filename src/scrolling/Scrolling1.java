package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		//driver.findElement(By.id("hide-textbox")).click();
		
		WebElement textbox = driver.findElement(By.id("hide-textbox"));
		textbox.click();
		//In this case--> we want to see the after clicking on hide-->whether the text is hidden or not
		//but we are unable to see this
		//It can be done by using scrollIntoView()

	}

}
