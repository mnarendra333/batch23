package pack1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectPic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection conn = 
			ConnectionUtility.getConnectionFromOracle();
			
			PreparedStatement pstmt = conn.prepareStatement
				("select pro_pic from product where pro_id=?");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter product id");
			//read the product data
			int pid = sc.nextInt();
			
			pstmt.setInt(1, pid);
			ResultSet rs = pstmt.executeQuery();
			InputStream is = null;
			FileOutputStream fos = new 
FileOutputStream("C:/Users/sapuser/Desktop/targetfol/output.jpg");
			
			if(rs.next()) {
				is = rs.getBinaryStream(1);
			}
			
			int k;
			while ((k = is.read())!=-1) {
				fos.write((char)k);
			}
			System.out.println("Done!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
