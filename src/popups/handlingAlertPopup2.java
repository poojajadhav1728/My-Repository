package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlertPopup2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		
		WebElement button1 = driver.findElement(By.xpath("(//button[@class='btn btn-danger'])[1]"));
		
		button1.click();
		
		Thread.sleep(1000);
		
		Alert alt1 = driver.switchTo().alert();
		
		System.out.println(alt1.getText()); 
		
		alt1.accept();
		
		Thread.sleep(2000);

	}

}
