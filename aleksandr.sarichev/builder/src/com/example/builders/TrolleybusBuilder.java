package com.example.builders;

import java.util.ArrayList;
import java.util.List;

import com.example.transportparts.Body;
import com.example.transportparts.Engine;
import com.example.transportparts.Headlight;
import com.example.transportparts.Wheel;
import com.example.transportparts.trolleybus.TroleybusHeadlight;
import com.example.transportparts.trolleybus.TroleybusWheel;
import com.example.transportparts.trolleybus.TrolleybusBody;
import com.example.transportparts.trolleybus.TrolleyRod;
import com.example.transports.Transport;
import com.example.transports.Trolleybus;

public class TrolleybusBuilder extends TransportBuilder {
	
	
	private List<TroleybusWheel> trolleybusWhells;
	private TrolleybusBody trolleybusBody;
	private List<TroleybusHeadlight> trolleybusHeadlights;
	private List<TrolleyRod> trolleybusRods;
	
	 public TrolleybusBuilder() {
		this.trolleybusWhells = new ArrayList<>();
		this.trolleybusHeadlights = new ArrayList<>();
		this.trolleybusRods = new ArrayList<>(2);
	}

	@Override
	public Wheel buildWheel() {
		TroleybusWheel trolleybusWheel = new TroleybusWheel();
		this.trolleybusWhells.add(trolleybusWheel);
		return trolleybusWheel;
	}

	@Override
	public Body buildBody() {
		this.trolleybusBody = new TrolleybusBody();
		TrolleyRod rod1 = new TrolleyRod();
		TrolleyRod rod2 = new TrolleyRod();
		this.trolleybusRods.add(rod1);
		this.trolleybusRods.add(rod2);
		trolleybusRods.forEach(rod->{
			trolleybusBody.subscribe(rod);
		});
		
		return trolleybusBody;
	}

	@Override
	public Headlight buildHeadLight() {
		TroleybusHeadlight trolleybusHeadlight = new TroleybusHeadlight();
		this.trolleybusHeadlights.add(trolleybusHeadlight);
		return trolleybusHeadlight;
	}

	@Override
	public Engine buildEngine() {
	return null;
	}

	@Override
	public Transport getTransport() {
		Trolleybus trolleybus = new Trolleybus();
		trolleybus.addBody(trolleybusBody);
	
		trolleybusRods.forEach(rod->{
			trolleybus.addRod(rod);
		});
	
		trolleybusHeadlights.forEach(trolleybusHeadlight->{
			trolleybus.addHeadlight(trolleybusHeadlight);
			trolleybusBody.subscribe(trolleybusHeadlight);
		});
		trolleybusWhells.forEach(trolleybusWhell->{
			trolleybus.addWheel(trolleybusWhell);
			trolleybusBody.subscribe(trolleybusWhell);
		});
	
		System.out.println("Trolleybus builds is finished!!!");
		return trolleybus;
	}

}
