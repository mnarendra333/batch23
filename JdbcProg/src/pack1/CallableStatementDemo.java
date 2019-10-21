package pack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo {

	public static void main(String[] args) {
		
		try {
			Connection connection = ConnectionUtility.getConnectionFromOracle();
			CallableStatement cstmt = connection.
					prepareCall("{call employee_proc(?,?,?)}");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter eid");
			int eid = sc.nextInt();
			cstmt.setInt(1, eid);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.NUMERIC);
			
			cstmt.execute();
			
			String empName = cstmt.getString(2);
			int exp = cstmt.getInt(3);
			System.out.println(empName+" is having "+exp+" yrs of exp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
