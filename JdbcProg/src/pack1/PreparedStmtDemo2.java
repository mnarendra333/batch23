package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStmtDemo2 {

	public static void main(String[] args) {
		
		
		try {
			
			Connection connection = ConnectionUtility.getConnectionFromOracle();
			PreparedStatement pstmt = connection.prepareStatement("insert into product values(?,?,?,?)");
			
			Scanner sc = new Scanner(System.in);
			int count = 0;
			for (int i = 1; i <=3; i++) {
				System.out.println("Enter product Data - "+i);
				int pid = sc.nextInt();
				String pname = sc.next();
				double price = sc.nextDouble();
				String desc = sc.next();
				
				pstmt.setInt(1, pid);
				pstmt.setString(2, pname);
				pstmt.setDouble(3, price);
				pstmt.setString(4, desc);
				
				int executeUpdate = pstmt.executeUpdate();
				if(executeUpdate>0)
					count++;
				
			}
			System.out.println(count+" rows inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
