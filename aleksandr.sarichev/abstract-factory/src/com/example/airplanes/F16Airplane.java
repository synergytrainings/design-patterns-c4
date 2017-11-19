package com.example.airplanes;
public class F16Airplane implements Airplane {
	private static final String NAME = "F-16";
	
	@Override
	public void fire() {
		System.out.println("Fire " + NAME + " Airplane!");
	}
	@Override
	public  void fly() {
		System.out.println("Fly " + NAME + " Airplane!");	
	}
	
	

}
