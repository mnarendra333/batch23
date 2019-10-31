package pack1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TrnsactionMgt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		int res1=0,res2=0,res3=0;
		try {
			
			conn = ConnectionUtility.getConnectionFromOracle();
			//step-1
			conn.setAutoCommit(false);
			
			Statement stmt1 = conn.createStatement();
			res1 = 
	stmt1.executeUpdate("delete from employee where emp_id=101");
			Statement stmt2 = conn.createStatement();
			res2 = 
	stmt2.executeUpdate("update product_tab set p_name='Dell-Inspiron5030',price=90000 where p_id=10003");
			Statement stmt3 = conn.createStatement();
			res3 = stmt3.executeUpdate("insert into seller values(3,'Bangl','HindustanElc')");
			conn.commit();
			
		} catch (Exception e) {
			System.out.println(res1+" "+res2+" "+res3);
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

	}

}
