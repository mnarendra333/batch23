package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {

		try {

			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection = DriverManager.getConnection
	("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system","system");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product");
			while (rs.next()) {
				System.out.println
				(rs.getInt(1) + " " + rs.getString(2) + " " + 
				rs.getDouble(3) + " " + rs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
