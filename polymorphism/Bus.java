class Bus
{


		
		private String serviceNo;
		private String travelsName;
		private String busType;
		private String source;
		private String dest;
		private double fare;
		
		
		public Bus(String serviceNo, String travelsName, String busType, String source, String dest, double fare)
		{
			this.serviceNo = serviceNo;
			this.travelsName = travelsName;
			this.busType = busType;
			this.source = source;
			this.dest = dest;
			this.fare = fare;
		}
		
		
		public String toString()
		{
			
			return "["+ serviceNo+" "+travelsName+" "+busType+" "+source+" "+dest+" "+fare +"]\n";
		}

		public String getServiceNo()
		{
			
			return serviceNo;
		}
		public String getTravelsName()
		{
			
			return travelsName;
		}
		public String getBusType()
		{
			
			return busType;
		}
		public String getSource()
		{
			
			return source;
		}
		public String getDest()
		{
			
			return dest;
		}
		
		public double getFare()
		{
			return fare;
		}


}