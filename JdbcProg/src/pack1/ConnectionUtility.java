package pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtility {

	private static Connection conn = null;

	private ConnectionUtility() {

	}

	public static Connection getConnectionFromOracle() {
		try {
			if (conn == null) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
