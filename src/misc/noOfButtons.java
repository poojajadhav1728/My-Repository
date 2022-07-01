package misc;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class noOfButtons {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println("Number of buttons-->"+buttons.size());

		System.out.println("===================");
		Iterator<WebElement> it1 = buttons.iterator();

		while(it1.hasNext())
		{
			System.out.println(it1.next().getText());

		}
	}

}
