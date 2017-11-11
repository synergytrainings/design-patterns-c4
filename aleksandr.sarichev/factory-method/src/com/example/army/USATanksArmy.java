package com.example.army;

import com.example.tanksfactory.TankCreator;

public class USATanksArmy extends TanksArmy {
	
	public USATanksArmy(int tankCount,TankCreator tankCreator) {
		super(tankCount, tankCreator);
	}

	@Override
	public void attack() {
		System.out.println("USA ARMY ATTACK !!!!!");
		tanks.forEach(tank-> tank.fire());
	}

}
