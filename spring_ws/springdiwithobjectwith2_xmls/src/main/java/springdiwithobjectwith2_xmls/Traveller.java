package springdiwithobjectwith2_xmls;

import java.util.List;

public class Traveller {
	
	private Vehicle vehicle;
	
	
	
	public void setVehicle(Vehicle vehicle){
		this.vehicle = vehicle;
	}
	
	
	public void startJourny(){
		
		vehicle.start();
		vehicle.stop();
	}
	

}
