package com.example.builders;

import java.util.ArrayList;
import java.util.List;

import com.example.transportparts.Body;
import com.example.transportparts.Engine;
import com.example.transportparts.Headlight;
import com.example.transportparts.Wheel;
import com.example.transportparts.vehicles.VehicleBody;
import com.example.transportparts.vehicles.VehicleHeadlight;
import com.example.transportparts.vehicles.VehicleWheel;
import com.example.transports.Transport;
import com.example.transports.Vehicle;

public class VehicleBuilder extends TransportBuilder {
	
	private List<VehicleWheel> vehicleWhells;
	private VehicleBody vehicleBody;
	private List<VehicleHeadlight> vehicleHeadlights;
	
	 public VehicleBuilder() {
		this.vehicleWhells = new ArrayList<>();
		this.vehicleHeadlights = new ArrayList<>();
	}

	@Override
	public Wheel buildWheel() {
		VehicleWheel vehicleWhell = null;
		if(vehicleWhells.size() < 2){
		vehicleWhell = new VehicleWheel();
		this.vehicleWhells.add(vehicleWhell);
		}
		return vehicleWhell;
	}

	@Override
	public Body buildBody() {
		this.vehicleBody = new VehicleBody();
		return vehicleBody;
	}

	@Override
	public Headlight buildHeadLight() {
		VehicleHeadlight vehicleHeadlight = new VehicleHeadlight();
		this.vehicleHeadlights.add(vehicleHeadlight);
		return vehicleHeadlight;
	}

	@Override
	public Engine buildEngine() {
	return null;
	}

	@Override
	public Transport getTransport() {
		Vehicle vehicle = new Vehicle();
		vehicle.addBody(vehicleBody);
		
		
		vehicleHeadlights.forEach(vehicleHeadlight->{
			vehicle.addHeadlight(vehicleHeadlight);
			vehicleBody.subscribe(vehicleHeadlight);
		});
		vehicleWhells.forEach(carWheel->{
			vehicle.addWheel(carWheel);
			vehicleBody.subscribe(carWheel);
		});
		
		System.out.println("Vehicle builds is finished!!!");
		return vehicle;
	}

}
