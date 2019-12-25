package com.pragim.springdiwithconstructor;

public class Flight implements Vehicle {

	@Override
	public void start() {
		System.out.println("Flight started");

	}

	@Override
	public void stop() {
		System.out.println("Flight stopped");

	}

}
