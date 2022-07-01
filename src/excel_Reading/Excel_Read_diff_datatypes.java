package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Read_diff_datatypes {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile = new File("C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium files\\\\Excel_Sheets\\\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		int totalRowCount = sheet.getLastRowNum();
		int totalCellCount = sheet.getRow(totalRowCount).getLastCellNum()-1;
		for(int i=0;i<=totalRowCount;i++)
		{
		for(int j=0;j<=totalCellCount;j++)
		{
		Cell cell = sheet.getRow(i).getCell(j);
		CellType type = cell.getCellType();
		if(type==CellType.STRING)
		{
		System.out.print(cell.getStringCellValue()+" ");
		}
		else if (type==CellType.BOOLEAN)
		{
		System.out.print(cell.getBooleanCellValue()+" ");
		}
		else if (type==CellType.NUMERIC)
		{
		System.out.print(cell.getNumericCellValue()+" ");
		}
		}
		System.out.println();
			}
		}
			
	}


