package com.example.army;

import com.example.tanksfactory.TankCreator;

public class USSRTanksArmy extends TanksArmy {
	
	public USSRTanksArmy(int tankCount,TankCreator tankCreator) {
		super(tankCount, tankCreator);
	}

	@Override
	public void attack() {
		System.out.println("USSR ARMY ATTACK !!!!!");
		tanks.forEach(tank-> tank.fire());
	}

}
