package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File filepat= new File("C:\\Users\\welcome\\Downloads\\list-countries-world-25j.xlsx");
		FileInputStream fi= new FileInputStream(filepat);
	       XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(rows).getLastCellNum();
		
		for(int i=0;i<=rows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<=cols;j++)
			{
				XSSFCell cell = row.getCell(j);
				
				switch(cell.getCellType()) 
				{
				case STRING: System.out.println(cell.getStringCellValue());break;
				case NUMERIC: System.out.println(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
				}
			}
		}
		
	}

}
