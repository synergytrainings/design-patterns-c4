package com.example.transports;

import java.util.ArrayList;
import java.util.List;

import com.example.transportparts.*;

public abstract class Transport {

	protected List<Wheel> wheels;
	protected Body body;
	protected List<Headlight> headlights;
	
	public Transport(){
		wheels = new ArrayList<>();
		headlights = new ArrayList<>();
		
	}
	
	public void addWheel(Wheel wheel){
		wheels.add(wheel);
	}
	
	public void addHeadlight(Headlight headlight){
		headlights.add(headlight);
	}
	
	public void addBody(Body body){
		this.body = body;
	}
}
