import java.util.List;
import java.util.ArrayList;
class BusDemo
{
	
	
		void getBusses(List<Bus> list, String busType)
		{
			
			for(Bus bus:list)
			{
				if(bus.getBusType().equals("AC"))
					System.out.println(bus);
				
			}
			
			
		}
	
	
		public static void main(String args[])
		{
		
		
			Bus b1 = new Bus("KA10056","kaveri","AC","bangl","viz",1500);
			Bus b2 = new Bus("KA10080","mosrningstart","AC","bangl","viz",2500);
			Bus b3 = new Bus("KA10090","komitla","Non-AC","bangl","viz",3500);
			Bus b4 = new Bus("KA10082","rajesh","AC","hyd","viz",500);
			Bus b5 = new Bus("KA10093","biju","Non-AC","bangl","viz",1500);
			Bus b6 = new Bus("KA10088","mbbt","sleeper","chenni","bangl",500);
			
			List<Bus> list = new ArrayList<Bus>();
			list.add(b1);
			list.add(b2);
			list.add(b3);
			list.add(b4);
			list.add(b5);
			list.add(b6);
			
			
			BusDemo obj = new BusDemo();
			obj.getBusses(list,"AC");
			
			
			
		}
}