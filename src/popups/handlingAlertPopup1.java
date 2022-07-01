package popups;

import java.awt.Button;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlertPopup1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		button1.click();
		
		Thread.sleep(1000);
		
		//to handle alert popup, we need to switch selenium focus from main page to alert popup
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText()); 	//print text present in a alert popup.
		
		alt.accept(); 		 // click on ok button.
		
		Thread.sleep(2000);
	}

}
