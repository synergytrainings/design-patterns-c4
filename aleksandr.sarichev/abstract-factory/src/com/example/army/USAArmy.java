package com.example.army;

import com.example.armyfactory.USAArmyCreator;

public class USAArmy extends Army {
	
	public USAArmy(int tankCount,int aiplaneCount, int shipsCount) {
		super(tankCount, aiplaneCount,shipsCount,new USAArmyCreator());
	}

	@Override
	public void attack() {
		System.out.println("USA ARMY ATTACK !!!!!");
		tanks.forEach(tank-> tank.fire());
		airplanes.forEach(airplane-> airplane.fire());
		ships.forEach(ship-> ship.fire());
	}

}
