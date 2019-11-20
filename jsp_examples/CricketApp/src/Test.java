import java.sql.Connection;

import com.pragim.cricketapp.util.ConnectionUtility;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Connection con1 = ConnectionUtility.getConnectionFromOracle();
		Connection con2 = ConnectionUtility.getConnectionFromOracle();

		
		System.out.println(con1.hashCode()+" "+con2.hashCode());
	}

}
