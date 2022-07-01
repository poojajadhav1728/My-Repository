package arrayListPractice;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arrayList1 {
//not executed
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		driver.get("https://demoqa.com/text-box");
		
		String s="//input[@id='userName']";
		String s1="//input[@id='userEmail']";
		String s2="//input[@id='currentAddress']";
		
		ArrayList al=new ArrayList();
		
		al.add(s);
		al.add(s1);
		al.add(s2);
		System.out.println(al);
		
		WebElement textbox1 = driver.findElement(By.xpath("al.get(0)"));
		textbox1.isEnabled();
		//textbox1.sendKeys("Pooja");
		
	}

}
