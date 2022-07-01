package actionsStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action2 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Actions act=new Actions(driver);
		//Double click
		WebElement element1 = driver.findElement(By.id("double-click"));
		act.doubleClick(element1).perform();
	}

}
