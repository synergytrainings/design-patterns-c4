package com.example.tanks;
public class LeopardTank implements Tank {
	private static final String NAME = "Leopard_1";
	
	@Override
	public void fire() {
		System.out.println("Fire " + NAME + " Tank!");
		
	}
	@Override
	public void drive() {
		System.out.println("Drive " + NAME + " Tank!");
	
	}
	
	

}
