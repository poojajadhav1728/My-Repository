package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView {

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
		
		JavascriptExecutor j=((JavascriptExecutor)driver);
		Thread.sleep(3000);
		j.executeScript("arguments[0].scrollIntoView(true);",textbox);
		
		
	}

}
