package com.example.army;

import com.example.tanksfactory.TankCreator;

public class GermanyTanksArmy extends TanksArmy {
	
	public GermanyTanksArmy(int tankCount,TankCreator tankCreator) {
		super(tankCount, tankCreator);
	}

	@Override
	public void attack() {
		System.out.println("GERMANY ARMY ATTACK !!!!!");
		tanks.forEach(tank-> tank.fire());
	}

}
