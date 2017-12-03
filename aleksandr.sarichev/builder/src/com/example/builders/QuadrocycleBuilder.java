package com.example.builders;

import java.util.ArrayList;
import java.util.List;

import com.example.transportparts.Body;
import com.example.transportparts.Engine;
import com.example.transportparts.Headlight;
import com.example.transportparts.Wheel;
import com.example.transportparts.quadrocycle.QuadrocycleBody;
import com.example.transportparts.quadrocycle.QuadrocycleEngine;
import com.example.transportparts.quadrocycle.QuadrocycleHeadlight;
import com.example.transportparts.quadrocycle.QuadrocycleWheel;
import com.example.transports.Quadrocycle;
import com.example.transports.Transport;

public class QuadrocycleBuilder extends TransportBuilder {
	
	
	private List<QuadrocycleWheel> quadrocycleWhells;
	private QuadrocycleBody quadrocycleBody;
	private QuadrocycleEngine quadrocycleEngine;
	private List<QuadrocycleHeadlight> quadrocycleHeadlights;
	
	 public QuadrocycleBuilder() {
		this.quadrocycleWhells = new ArrayList<>();
		this.quadrocycleHeadlights = new ArrayList<>();
	}

	@Override
	public Wheel buildWheel() {
		QuadrocycleWheel quadrocycleWheel = new QuadrocycleWheel();
		this.quadrocycleWhells.add(quadrocycleWheel);
		return quadrocycleWheel;
	}

	@Override
	public Body buildBody() {
		this.quadrocycleBody = new QuadrocycleBody();
		return quadrocycleBody;
	}

	@Override
	public Headlight buildHeadLight() {
		QuadrocycleHeadlight quadrocycleHeadlight = new QuadrocycleHeadlight();
		this.quadrocycleHeadlights.add(quadrocycleHeadlight);
		return quadrocycleHeadlight;
	}

	@Override
	public Engine buildEngine() {
		this.quadrocycleEngine = new QuadrocycleEngine();
		return quadrocycleEngine;
	}

	@Override
	public Transport getTransport() {
		Quadrocycle quadrocycle = new Quadrocycle();
		quadrocycle.addBody(quadrocycleBody);
		quadrocycle.addEngine(quadrocycleEngine);
		quadrocycleBody.subscribe(quadrocycleEngine);
		quadrocycleHeadlights.forEach(quadrocycleHeadlight->{
			quadrocycle.addHeadlight(quadrocycleHeadlight);
			quadrocycleBody.subscribe(quadrocycleHeadlight);
		});
		quadrocycleWhells.forEach(quadrocycleWhell->{
			quadrocycle.addWheel(quadrocycleWhell);
			quadrocycleBody.subscribe(quadrocycleWhell);
		});	
		System.out.println("Quadrocycle builds is finished!!!!");
		return quadrocycle;
	}

}
