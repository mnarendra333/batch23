package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStmtDemoForPicInsert {

	public static void main(String[] args) {
		
		try {
			Connection conn = 
			ConnectionUtility.getConnectionFromOracle();
			
			PreparedStatement pstmt = conn.prepareStatement
			("insert into product values(?,?,?,?,?)");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter product info");
			
			//read the product data
			int pid = sc.nextInt();
			String pname = sc.next();
			double price = sc.nextDouble();
			String desc = sc.next();
			String imagePath = sc.next();
			
			
			File file = new File(imagePath);
			long fileLength = file.length();
			InputStream io = new FileInputStream(imagePath);
			
			
			pstmt.setInt(1, pid);
			pstmt.setString(2, pname);
			pstmt.setDouble(3, price);
			pstmt.setString(4, desc);
			pstmt.setBinaryStream(5, io, fileLength);
			
			int executeUpdate = pstmt.executeUpdate();
			System.out.println(executeUpdate+" recored inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
