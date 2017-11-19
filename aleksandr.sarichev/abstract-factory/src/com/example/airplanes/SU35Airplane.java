package com.example.airplanes;
public class SU35Airplane implements Airplane {
	private static final String NAME = "SU-35";
	
	@Override
	public void fire() {
		System.out.println("Fire " + NAME + " Airplane!");
	}
	@Override
	public  void fly() {
		System.out.println("Fly " + NAME + " Airplane!");
		
	}
	
	

}
