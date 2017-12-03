package com.example.builders;

import java.util.ArrayList;
import java.util.List;

import com.example.transportparts.Body;
import com.example.transportparts.Engine;
import com.example.transportparts.Headlight;
import com.example.transportparts.Wheel;
import com.example.transportparts.car.CarBody;
import com.example.transportparts.car.CarEngine;
import com.example.transportparts.car.CarHeadlight;
import com.example.transportparts.car.CarWheel;
import com.example.transports.Car;
import com.example.transports.Transport;

public class CarBuilder extends TransportBuilder {
	
	private List<CarWheel> carWhells;
	private CarBody carBody;
	private CarEngine carEngine;
	private List<CarHeadlight> carHeadlights;
	
	 public CarBuilder() {
		this.carWhells = new ArrayList<>();
		this.carHeadlights = new ArrayList<>();
	}

	@Override
	public Wheel buildWheel() {
		CarWheel carWheel = new CarWheel();
		this.carWhells.add(carWheel);
		return carWheel;
	}

	@Override
	public Body buildBody() {
		this.carBody = new CarBody();
		return carBody;
	}

	@Override
	public Headlight buildHeadLight() {
		CarHeadlight carHeadlight = new CarHeadlight();
		this.carHeadlights.add(carHeadlight);
		return carHeadlight;
	}

	@Override
	public Engine buildEngine() {
		this.carEngine = new CarEngine();
		return carEngine;
	}

	@Override
	public Transport getTransport() {
		Car car = new Car();
		car.addBody(carBody);
		car.addEngine(carEngine);
		carBody.subscribe(carEngine);
		carHeadlights.forEach(carHeadlight->{
			car.addHeadlight(carHeadlight);
			carBody.subscribe(carHeadlight);
		});
		carWhells.forEach(carWheel->{
			car.addWheel(carWheel);
			carBody.subscribe(carWheel);
		});
		
		System.out.println("Car builds is finished!!!");
		return car;
	}

}
