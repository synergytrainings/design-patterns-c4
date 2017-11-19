package com.example.ships;
public class AircraftCarrier implements Ship {
	private static final String NAME = "Aircraft Carrier";
	
	@Override
	public void fire() {
		System.out.println("Fire " + NAME + " Ship!");
	}
	@Override
	public  void swim() {
		System.out.println("Swiming " + NAME + " Ship!");
		
	}
	
	

}
