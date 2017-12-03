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
	private List<TrolleyRod> trolleybusShtangeq;
	
	 public TrolleybusBuilder() {
		this.trolleybusWhells = new ArrayList<>();
		this.trolleybusHeadlights = new ArrayList<>();
		this.trolleybusShtangeq = new ArrayList<>(2);
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
		TrolleyRod shtanga1 = new TrolleyRod();
		TrolleyRod shtanga2 = new TrolleyRod();
		this.trolleybusShtangeq.add(shtanga1);
		this.trolleybusShtangeq.add(shtanga2);
		trolleybusShtangeq.forEach(shtanga->{
			trolleybusBody.subscribe(shtanga);
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
