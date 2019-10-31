package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class TableSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Connection conn = ConnectionUtility.getConnectionFromOracle();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter table name as input");
			String tabName = sc.next();
			PreparedStatement pstmt = conn.prepareStatement
					("select * from "+tabName);
	
			ResultSet rs = pstmt.executeQuery();
		
			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i <=rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i)+" ");
			}
			System.out.println();
			while (rs.next()) {
				
				for (int i = 1; i <=rsmd.getColumnCount(); i++) {
					
					if(rsmd.getColumnTypeName(i).equals("NUMBER"))
						System.out.print(rs.getInt(i)+"\t");
					else if(rsmd.getColumnTypeName(i).equals("VARCHAR") || rsmd.getColumnTypeName(i).equals("VARCHAR2"))
						System.out.print(rs.getString(i)+"\t");
					else if(rsmd.getColumnTypeName(i).equals("DOUBLE"))
						System.out.print(rs.getDouble(i)+"\t");
					else if(rsmd.getColumnTypeName(i).equals("DATE"))
						System.out.print(rs.getDate(i)+"\t");
					
				}
				System.out.println();
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
