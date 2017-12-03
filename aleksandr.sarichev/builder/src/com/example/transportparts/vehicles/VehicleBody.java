package com.example.transportparts.vehicles;

import com.example.transportparts.*;

public class VehicleBody extends Body {

	@Override
	public void subscribe(Wheel wheel) {
		System.out.println("Subscribe wheel to vehicle body");
		
	}

	@Override
	public void subscribe(Headlight headlight) {
		System.out.println("Subscribe headlight to vehicle body");
		
	}

	@Override
	public void subscribe(Engine engine) {
		
	}

}
