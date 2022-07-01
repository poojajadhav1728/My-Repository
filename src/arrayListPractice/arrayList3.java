package arrayListPractice;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//not executed
public class arrayList3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		driver.get("https://demoqa.com/checkbox");
		
		String s="//span[@class='rct-checkbox']";
		ArrayList al=new ArrayList();
		
		al.add(s);
		System.out.println(al);
		WebElement textbox1 = driver.findElement(By.xpath("al.get(0)"));
		textbox1.isEnabled();
	}

}

