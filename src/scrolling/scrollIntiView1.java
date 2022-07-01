package scrolling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntiView1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		WebElement alert = driver.findElement(By.name("enter-name"));
		alert.sendKeys("Pooja");
		
		driver.findElement(By.id("alertbtn")).click();
		
		//1.To handle alert popup, we need to switch selenium focus from main page to alert popup
		Alert alt = driver.switchTo().alert();
				
		//2.Alert is an interface which contains abstract methods-->accept(),dismiss(),getText()
		System.out.println(alt.getText()); 	//print text present in a alert popup.
		Thread.sleep(2000);
				
		//alt.accept(); 		 // click on ok button.
				
		Thread.sleep(2000);	

	}

}
