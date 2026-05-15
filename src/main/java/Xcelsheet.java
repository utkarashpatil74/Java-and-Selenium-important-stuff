import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Xcelsheet {
	
	@Test(dataProvider="Utkarsh", dataProviderClass = Xcelsheet.class)
	public void test(String searchKey,String productName,String imagesCount) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		System.out.println("SearchKey "+searchKey);
		System.out.println("ProductName "+productName);
		System.out.println("imagesCount "+imagesCount);
		
		
	}
	
	

	@DataProvider(name="Utkarsh")
	public static Object[][] xcelData() throws IOException {
		
		return getXcelData("product");
	}
	
	
	
	public static Object[][] getXcelData(String sheetName) throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//OpenCartTestData.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=book.getSheet(sheetName);
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		
		Object[][] ob=new Object[rows][cols];
		
		for(int i=0;i<rows;i++) {
			
			
			XSSFRow row=sheet.getRow(i+1);
			
			for(int j=0;j<cols;j++) {
				
				Cell cell=row.getCell(j);
				
				CellType type=cell.getCellType();
				
				
				switch(type) {
				
				case STRING:
					ob[i][j]=cell.getStringCellValue();
					break;
				case NUMERIC:
					ob[i][j]=String.valueOf(cell.getNumericCellValue());
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
