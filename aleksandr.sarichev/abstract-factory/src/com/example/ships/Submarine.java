package com.example.ships;
public class Submarine implements Ship {
	private static final String NAME = "Submarine";
	
	@Override
	public void fire() {
		System.out.println("Fire " + NAME + " Ship!");
	}
	@Override
	public  void swim() {
		System.out.println("Swiming " + NAME + " Ship!");
		
	}
	
	

}
