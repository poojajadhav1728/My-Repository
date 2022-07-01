package Kite_Utility;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import net.bytebuddy.utility.RandomString;

public class Utility 
{
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File MyFile=new File("C:\\Users\\Admin\\Desktop\\Selenium files\\Excel_Sheets\\Book1.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		String myValue = MySheet.getRow(row).getCell(cell).getStringCellValue();
		return myValue;
	}
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String random=RandomString.make(3);
	File dest= new File("C:\\Users\\Admin\\Desktop\\Velocity Automation Testing\\Screenshots\\MyScreenshot"+random+".png");
	org.openqa.selenium.io.FileHandler.copy(src, dest);
	}

	}
