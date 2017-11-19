package com.example.armyfactory;

import com.example.airplanes.Airplane;
import com.example.airplanes.F16Airplane;
import com.example.airplanes.SU35Airplane;
import com.example.ships.AircraftCarrier;
import com.example.ships.Ship;
import com.example.ships.Submarine;
import com.example.tanks.M1AbramsTank;
import com.example.tanks.T34Tank;
import com.example.tanks.Tank;

public class USSRArmyCreator implements ArmyCreator{

	@Override
	public Tank getTank() {
		return new T34Tank();
	}

	@Override
	public Ship getShip() {
		return new Submarine();
	}

	@Override
	public Airplane getAirplane() {
		return new SU35Airplane();
	}

}
