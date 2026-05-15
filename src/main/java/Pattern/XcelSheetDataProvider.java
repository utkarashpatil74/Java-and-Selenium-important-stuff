package Pattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class XcelSheetDataProvider {

	
	@DataProvider(name="testData")
	public Object[][] getXcelData() throws IOException {
		return ReadXcel("register");
	}
	
	
	
	
	public static Object[][] ReadXcel(String sheetName) throws IOException{
		
		File file=new File(System.getProperty("user.dir")+"\\OpenCartTestData.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook workBook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workBook.getSheet(sheetName);
		
		int row=sheet.getLastRowNum();
		
		int column=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[row][column];
		
		for(int i=0;i<row;i++) {
			
			XSSFRow row1=sheet.getRow(i+1);
			
			for(int j=0;j<column;j++) {
				
				Cell cell=row1.getCell(j);
				
				CellType cellType=cell.getCellType();
				
				switch(cellType) {
				case STRING:
					data[i][j]=cell.getStringCellValue();
					break;
				case BOOLEAN:
					data[i][j]=String.valueOf(cell.getBooleanCellValue());
					break;
				case NUMERIC:
					data[i][j]=String.valueOf(cell.getNumericCellValue());
					break;
				}
			}
		}
		
		return data;
		
	}

}
