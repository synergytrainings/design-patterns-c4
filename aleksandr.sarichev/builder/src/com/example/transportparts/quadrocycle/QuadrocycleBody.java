package com.example.transportparts.quadrocycle;

import com.example.transportparts.*;

public class QuadrocycleBody extends Body {


	@Override
	public void subscribe(Wheel wheel) {
		System.out.println("Subscribe wheel to quadrocycle body");
		
	}

	@Override
	public void subscribe(Headlight headlight) {
		System.out.println("Subscribe headlight to quadrocycle body");	
	}

	@Override
	public void subscribe(Engine engine) {
		System.out.println("Subscribe engine to quadrocycle body");
		
	}

}
