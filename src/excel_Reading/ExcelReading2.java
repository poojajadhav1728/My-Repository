package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile = new File("C:\\Users\\Admin\\Desktop\\Selenium files\\Excel_Sheets\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(MyFile);
		Sheet sheet = book.getSheet("Sheet1");
		
		// reading whole row-->using static coding	 
	/*	for(int i=0;i<=2;i++)
		 {
		 String value = sheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println(value);
	 }
*/
		// dynamic coding
		int lastRowNum = sheet.getLastRowNum();
		int totalRowCount = lastRowNum;
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		int totalCellCount = lastCellNum-1;
		System.out.println(totalRowCount);
		System.out.println(totalCellCount);
		for(int i=0;i<totalCellCount;i++)
		{
		String value = sheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println(value);
	
	
	}
	}
}
