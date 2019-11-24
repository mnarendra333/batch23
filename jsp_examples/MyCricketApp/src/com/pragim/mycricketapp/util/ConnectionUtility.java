package com.pragim.mycricketapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtility {
	
	
	
		public static Connection getConnectionFromOracle() {
			Connection connection = null;
			try {
				
				Class.forName("oracle.jdbc.OracleDriver");
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return connection;
		}

}
