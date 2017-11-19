package com.example.airplanes;
public class B76Airplane implements Airplane {
	private static final String NAME = "B-76";
	
	@Override
	public void fire() {
		System.out.println("Fire " + NAME + " Airplane!");
	}
	@Override
	public  void fly() {
		System.out.println("Fly " + NAME + " Airplane!");
		
	}
	
	

}
