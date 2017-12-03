package com.example.transportparts.car;

import com.example.transportparts.*;

public class CarBody extends Body {

	@Override
	public void subscribe(Wheel wheel) {
		System.out.println("Subscribe wheel to car body");
		
	}

	@Override
	public void subscribe(Headlight headlight) {
		System.out.println("Subscribe headlight to car body");	
	}

	@Override
	public void subscribe(Engine engine) {
		System.out.println("Subscribe engine to car body");
		
	}
	

}
