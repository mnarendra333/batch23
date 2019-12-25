package com.pragim.springdiwithconstructor;

public class Traveller {
	
	
	
	
	
	private Vehicle vehicle;
	
	public Traveller(Vehicle vehicle) {
		System.out.println("i am from constructor");
		this.vehicle = vehicle;
	}
	
	public void startJourney() {
		vehicle.start();
		vehicle.stop();
	}

}
