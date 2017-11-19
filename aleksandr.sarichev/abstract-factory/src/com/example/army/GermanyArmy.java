package com.example.army;

import com.example.armyfactory.GermanyArmyCreator;

public class GermanyArmy extends Army {
	
	public GermanyArmy(int tankCount,int aiplaneCount, int shipsCount) {
		super(tankCount, aiplaneCount,shipsCount,new GermanyArmyCreator());
	}

	@Override
	public void attack() {
		System.out.println("GERMANY ARMY ATTACK !!!!!");
		tanks.forEach(tank-> tank.fire());
		airplanes.forEach(airplane-> airplane.fire());
		ships.forEach(ship-> ship.fire());
	}

}
