package POM_With_ExcelReading_multipleData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_PIN_Page
{
	//1. data members/variables
			@FindBy(id = "pin") private WebElement PIN;
			@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
			
		//2. constructor
			public Kite_PIN_Page(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
		//3.method
			public void sendPIN(String kite_pin)
			{
				PIN.sendKeys(kite_pin);
			}
			public void clickOnContinueButton()
			{
				continueButton.click();	
			}
}
