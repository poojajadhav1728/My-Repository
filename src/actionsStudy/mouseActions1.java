package actionsStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions1 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Actions act=new Actions(driver);
		
		//WebElement element1 = driver.findElement(By.xpath("//a[text()='New Tours']"));
		
		//act.moveToElement(element1).click().build().perform();
		
		WebElement element2 = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
	//	act.moveToElement(element2).click().build().perform(); //1st way
	//	act.moveToElement(element2).perform();	//2nd way
	//	act.click().perform();
	//	act.click(element2).perform();//3rd way
		
		//right click/ context click
		//act.contextClick(element2).perform();	//1st way
	//	act.moveToElement(element2).contextClick().build().perform();	//2nd way
		act.moveToElement(element2).perform();	//3rd way
		act.click().perform();
		
		
	}
		
		

}
