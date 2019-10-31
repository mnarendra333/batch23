package pack1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class DatabaseMetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection conn = ConnectionUtility.getConnectionFromOracle();
			DatabaseMetaData metaData = conn.getMetaData();
			System.out.println(metaData.getMaxColumnsInTable());
			System.out.println(metaData.getUserName());
			System.out.println(metaData.getMaxTableNameLength());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
