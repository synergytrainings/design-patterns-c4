package com.example.armyfactory;

import com.example.airplanes.Airplane;
import com.example.ships.Ship;
import com.example.tanks.Tank;

public interface ArmyCreator {
	Tank getTank();
	Ship getShip();
	Airplane getAirplane();
}
