package pack1;

import java.sql.Connection;
import java.sql.Statement;

public class BatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection conn = ConnectionUtility.getConnectionFromOracle();
			Statement stmt1 = conn.createStatement();
			stmt1.
addBatch("insert into employee values(105,'smith',78000,'12-OCT-19')");
stmt1.addBatch("update employee set emp_sal=70000 where emp_id=101");
			stmt1.addBatch("delete from employee where emp_id=104");
			int[] res = stmt1.executeBatch();
			
		
		
			System.out.println(res[0]+" "+res[1]+" "+res[2]);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
