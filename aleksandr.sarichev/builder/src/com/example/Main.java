package com.example;

import com.example.builders.CarBuilder;
import com.example.builders.QuadrocycleBuilder;
import com.example.builders.TransportBuilder;
import com.example.builders.TrolleybusBuilder;
import com.example.builders.VehicleBuilder;

public class Main {

	public static void main(String[] args) {

		TransportBuilder quadrocycleBuilder = new QuadrocycleBuilder();
		TransportBuilder carBuilder = new CarBuilder();
		TransportBuilder troleybusBuilder = new TrolleybusBuilder();
		TransportBuilder vehicleBuilder = new VehicleBuilder();
		Director director = new Director();
		director.build(carBuilder);
		director.build(quadrocycleBuilder);
		director.build(troleybusBuilder);
		director.build(vehicleBuilder);

	}

}
