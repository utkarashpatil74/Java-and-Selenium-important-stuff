import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadFromExcelSheet2 {



	@DataProvider(name="tutorialsPoint")
	public static Object[][] getSheetData() throws IOException {
		
		Object[][] data=ReadFromExcelSheet2.excelSheet("register");
		return data;
		
		
	}
	
	public static Object[][] excelSheet(String sheetName) throws IOException {
		
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"//OpenCartTestData.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(ip);
		
		XSSFSheet sheet=book.getSheet(sheetName);
		
		//rows
		int rows=sheet.getLastRowNum();
		
		//column
		int column=sheet.getRow(0).getLastCellNum();
		
		
		Object[][] data=new Object[rows][column];
		
		for(int i=0;i<rows;i++) {
		
			XSSFRow row=sheet.getRow(i+1);
			
			for(int j=0;j<column;j++) {
				
				Cell cell=row.getCell(j);
				
				CellType celltype=cell.getCellType();
				
				
				switch(celltype) {
				
				case STRING:
					data[i][j] =cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j]=String.valueOf((int)cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j]=cell.getBooleanCellValue();
					break;
					
				}
			}
			
		}
		return data;
	}

}
