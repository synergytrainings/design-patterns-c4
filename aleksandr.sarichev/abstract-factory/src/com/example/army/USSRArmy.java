package com.example.army;

import com.example.armyfactory.USSRArmyCreator;

public class USSRArmy extends Army {
	
	public USSRArmy(int tankCount,int aiplaneCount, int shipsCount) {
		super(tankCount, aiplaneCount,shipsCount,new USSRArmyCreator());
	}

	@Override
	public void attack() {
		System.out.println("USSR ARMY ATTACK !!!!!");
		tanks.forEach(tank-> tank.fire());
		airplanes.forEach(airplane-> airplane.fire());
		ships.forEach(ship-> ship.fire());
	}

}
