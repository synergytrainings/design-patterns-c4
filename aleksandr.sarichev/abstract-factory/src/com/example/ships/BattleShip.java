package com.example.ships;
public class BattleShip implements Ship {
	private static final String NAME = "Battle Ship";
	
	@Override
	public void fire() {
		System.out.println("Fire " + NAME + " Ship!");
	}
	@Override
	public  void swim() {
		System.out.println("Swiming " + NAME + " Ship!");
		
	}
	
	

}
