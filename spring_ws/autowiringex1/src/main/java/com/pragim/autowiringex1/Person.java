package com.pragim.autowiringex1;

public class Person {

	private Computer computer;

//	public void setComputer(Computer computer) {
//		this.computer = computer;
//	}
	
	public Person(Computer computer) {
		super();
		this.computer = computer;
	}

	public void doWork() {
		computer.start();
		computer.shutDown();
	}

	

}
