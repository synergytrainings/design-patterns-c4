package com.example.transports;

import com.example.transportparts.Engine;


public class Car extends Transport {

	private Engine engine;
	
public void addEngine(Engine engine){
	this.engine = engine;
	
}
}
