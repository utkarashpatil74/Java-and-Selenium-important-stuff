package SeleniumPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/utkarshdb","root","root");
		
		Statement s=con.createStatement();
		
		String query="Select * from employee";
		
		ResultSet set=s.executeQuery(query);
		
		int empId;
		
		if(set.next()) {
			
		}
		
		if(set.next()) {
			
			empId=set.getInt("EmpId");
			System.out.println(empId);
			
		}

		
		
	}

}
