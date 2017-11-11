package com.example.tanksfactory;

import com.example.tanks.M1AbramsTank;
import com.example.tanks.Tank;

public class M1AbramsTankCreator implements TankCreator{

	@Override
	public Tank getTank() {
		return new M1AbramsTank();
	}

}
