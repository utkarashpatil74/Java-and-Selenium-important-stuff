import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class ReadFromXcel {
	
	@DataProvider(name="NaveenAutomation")
	public static  Object[][] getNaveenAutomationData() throws IOException {
		Object[][] data=ReadFromXcel.excelSheet("register");
		return data;
	}



	public static Object[][] excelSheet(String sheetName) throws IOException {
		
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\OpenCartTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(ip);
		
		XSSFSheet sheet=workbook.getSheet(sheetName);
		
		int rows=sheet.getLastRowNum();
		int column=sheet.getRow(0).getLastCellNum();
		
		Object[][] ob=new Object[rows][column];
		
		for(int i=0;i<rows;i++) {
			
			XSSFRow row=sheet.getRow(i+1);
			
			for(int j=0;j<column;j++) {
				
				XSSFCell cell=row.getCell(j);
				
				CellType cellType=cell.getCellType();
				
				switch(cellType) {
				
				case STRING:
					ob[i][j]=cell.getStringCellValue();
					break;
				case NUMERIC:
					ob[i][j]=String.valueOf((int)cell.getNumericCellValue());
					break;
				case BOOLEAN:
					ob[i][j]=cell.getBooleanCellValue();
					break;
					
				}
						
			}
		}
		
		return ob;
	}
}
