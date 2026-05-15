package JDBC;

import static org.testng.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLPractice {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/utkarshdb","root","root");
		
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/utkarshdb","root", "root");
//
//		Statement stmt = con.createStatement();
//
//		String query = "SELECT * FROM utkarshdb.employee";
//
//		ResultSet rs = stmt.executeQuery(query);
//
//		boolean flag = false;
		
		
		
		
		Statement s=con.createStatement();
		
		String query="SELECT * FROM utkarshdb.employee";
		
		ResultSet set=s.executeQuery(query);
		
		if(set.next()) {
			
			String name=set.getString("EmpName");
			assertEquals(name,"Jerry");
		}
		
		
	}
}