package misc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_review {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
	
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//xpath for search textfield
				Thread.sleep(4000);
				driver.findElement(By.name("q")).sendKeys("dell laptop i7");
				//click on button
				//WebElement search =driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
				Thread.sleep(4000);
				WebElement search =driver.findElement(By.xpath("//button[@type='submit']"));
				search.click();
				
				//printing review text
				Thread.sleep(4000);
			//	WebElement review1 = driver.findElement(By.xpath("//div//span[text()='Be the first to Review this product']"));
			//	review1.click();
				
				WebElement review = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[6]"));
				//review.click();
				Thread.sleep(4000);
				System.out.println(review.getText());
				
				Thread.sleep(4000);
				WebElement rating = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[4]"));
				//rating.click();
				Thread.sleep(4000);
				System.out.println(rating.getText());
		
		

	}

}
