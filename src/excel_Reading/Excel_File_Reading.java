package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File_Reading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile=new File("C:\\Users\\Admin\\Desktop\\Selenium files\\Excel_Sheets\\Book1.xlsx") ;
		
		
		String name1=WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name1);
		String name2=WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(name2);
		
		/*
		  double num1=WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		 
		System.out.println(num1);
		double num2=WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(num2);
		boolean value1=WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
		System.out.println(value1);
		boolean value2=WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
		System.out.println(value2);
		String password1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(password1);

		String password2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(password2);
		*/
				 
		
	}

}
