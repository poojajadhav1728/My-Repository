package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead_total_sheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile = new File("C:\\Users\\Admin\\Desktop\\Selenium files\\Excel_Sheets\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(MyFile);
		 Sheet sheet = book.getSheet("Sheet1");
		// read total sheet using static coding
		for(int i=0;i<=1;i++)	//row 0 & 1
		{
		for(int j=0;j<=2;j++)
		{
		String value =sheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+"|| ");
		}
		System.out.println();

	}

	}}
