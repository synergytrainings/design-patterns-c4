package com.example.armyfactory;

import com.example.airplanes.Airplane;
import com.example.airplanes.B76Airplane;
import com.example.ships.BattleShip;
import com.example.ships.Ship;
import com.example.tanks.LeopardTank;
import com.example.tanks.Tank;

public class GermanyArmyCreator implements ArmyCreator{

	@Override
	public Tank getTank() {
		return new LeopardTank();
	}

	@Override
	public Ship getShip() {
		return new BattleShip();
	}

	@Override
	public Airplane getAirplane() {
		return new B76Airplane();
	}

}
