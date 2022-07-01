package arrayListPractice;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arrayList2 {
//not executed
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		driver.get("https://demoqa.com/radio-button");
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'Radio Button')]"));
	//	button.click();
		Thread.sleep(2000);
		String s="//input[@id='yesRadio']";
		String s1="//input[@id='impressiveRadio']";
		String s2="//input[@id='noRadio']";
		
		ArrayList al=new ArrayList();
		
		al.add(s);
		al.add(s1);
		al.add(s2);
		System.out.println(al);
		
		WebElement textbox1 = driver.findElement(By.xpath("al.get(0)"));
		textbox1.click();
		WebElement textbox2 = driver.findElement(By.xpath("al.get(1)"));
		//textbox2.click();
		WebElement textbox3 = driver.findElement(By.xpath("al.get(2)"));
		//textbox3.click();
		
		
	}

}
