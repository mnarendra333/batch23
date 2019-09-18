class BusDemo
{

	public void getBusses(Bus[] busses, String busType)
	{
		
		
		for(int i=0;i<busses.length;i++)
		{
			Bus obj = busses[i];
			if(obj.getBusType().equals(busType))
			{
				
				
				System.out.println(obj.getBusId()+" "+obj.getBusName()+" "+
				obj.getFare()+" "+obj.getBusType());
				
			}else
			{
				System.out.println("No Busses!!!! with given criteria");
				
			}
			
		}
		
	}
	public void getBusses(Bus[] busses, String busType, double fare)
	{
			
		for(int i=0;i<busses.length;i++)
		{
			Bus busObj = busses[i];
			if(busObj.getBusType().equals(busType) && busObj.getFare() <=fare)
			{
				
				
				System.out.println(busObj.getBusId()+" "+busObj.getBusName()+" "+busObj.getFare()+" "+busObj.getBusType());
				
			}
			
		}
		
	}


	public static void main(String args[])
	{
		
		Bus obj1 = new Bus(1001,"Kaveri",900,"sleeper");
		Bus obj2 = new Bus(1002,"",1000,"semi-sleeper");
		Bus obj3 = new Bus(1003,"Komitla",1900,"sleeper");
		Bus obj4 = new Bus(1004,"MorningStar",2900,"sleeper");
		Bus obj5 = new Bus(1005,"Vaibhav",850,"sleeper");
		Bus obj6 = new Bus(1006,"KMBT",1900,"semi-sleeper");
		Bus obj7 = new Bus(1007,"Orange",3600,"sleeper");
		Bus obj8 = new Bus(1008,"Green",500,"semi-sleeper");
		Bus obj9 = new Bus(1009,"REDT",700,"sleeper");
		Bus obj10 = new Bus(1010,"Test",1000,"semi-sleeper");
		
		
		Bus busses[] = new Bus[]{obj1,obj2,obj3,obj4,obj5,obj6,obj7,obj8,obj9,obj10};
		
	
		
		
		BusDemo obj = new BusDemo();
		obj.getBusses(busses,"non-ac");
		
		System.out.println("============================================");
		obj.getBusses(busses,"sleeper",900);
		
		
	}


}