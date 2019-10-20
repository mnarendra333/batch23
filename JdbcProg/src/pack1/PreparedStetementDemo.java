package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStetementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//step-2
			Connection connection = 
					DriverManager.getConnection
		   ("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			
			PreparedStatement pstmt = 
	connection.prepareStatement("insert into product values(?,?,?,?)");
			pstmt.setInt(1, 109);
			pstmt.setString(2, "dell-inspiron");
			pstmt.setDouble(3, 60000);
			pstmt.setString(4, "good");
			int count = pstmt.executeUpdate();
			System.out.println(count+" rows effected");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
