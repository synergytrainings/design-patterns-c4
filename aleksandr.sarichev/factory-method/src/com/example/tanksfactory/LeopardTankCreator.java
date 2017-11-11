package com.example.tanksfactory;

import com.example.tanks.LeopardTank;
import com.example.tanks.Tank;

public class LeopardTankCreator implements TankCreator{

	@Override
	public Tank getTank() {
		return new LeopardTank();
	}

}
