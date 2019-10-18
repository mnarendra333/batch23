package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		//step-1
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//step-2
			Connection connection = 
					DriverManager.getConnection
		   ("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			
			//step-3
			Statement stmt = connection.createStatement();
			
			//step-4
			stmt.executeUpdate
	("create table test(id number(10),name varchar2(20))");
			
			int count = stmt.executeUpdate
					("create table test(id number(10),name varchar2(20))");
			
			System.out.println(count+" rows effected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
