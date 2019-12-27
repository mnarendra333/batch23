package com.pragim.autowiringusingannotations;

import org.springframework.stereotype.Component;

@Component
public class Remote {
	
	
	
	public void increseVolume() {
		System.out.println("Volume incresed");
	}
	
	public void decreseVolume() {
		System.out.println("Volume decrese");
	}
	
	public void powerOff() {
		System.out.println("powerOff");
	}
	
	public void powerOn() {
		System.out.println("powerOn");
	}

}
