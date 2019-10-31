package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection conn = ConnectionUtility.getConnectionFromOracle();
			PreparedStatement pstmt = conn.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			for (int i = 1; i <=metaData.getColumnCount(); i++) {
				System.out.print(metaData.getColumnName(i)+"\t");
			}
//			System.out.println();
//			while (rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getDate(4));
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
