package com.example.armyfactory;

import com.example.airplanes.Airplane;
import com.example.airplanes.F16Airplane;
import com.example.ships.AircraftCarrier;
import com.example.ships.Ship;
import com.example.tanks.M1AbramsTank;
import com.example.tanks.Tank;

public class USAArmyCreator implements ArmyCreator{

	@Override
	public Tank getTank() {
		return new M1AbramsTank();
	}

	@Override
	public Ship getShip() {
		return new AircraftCarrier();
	}

	@Override
	public Airplane getAirplane() {
		return new F16Airplane();
	}

}
