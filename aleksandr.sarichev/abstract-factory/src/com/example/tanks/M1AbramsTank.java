package com.example.tanks;
public class M1AbramsTank implements Tank {
	private static final String NAME = "M1_Abrams";

	@Override
	public void fire() {
		System.out.println("Fire " + NAME + " Tank!");
	}
	@Override
	public void drive() {
		System.out.println("Drive " + NAME + " Tank!");
	}
	
	

}
