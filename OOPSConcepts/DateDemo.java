import java.util.Date;
import java.text.SimpleDateFormat;
class DateDemo
{

		public static void main(String args[])
		{
			
			Date date = new Date();
			System.out.println(date);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss z");
			String todaysDate = sdf.format(date);
			System.out.println(todaysDate);
		}

}