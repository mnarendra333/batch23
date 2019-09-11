class Bus
{
	
	private int busId;
	private String busName;
	private double fare;
	private String busType;
	
	
	public Bus(int busId, String busName, double fare, String busType)
	{
		this.busId = busId;
		this.busName  = busName;
		this.fare = fare;
		this.busType = busType;
		
	}
		
	public int getBusId()
	{
		
		return busId;
	}
	public String getBusName()
	{
		
		return busName;
	}
	
	public double getFare()
	{
		
		return fare;
	}
	
	public String getBusType()
	{
		
		return busType;
	}



}