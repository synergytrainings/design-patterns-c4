package com.example.tanksfactory;

import com.example.tanks.T34Tank;
import com.example.tanks.Tank;

public class T34TankCreator implements TankCreator{

	@Override
	public Tank getTank() {
		return new T34Tank();
	}

}
