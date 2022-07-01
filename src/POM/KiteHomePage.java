package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
//1. Data members/ variables
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath="//a[@target='_self']") private WebElement logoutButton;
	
//2.Constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//method
	public void validateUserID() 
	{
		String actualUserID=UserID.getText();
		String expectedUserID="ELR321";
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
		public void clickOnLogoutButton() throws InterruptedException
		{
			UserID.click();
			Thread.sleep(200);
			logoutButton.click();
		
	}
	
}
