package com.pragim.cricketapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtility {

	static Connection connection = null;

	private ConnectionUtility() {

	}

	public static Connection getConnectionFromOracle() {
		try {

				Class.forName("oracle.jdbc.OracleDriver");
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"system");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}

}
