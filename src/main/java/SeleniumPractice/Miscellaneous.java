package SeleniumPractice;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Miscellaneous {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/utkarshdb","root","root");
		
		Statement statement=con.createStatement();
		
		String query="Select * from employee";
		
		ResultSet set=statement.executeQuery(query);
		
		while(set.next()) {
			
			int a=set.getInt("empId");
			System.out.println(a);
			String b=set.getString("empName");
			System.out.println(b);
			
		}
		
		
		
	}

}
