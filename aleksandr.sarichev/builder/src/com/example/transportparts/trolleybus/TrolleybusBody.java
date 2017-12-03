package com.example.transportparts.trolleybus;

import com.example.transportparts.*;

public class TrolleybusBody extends Body{

	@Override
	public void subscribe(Wheel wheel) {
		System.out.println("Subscribe wheel to trolleybus body");
		
	}

	@Override
	public void subscribe(Headlight headlight) {
		System.out.println("Subscribe headlight to trolleybus body");
		
	}

	@Override
	public void subscribe(Engine engine) {
	
		
	}
	
	
	public void subscribe(Rod rod) {
		System.out.println("Subscribe rod to trolleybus body");
		
	}

}
