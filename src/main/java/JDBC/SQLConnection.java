package JDBC;

import static org.testng.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.asserts.SoftAssert;

public class SQLConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		int expId = 2;
		String exEmpName = "Tom";
		int exEmpAge = 25;
		String exEmpDept = "Operations";

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/utkarshdb", "root", "root");

		Statement stmt = con.createStatement();

		String query = "SELECT * FROM utkarshdb.employee";

		ResultSet rs = stmt.executeQuery(query);

		boolean flag = false;
		
		if(rs.next()) {
			
		}
		
		if(rs.next()) {
			
			int empID = rs.getInt("EmpID");
			String empName = rs.getString("EmpName");
			int empAge = rs.getInt("EmpAge");
			String empDept = rs.getString("EmpDept");
			
			
			
			
			
			assertEquals(empID, expId,"Employee ID is not matching");
			assertEquals(empName, exEmpName,"Employee Name is not matching");
			assertEquals(empAge, exEmpAge,"Employee Age is not matching");
			assertEquals(empDept, exEmpDept,"Employee Dept is not matching");
			
	
			
		
			
			
		}
		
//		while (rs.next()) {
//
//			int empID = rs.getInt("EmpID");
//			String empName = rs.getString("EmpName");
//			int empAge = rs.getInt("EmpAge");
//			String empDept = rs.getString("EmpDept");
//
//			assertEquals(empID, expId,"Employee ID is not matching");
//			assertEquals(empName, exEmpName,"Employee Name is not matching");
//			assertEquals(empAge, exEmpAge,"Employee Age is not matching");
//			assertEquals(empDept, exEmpDept,"Employee Dept is not matching");
//
//			break;
//
//		}

		if (flag == true) {

			System.out.println("Assertion was successful | Test passed");
		} else {
			System.out.println("Not passed");
		}

	}

}
