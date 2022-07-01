package POM_With_ExcelReading_multipleData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage {
	//1. Data members/ variables
		@FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
		@FindBy(xpath="//a[@target='_self']") private WebElement logoutButton;
		
	//2.Constructor
		public Kite_HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//method
		public void validateUserID(String usernm) 
		{
			String actualUserID=UserID.getText();
			String expectedUserID=usernm;
			
			if(actualUserID.equals(expectedUserID))
			{
				System.out.println("UserID is matching-->TC is passed");
			}
			else
			{
				System.out.println("UserID is not matching-->TC is fail");
			}
			
		}
			public void clickOnLogoutButton() throws InterruptedException
			{
				UserID.click();
				Thread.sleep(200);
				logoutButton.click();
			
		}

}
