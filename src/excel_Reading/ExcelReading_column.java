package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReading_column {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File MyFile = new File("C:\\Users\\Admin\\Desktop\\Selenium files\\Excel_Sheets\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(MyFile);
		 Sheet sheet = book.getSheet("Sheet1");
		
		//I want to read one column
		//static coding
/*		 for(int i=0;i<=1;i++)
		 {
		 String value = sheet.getRow(i).getCell(2).getStringCellValue();
		 System.out.println(value);
		 }
*/		
		//Dynamic coding
		 
		 int lastRowNum=sheet.getLastRowNum();
		 int totalRowCount=sheet.getLastRowNum();
		 System.out.println(totalRowCount);
		 for(int i=0;i<=totalRowCount;i++)
		{
		String value = sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println(value);	
		}
	}
}
