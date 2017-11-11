package com.example.tanks;
public class T34Tank implements Tank {
	private static final String NAME = "T-34";
	
	@Override
	public void fire() {
		System.out.println("Fire " + NAME + " Tank!");
	}
	@Override
	public  void drive() {
		System.out.println("Drive " + NAME + " Tank!");
		
	}
	
	

}
