package waitsInSelenium;

import java.time.Duration;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Declare and Initialize Fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(5500));
		//Specify polling time .pollingEvery(Duration.ofMillis(500))
		//Specify what exceptions to ignore .ignoring(NoSuchElementException.class);
		
		driver.get("https://demoqa.com/checkbox");
		
		
		FluentWait<WebDriver> wait1 = new FluentWait <WebDriver>(driver);
		wait1.withTimeout(Duration.ofMillis(50000));
		wait1.pollingEvery(Duration.ofMillis(50));
		wait1.ignoring(Exception.class);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("rct-icon rct-icon-uncheck")));
	}

}
