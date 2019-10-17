package pack1;

import java.util.Date;

public class Demo {
	
	static Date date = null;
	public static void main(String[] args) {
		
		date = new Date();
		System.out.println(date.getHours()+" "+date.getMinutes());
		
	}

}
